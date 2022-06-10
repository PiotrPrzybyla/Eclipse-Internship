import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Calculator {
    public static int Add(String numbers) throws NegativeNumberException {
        String[] newLineNumbers = (numbers.split("\n"));
        ArrayList<Integer> intNumbers = new ArrayList<>();
        ArrayList<String> strNumbers = new ArrayList<>();
        String delimiter = ",";
        boolean isComma = true;
        if(newLineNumbers[0].contains("//")){
            delimiter = newLineNumbers[0].split("//")[1];
            isComma = false;
        }
        if (isComma){
            for (String newLineNumber : newLineNumbers) {
                String[] strNumber = newLineNumber.split(delimiter);
                strNumbers.addAll(Arrays.asList(strNumber));
            }
        }else {
            for (int i =1; i<newLineNumbers.length;i++) {
                String[] strNumber = newLineNumbers[i].split(delimiter);
                Collections.addAll(strNumbers, strNumber);
        }}


        int result = 0;
        StringBuilder negativeNumbers = new StringBuilder();
        if(!numbers.equals("")){
            for (String strNumber: strNumbers) {
                intNumbers.add(Integer.parseInt(strNumber));
            }
            for (int number: intNumbers) {
                if(number <0 ) negativeNumbers.append(number).append(" ");
                result+=number;
            }
            if(!negativeNumbers.toString().equals("")){
                throw new NegativeNumberException("negatives not allowed. Negatives: " + negativeNumbers);
            }
        }

        return result;


    }
}

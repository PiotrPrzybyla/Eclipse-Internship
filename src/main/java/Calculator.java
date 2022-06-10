import java.util.ArrayList;

public class Calculator {
    public static int Add(String numbers) {
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
            for (int i =0; i<newLineNumbers.length;i++) {
            String[] strNumber = newLineNumbers[i].split(delimiter);
            for (int j = 0; j < strNumber.length; j++) {
                strNumbers.add(strNumber[j]);
            }
        }}else {
            for (int i =1; i<newLineNumbers.length;i++) {
                String[] strNumber = newLineNumbers[i].split(delimiter);
                for (int j = 0; j < strNumber.length; j++) {
                    strNumbers.add(strNumber[j]);
                }
        }}


        int result = 0;
        if(numbers != ""){
            for (String strNumber: strNumbers) {
                intNumbers.add(Integer.parseInt(strNumber));
            }
            for (int number: intNumbers) {
                result+=number;
            }
        }

        return result;


    }
}

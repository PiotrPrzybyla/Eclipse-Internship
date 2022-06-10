import java.util.ArrayList;

public class Calculator {
    public int Add(String numbers) {
        String[] commaNumbers = (numbers.split(","));
        ArrayList<Integer> intNumbers = new ArrayList<>();
        ArrayList<String> strNumbers = new ArrayList<>();
        for (String commaNumber: commaNumbers) {
            String[] strNumber = commaNumber.split("\n");
            for (int i = 0; i < strNumber.length; i++) {
                strNumbers.add(strNumber[i]);
            }
        }
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

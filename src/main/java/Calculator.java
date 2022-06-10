import java.util.ArrayList;

public class Calculator {
    public int Add(String numbers) {
        String[] strNumbers = (numbers.split(","));
        ArrayList<Integer> intNumbers = new ArrayList<>();

        int result = 0;
        if(numbers != ""){  for (int i = 0; i < strNumbers.length; i++) {
            intNumbers.add(Integer.parseInt(strNumbers[i]));
            result+=intNumbers.get(i);
        }}

        return result;


    }
}

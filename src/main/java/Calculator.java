public class Calculator {
    public int Add(String numbers) {
        String[] strNumbers = (numbers.split(","));
        int intNumbers[] = new int[2];
        int result = 0;
        if(numbers != ""){  for (int i = 0; i < strNumbers.length; i++) {
            intNumbers[i] = Integer.parseInt(strNumbers[i]);
            result+=intNumbers[i];
        }}

        return result;


    }
}

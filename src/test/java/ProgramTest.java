import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgramTest {

    @Test
    public void step1Test(){
        try {
            assertEquals(3,Calculator.Add("1,2"));
            assertEquals(2,Calculator.Add("2"));
            assertEquals(0,Calculator.Add(""));
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void step2Test(){
        try {
            assertEquals(6,Calculator.Add("1,2,3"));
            assertEquals(11,Calculator.Add("1,2,3,5"));
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void step3Test(){
        try {
            assertEquals(6,Calculator.Add("1\n2,3"));
            assertEquals(6,Calculator.Add("1\n2\n3"));
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void step4Test(){

        try {
            assertEquals(3, Calculator.Add("//;\n1;2"));
            assertEquals(6, Calculator.Add("//a\n1a2a3"));
            assertEquals(6, Calculator.Add("//a\n1\n2a3"));
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }

    }
    @Test()
    public void step5Test(){
        Assert.assertThrows(NegativeNumberException.class, ()-> Calculator.Add("1,-2,3"));
        try {
            Calculator.Add("1,-2,3,-4");
        } catch (NegativeNumberException e) {
            assertEquals("negatives not allowed. Negatives: -2 -4 ", e.getMessage());
        }

    }
    @Test
    public void step6Test(){
        try {
            assertEquals(2, Calculator.Add("2,1023"));
            assertEquals(1005, Calculator.Add("5,1000"));
            assertEquals(40, Calculator.Add("2,15,23,2052,3045"));
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }
    }
}

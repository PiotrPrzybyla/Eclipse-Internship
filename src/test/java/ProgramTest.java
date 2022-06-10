import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        Assert.assertThrows(NegativeNumberException.class, ()->{
            Calculator.Add("1,-2,3");
        });
        try {
            Calculator.Add("1,-2,3,-4");
        } catch (NegativeNumberException e) {
            assertTrue(e.getMessage().equals("negatives not allowed. Negatives: -2 -4 "));
        }

    }
}

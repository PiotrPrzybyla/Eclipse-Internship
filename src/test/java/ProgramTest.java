import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgramTest {

    @Test
    public void step1Test(){
        assertEquals(3,Calculator.Add("1,2"));
        assertEquals(2,Calculator.Add("2"));
        assertEquals(0,Calculator.Add(""));
    }
    @Test
    public void step2Test(){
        assertEquals(6,Calculator.Add("1,2,3"));
        assertEquals(11,Calculator.Add("1,2,3,5"));
    }
    @Test
    public void step3Test(){
        assertEquals(6,Calculator.Add("1\n2,3"));
        assertEquals(6,Calculator.Add("1\n2\n3"));
    }
    @Test
    public void step4Test(){
        assertEquals(3, Calculator.Add("//;\n1;2"));
        assertEquals(6, Calculator.Add("//a\n1a2a3"));
        assertEquals(6, Calculator.Add("//a\n1\n2a3"));
    }
}

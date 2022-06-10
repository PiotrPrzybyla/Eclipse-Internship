import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProgramTest {
    Calculator calc = new Calculator();
    @Test
    public void step1Test(){
        assertEquals(3,calc.Add("1,2"));
        assertEquals(2,calc.Add("2"));
        assertEquals(0,calc.Add(""));
    }
    @Test
    public void step2Test(){
        assertEquals(6,calc.Add("1,2,3"));
        assertEquals(11,calc.Add("1,2,3,5"));
    }
    @Test
    public void step3Test(){
        assertEquals(6,calc.Add("1\n2,3"));
        assertEquals(6,calc.Add("1\n2\n3"));
    }
}

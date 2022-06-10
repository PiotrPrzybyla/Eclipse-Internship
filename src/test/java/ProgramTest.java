import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProgramTest {
    @Test
    public void step1Test(){
        Calculator calc = new Calculator();
        assertEquals(3,calc.Add("1,2"));
        assertEquals(2,calc.Add("2"));
        assertEquals(0,calc.Add(""));
    }
    @Test
    public void step2Test(){
        Calculator calc = new Calculator();
        assertEquals(6,calc.Add("1,2,3"));
        assertEquals(11,calc.Add("1,2,3,5"));
    }
}

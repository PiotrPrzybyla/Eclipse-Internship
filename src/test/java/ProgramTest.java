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
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void reverseIntegerTest(){
        ReverseInteger reverseInteger = new ReverseInteger();
        assertEquals(reverseInteger.f(1234),4321);
        assertEquals(reverseInteger.f(12005),50021);
        assertEquals(reverseInteger.f(1),1);
        assertEquals(reverseInteger.f(1000),1);
        assertEquals(reverseInteger.f(0),0);
        assertEquals(reverseInteger.f(-12345),-54321);
    }
}

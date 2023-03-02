import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FancyNumberTest {

    @Test
    public void isFancyNumberTester(){
        FancyNumber fancyNumber = new FancyNumber();
        assertEquals(fancyNumber.isFancy(8),0);
        assertEquals(fancyNumber.isFancy(61),1);
        assertEquals(fancyNumber.isFancy(89),0);
    }
}

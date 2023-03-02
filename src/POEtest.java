import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class POEtest {

    @Test
    public void poetester(){
        POE poe = new POE();
        assertEquals(poe.f(new int[]{1,8,3,7,10,2}), 3);
        assertEquals(poe.f(new int[]{1,5,3,1,1,1,1,1,1}), 2);
        assertEquals(poe.f(new int[]{2, 1, 1,1,2,1,7}), 5);
        assertEquals(poe.f(new int[]{1,2,3}), -1);
        assertEquals(poe.f(new int[]{3,4,5,10,}), -1);
        assertEquals(poe.f(new int[]{1,2, 10, 3, 4}), -1);
    }
}

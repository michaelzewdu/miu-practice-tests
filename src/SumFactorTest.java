import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumFactorTest {

    @Test
    public void isSumFactorTest(){
        SumFactor sumFactor = new SumFactor();
        assertEquals(sumFactor.sumFactor(new int[]{3,0,2,-5,0}), 2);
        assertEquals(sumFactor.sumFactor(new int[]{9,-3,-3,-1,-1}), 0);
        assertEquals(sumFactor.sumFactor(new int[]{1}), 1);
        assertEquals(sumFactor.sumFactor(new int[]{0,0,0}), 3);

    }
}

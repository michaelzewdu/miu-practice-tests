import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StantonMeasureTest {

    @Test
    public void isStantonMeasureTest(){
        StantonMeasure stantonMeasure = new StantonMeasure();
        assertEquals(stantonMeasure.stantonMeasure(new int[] {1}), 1);
        assertEquals(stantonMeasure.stantonMeasure(new int[] {0}), 1);
        assertEquals(stantonMeasure.stantonMeasure(new int[] {3,1,1,4}), 0);
        assertEquals(stantonMeasure.stantonMeasure(new int[] {1,3,1,1,3,3,2,3,3,3,4}), 6);
        assertEquals(stantonMeasure.stantonMeasure(new int[] {}), 0);
    }
}

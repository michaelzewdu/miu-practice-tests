import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquarePairTest {

    @Test
    public void isSquarePairTest(){
        SquarePair squarePair = new SquarePair();
        assertEquals(squarePair.countSquarePairs(new int[]{9,0,2,-5,7}), 2);
        assertEquals(squarePair.countSquarePairs(new int[]{9}), 0);
    }
}

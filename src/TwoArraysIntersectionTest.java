import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TwoArraysIntersectionTest {


    @Test
    public void arraysIntersectionTester(){
    TwoArraysIntersection twoArraysIntersectionInstance = new TwoArraysIntersection();
    assertEquals(twoArraysIntersectionInstance.f(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1}), new int[]{1, 2});
    assertEquals(twoArraysIntersectionInstance.f(new int[]{1, 8, 3, 2,6}, new int[]{2, 6, 1}), new int[]{2,6,1});
    assertEquals(twoArraysIntersectionInstance.f(new int[]{1, 3, 7, 9}, new int[]{7, 1, 9, 3}), new int[]{1, 3,7,9});
    assertEquals(twoArraysIntersectionInstance.f(new int[]{1, 2}, new int[]{3, 4}), new int[]{});
//    assertEquals(twoArraysIntersectionInstance.f(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1}), new int[]{});
    assertEquals(twoArraysIntersectionInstance.f(new int[]{}, new int[]{1,2,3}), new int[]{});
    assertEquals(twoArraysIntersectionInstance.f(new int[]{1, 2}, new int[]{}), null);
    assertEquals(twoArraysIntersectionInstance.f(new int[]{1, 2}, null), null);
    assertEquals(twoArraysIntersectionInstance.f(null, new int[]{}), null);
        assertNull(twoArraysIntersectionInstance.f(null, null));

    }
}

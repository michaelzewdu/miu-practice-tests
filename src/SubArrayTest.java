import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubArrayTest {

    @Test
    public void isSubArrayTest(){
        SubArray subArray = new SubArray();
        assertEquals(subArray.isSub(new int[] {13, 6, 3, 2}), 1);
        assertEquals(subArray.isSub(new int[] {11, 5, 3, 2}), 0);
    }
}

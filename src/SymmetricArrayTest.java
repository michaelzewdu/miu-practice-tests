import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SymmetricArrayTest {

    @Test
    public void isSymTest(){
        SymmetricArray symmetricArray = new SymmetricArray();
        assertEquals(symmetricArray.isSym(new int[]  {2,7,9,10,11,5,8}, 7), 1);
        assertEquals(symmetricArray.isSym(new int[] {9,8,7,13,14,17}, 6), 1);
        assertEquals(symmetricArray.isSym(new int[] {2,7,8,9,11,13,10}, 7), 0);

    }
}

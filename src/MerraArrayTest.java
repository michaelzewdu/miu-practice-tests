import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MerraArrayTest {

    @Test
    public void isMerraArrayTest(){
        MeeraArray meeraArray = new MeeraArray();
        assertEquals(meeraArray.isMeera(new int[] {7,9,0,10,1}),1);
        assertEquals(meeraArray.isMeera(new int[] {6, 10, 8}),1);
        assertEquals(meeraArray.isMeera(new int[] {7, 6, 1}),0);
        assertEquals(meeraArray.isMeera(new int[] {9,10,0}),0);
        assertEquals(meeraArray.isMeera(new int[] {1,1, 0, 8, 0, 9, 9, 1}),1);
    }
}

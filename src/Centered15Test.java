import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Centered15Test {

    @Test
    public void isCentered15Test(){
        Centered15 centered15 = new Centered15();
        assertEquals(centered15.isCentered15(new int[] {3,2,10,4,1,6,9}),1);
        assertEquals(centered15.isCentered15(new int[] {2,10,4,1,6,9}),0);
        assertEquals(centered15.isCentered15(new int[] {3,2,10,4,1,6}),0);
        assertEquals(centered15.isCentered15(new int[] {1,1,8,3,1,1}),0);
        assertEquals(centered15.isCentered15(new int[] {9,15,6}),1);
        assertEquals(centered15.isCentered15(new int[] {1,1,2,2,1,1}),0);
        assertEquals(centered15.isCentered15(new int[] {1,1,15,-1,-1}),1);
    }
}

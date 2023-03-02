import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsCenteredTest {

    @Test
    public void isCenteredArrayTest(){
        IsCentered isCenteredInstance = new IsCentered();
        int[] input1 = {1,2,3,4,5};
        int[] input2 = {3,2,1,4,5};
        int[] input3 = {3,2,1,4,1};
        int[] input4 = {1,2,3,4};
        int[] input5 = {};
        int[] input6 = {10};
        assertEquals(isCenteredInstance.isCentered(input1),0);
        assertEquals(isCenteredInstance.isCentered(input2),1);
        assertEquals(isCenteredInstance.isCentered(input3),0);
        assertEquals(isCenteredInstance.isCentered(input4),0);
        assertEquals(isCenteredInstance.isCentered(input5),0);
        assertEquals(isCenteredInstance.isCentered(input6),1);
    }
}

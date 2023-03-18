import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepsEqualTest {

    @Test
    public void isRepsEqualTest(){
        RepsEqual repsEqual = new RepsEqual();
//        assertEquals(repsEqual.repsEqual(new int[]{3,2,0,5,3}, 32053),1);
//        assertEquals(repsEqual.repsEqual(new int[]{3,2,0,5}, 32053),0);
//        assertEquals(repsEqual.repsEqual(new int[]{3,2,0,5,3,4}, 32053),0);
//        assertEquals(repsEqual.repsEqual(new int[]{2,3,0,5,3}, 32053),0);
//        assertEquals(repsEqual.repsEqual(new int[]{9,3,1,1,2}, 32053),0);
        assertEquals(repsEqual.repsEqual(new int[]{0,3,2,0,5,3}, 32053),1);
    }
}

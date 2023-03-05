import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MadhavTest {

    @Test
    public void isMadhavTest(){
        Madhav madhav = new Madhav();
        assertEquals(madhav.isMadhavArray( new int []{2,1,1}), 1);
        assertEquals(madhav.isMadhavArray( new int []{2,1,1 ,4, -1,-1}), 1);
        assertEquals(madhav.isMadhavArray( new int []{6,2, 4,2,2,2,1,5,0,0 }), 1);
        assertEquals(madhav.isMadhavArray( new int []{18,9,10,6,6,6}), 0);
        assertEquals(madhav.isMadhavArray( new int []{-6,-3,-3,8,-5,-4}), 0);
        assertEquals(madhav.isMadhavArray( new int []{0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1}), 1);
        assertEquals(madhav.isMadhavArray( new int []{3,1,2,3,0}), 0);
    }
}

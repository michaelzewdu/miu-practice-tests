import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InertialArrayTest {

    @Test
    public void isInertialTest(){
        InertialArray inertialArray = new InertialArray();
        assertEquals(inertialArray.isInertial(new int[] {1}), 0);
        assertEquals(inertialArray.isInertial(new int[] {2}), 0);
        assertEquals(inertialArray.isInertial(new int[] {1,2,3,4}), 0);
        assertEquals(inertialArray.isInertial(new int[] {1,1,1,1,1,1,2}), 1);
        assertEquals(inertialArray.isInertial(new int[] {2,12,4,6,8,11}), 1);
        assertEquals(inertialArray.isInertial(new int[] {2,12,12,4,6,8,11}), 1);
        assertEquals(inertialArray.isInertial(new int[] {-2,-4,-6,-8,-11}), 0);
        assertEquals(inertialArray.isInertial(new int[] {2,3,5,7}), 0);
        assertEquals(inertialArray.isInertial(new int[] {2,4,6,8,10}), 0);
    }
}

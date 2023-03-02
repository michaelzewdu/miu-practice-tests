import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SumEvenOddTest {

    @Test
    public void sumEvenOddTester(){
        SumEvenOdd sumEvenOddInstance = new SumEvenOdd();
        assertEquals(sumEvenOddInstance.f(new int[]{1}), 1);
        assertEquals(sumEvenOddInstance.f(new int[]{1,2}), -1);
        assertEquals(sumEvenOddInstance.f(new int[]{1,2,3}), 2);
        assertEquals(sumEvenOddInstance.f(new int[]{1,2,3,4}), -2);
        assertEquals(sumEvenOddInstance.f(new int[]{3,3,4,4}), -2);
        assertEquals(sumEvenOddInstance.f(new int[]{}), 0);
    }
}

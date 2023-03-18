import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class IntegerBasedRoundingTest {

    @Test
    public void roundTest(){
        IntegerBasedRounding integerBasedRounding = new IntegerBasedRounding();
        Assertions.assertEquals(integerBasedRounding.doIntegerBasedRounding(new int[] {1,2,3,4,5},2), new int[]{2, 2, 4, 4, 6});
    }

}

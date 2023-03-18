import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Base10Test {

    @Test
    public void convertToBase10Test(){
        Base10 base10 = new Base10();
        assertEquals(base10.convertToBase10(new int[] {1,0,1,1},2), 11);
        assertEquals(base10.convertToBase10(new int[] {1,1,2},3), 14);
        assertEquals(base10.convertToBase10(new int[] {3, 2, 5},8), 213);
        assertEquals(base10.convertToBase10(new int[] {3, 7, 1},2), 0);

    }
}

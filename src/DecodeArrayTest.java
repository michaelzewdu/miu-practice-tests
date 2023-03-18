import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodeArrayTest {

    @Test
    public void decodeArrayTest(){
        DecodeArray decodeArray = new DecodeArray();
        assertEquals(decodeArray.decodeArray(new int[]{2, -3, -2, 6, 9, 18}), 51839);
        assertEquals(decodeArray.decodeArray(new int[]{0, -3, 0, -4, 0}), 3344);
        assertEquals(decodeArray.decodeArray(new int[]{-1, 5, 8, 17, 15}), -6392);
        assertEquals(decodeArray.decodeArray(new int[]{1, 5, 8, 17, 15}), 4392);
        assertEquals(decodeArray.decodeArray(new int[]{111, 115, 118, 127, 125}), 4392);

    }
}

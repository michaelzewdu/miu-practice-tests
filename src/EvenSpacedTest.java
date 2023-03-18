import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenSpacedTest {

    @Test
    public void isEvenSpaced( ){
        EvenSpaced evenSpaced = new EvenSpaced();
        assertEquals(evenSpaced.isEvenSpaced(new int[] {100, 19, 131, 140}), 0);
        assertEquals(evenSpaced.isEvenSpaced(new int[] {200, 1, 151, 160}), 0);
        assertEquals(evenSpaced.isEvenSpaced(new int[] {200, 10, 151, 160}), 1);
        assertEquals(evenSpaced.isEvenSpaced(new int[] {100, 19, -131, -140}), 1);
        assertEquals(evenSpaced.isEvenSpaced(new int[] {80, -56, 11, -81}), 0);
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuthrieSequenceTest {

    @Test
    public void isGuthrieSequenceTest(){
        GuthrieSequence guthrieSequence = new GuthrieSequence();
        assertEquals(guthrieSequence.isGuthrieSequence(new int[]{8,4,2,1}), 1);
        assertEquals(guthrieSequence.isGuthrieSequence(new int[]{8,17,4,1}), 0);
        assertEquals(guthrieSequence.isGuthrieSequence(new int[]{8,4,1}), 0);
        assertEquals(guthrieSequence.isGuthrieSequence(new int[]{8,4,2,}), 0);
    }
}

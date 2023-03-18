import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NuniqueTest {

    @Test
    public void isNUniqueTest() {
        Nunique nunique = new Nunique();
        assertEquals(nunique.isNUnique(new int[]{2, 7, 3, 4}, 5), 1);
        assertEquals(nunique.isNUnique(new int[]{2, 3, 3, 4}, 5), 0);
        assertEquals(nunique.isNUnique(new int[]{7, 3, 3, 2, 4}, 6), 0);
        assertEquals(nunique.isNUnique(new int[]{7, 3, 3, 2, 4}, 10), 0);
        assertEquals(nunique.isNUnique(new int[]{7, 3, 3, 2, 4}, 11), 1);
        assertEquals(nunique.isNUnique(new int[]{7, 3, 3, 2, 4}, 8), 0);
        assertEquals(nunique.isNUnique(new int[]{7, 3, 3, 2, 4}, 4), 0);
        assertEquals(nunique.isNUnique(new int[]{1}, 2), 0);
    }
}

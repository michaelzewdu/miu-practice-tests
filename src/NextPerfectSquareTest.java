import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextPerfectSquareTest {
    @Test
    public void isPerfectSquareTester(){
        NextPerfectSquare nextPerfectSquare = new NextPerfectSquare();
        assertEquals(nextPerfectSquare.isPerfectSquare(6), 9);
        assertEquals(nextPerfectSquare.isPerfectSquare(36), 49);
        assertEquals(nextPerfectSquare.isPerfectSquare(0), 1);
        assertEquals(nextPerfectSquare.isPerfectSquare(-5), 0);
    }
}

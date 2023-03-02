import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfTwoSquaresTest {

    @Test
    public void isSumOfTwoSquaresTest(){
        SumOfTwoSquares sumOfTwoSquares = new SumOfTwoSquares();
        assertEquals(sumOfTwoSquares.answerOne(50),2);
    }
}

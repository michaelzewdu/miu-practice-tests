import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Question15Test {

    @Test
    public void isEvenAndBalancedTest(){
        Question15 question15 = new Question15();

        assertEquals(question15.answerThree(new int[] {5,4,3,2,3,4,6,1}), 1);
    }
}

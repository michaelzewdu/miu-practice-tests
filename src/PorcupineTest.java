import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PorcupineTest {

    @Test
    public void findPorcupineNumberTest (){
        Porcupine porcupine = new Porcupine();
        assertEquals(porcupine.findPorcupineNumber(0), 139);
        assertEquals(porcupine.findPorcupineNumber(139), 409);
    }
}

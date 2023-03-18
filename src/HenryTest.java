import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HenryTest {

    @Test
    public void henryTest(){
        Henry henry = new Henry();
        assertEquals(henry.henry(1,3), 502);
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CubePowerfulTest {

    @Test
    public void isCubePowerfulTest(){
        CubePowerful cubePowerful = new CubePowerful();
        assertEquals(cubePowerful.isCubePowerful(153), 1);
        assertEquals(cubePowerful.isCubePowerful(370), 1);
        assertEquals(cubePowerful.isCubePowerful(371), 1);
        assertEquals(cubePowerful.isCubePowerful(407), 1);
        assertEquals(cubePowerful.isCubePowerful(87), 0);
        assertEquals(cubePowerful.isCubePowerful(0), 0);
        assertEquals(cubePowerful.isCubePowerful(-81), 0);
    }
}

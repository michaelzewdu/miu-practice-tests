import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCountTest {

    @Test
    public void testPrimeCount(){
    PrimeCount primeCountInstance = new PrimeCount();
    assertEquals(primeCountInstance.primeCount(10,30), 6);
    assertEquals(primeCountInstance.primeCount(11,29), 6);
    assertEquals(primeCountInstance.primeCount(20,22), 0);
    assertEquals(primeCountInstance.primeCount(1,1), 0);
    assertEquals(primeCountInstance.primeCount(5,5), 1);
    assertEquals(primeCountInstance.primeCount(6,2), 0);
    assertEquals(primeCountInstance.primeCount(-10,6), 3);

    }

}

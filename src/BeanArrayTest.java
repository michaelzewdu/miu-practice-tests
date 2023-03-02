import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeanArrayTest {

    @Test
    public void isBeanArrayTest(){
        BeanArray beanArray = new BeanArray();
        assertEquals(beanArray.isBean(new int[] {4, 9,8}), 1);
        assertEquals(beanArray.isBean(new int[] {2, 2, 5, 11, 23}), 1);
        assertEquals(beanArray.isBean(new int[] {7, 7, 3, 6}), 1);
        assertEquals(beanArray.isBean(new int[] {0}), 1);
        assertEquals(beanArray.isBean(new int[] {3, 8, 4}), 0);
    }
}

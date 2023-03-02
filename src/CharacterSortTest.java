import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CharacterSortTest {

    @Test
    public void characterSortTester(){
        CharacterSort characterSortInstance = new CharacterSort();
        assertEquals(characterSortInstance.f(new char[]{'a', 'b', 'c'},0,4), null);
        assertEquals(characterSortInstance.f(new char[]{'a', 'b', 'c'},0,3), new char[]{'a','b','c'});
        assertEquals(characterSortInstance.f(new char[]{'a', 'b', 'c'},0,2), new char[]{'a','b'});
        assertEquals(characterSortInstance.f(new char[]{'a', 'b', 'c'},0,1), new char[]{'a'});
        assertEquals(characterSortInstance.f(new char[]{'a', 'b', 'c'},1,3), null);
        assertEquals(characterSortInstance.f(new char[]{'a', 'b', 'c'},1,2), new char[]{'b','c'});
        assertEquals(characterSortInstance.f(new char[]{'a', 'b', 'c'},1,1), new char[]{'b'});
        assertEquals(characterSortInstance.f(new char[]{'a', 'b', 'c'},2,2), null);
        assertEquals(characterSortInstance.f(new char[]{'a', 'b', 'c'},2,1), new char[]{'c'});
        assertEquals(characterSortInstance.f(new char[]{'a', 'b', 'c'},3,1), null);
        assertEquals(characterSortInstance.f(new char[]{'a', 'b', 'c'},1,0), new char[]{});
        assertEquals(characterSortInstance.f(new char[]{'a', 'b', 'c'},-1,2), null);
        assertEquals(characterSortInstance.f(new char[]{'a', 'b', 'c'},-1,-2), null);
        assertEquals(characterSortInstance.f(new char[]{'a', 'b', 'c'},0,1), null);
    }
}

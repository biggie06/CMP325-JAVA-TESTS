import static org.junit.Assert.*;
import org.junit.Test;
public class MyResultTest {
    @Test
    public void testIsPrime() {
        assertTrue(MyResult.PrimeNumber(2));
        assertTrue(MyResult.PrimeNumber(3));
        assertFalse(MyResult.PrimeNumber(4));
        assertTrue(MyResult.PrimeNumber(17));
        assertFalse(MyResult.PrimeNumber(1));
        assertFalse(MyResult.PrimeNumber(-5));
    }


    @Test
    public void testIsPalindrome() {
        assertTrue(MyResult.PalindromeWord("joe"));
        assertTrue(MyResult.PalindromeWord("rose"));
        assertFalse(MyResult.PalindromeWord("daniel"));
        assertTrue(MyResult.PalindromeWord("john"));
        assertFalse(MyResult.PalindromeWord(null));
        assertTrue(MyResult.PalindromeWord("Aisha "));
    }
}
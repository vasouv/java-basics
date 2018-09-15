package vs.java.basics.strings;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vasouv
 */
public class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    @Test
    public void shouldBePalindromeWithLoop() {
        assertTrue(palindrome.isPalindromeWithLoop("anna"));
        assertTrue(palindrome.isPalindromeWithLoop("civic"));
        assertTrue(palindrome.isPalindromeWithLoop("kayak"));
        assertTrue(palindrome.isPalindromeWithLoop("B"));
        assertTrue(palindrome.isPalindromeWithLoop("cc"));
        assertTrue(palindrome.isPalindromeWithLoop("12321"));
    }

    @Test
    public void shouldBePalindromeWithSubString() {
        assertTrue(palindrome.isPalindromeWithSubString("anna"));
        assertTrue(palindrome.isPalindromeWithSubString("civic"));
        assertTrue(palindrome.isPalindromeWithSubString("kayak"));
        assertTrue(palindrome.isPalindromeWithSubString("B"));
        assertTrue(palindrome.isPalindromeWithSubString("cc"));
        assertTrue(palindrome.isPalindromeWithSubString("12321"));
    }

    @Test
    public void isDefinitelyNotPalindrome() {
        assertFalse(palindrome.isPalindromeWithLoop("ann"));
        assertFalse(palindrome.isPalindromeWithSubString("ann"));
    }

}

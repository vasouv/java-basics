package vs.java.basics.numbers;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vasouv
 */
public class ReverseNumberTest {

    ReverseNumber reverseNumber = new ReverseNumber();

    @Test
    public void testReverseNumber() {
        assertEquals(321, reverseNumber.reverse(123));
        assertEquals(1, reverseNumber.reverse(1));
        assertEquals(54, reverseNumber.reverse(45));
        assertEquals(888, reverseNumber.reverse(888));
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeNumberThrowsException() {
        reverseNumber.reverse(-123);
    }

}

package vs.java.basics.strings;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vasou
 */
public class ReverseStringTest {

    ReverseString rs = new ReverseString();

    @Test
    public void testReverseJavaAPI() {
        assertEquals("CBA", rs.reverseJava("ABC"));
        assertEquals("21ba", rs.reverseJava("ab12"));
        assertEquals("", rs.reverseJava(""));
        assertEquals("a", rs.reverseJava("a"));
        assertEquals("aaa", rs.reverseJava("aaa"));
        assertEquals("aba", rs.reverseJava("aba"));
        assertEquals("Bbbaa", rs.reverseJava("aabbB"));
    }

    @Test
    public void testReverseLoop() {
        assertEquals("EDCBA", rs.reverseStringBuilder("ABCDE"));
        assertEquals("21ba", rs.reverseStringBuilder("ab12"));
        assertEquals("", rs.reverseStringBuilder(""));
        assertEquals("a", rs.reverseStringBuilder("a"));
        assertEquals("aaa", rs.reverseStringBuilder("aaa"));
        assertEquals("aba", rs.reverseStringBuilder("aba"));
        assertEquals("Bbbaa", rs.reverseStringBuilder("aabbB"));
    }

    @Test
    public void testReverseCharEffective() {
        assertEquals("EDCBA", rs.reverseCharEffective("ABCDE"));
        assertEquals("21ba", rs.reverseCharEffective("ab12"));
        assertEquals("", rs.reverseCharEffective(""));
        assertEquals("a", rs.reverseCharEffective("a"));
        assertEquals("aaa", rs.reverseCharEffective("aaa"));
        assertEquals("aba", rs.reverseCharEffective("aba"));
        assertEquals("Bbbaa", rs.reverseCharEffective("aabbB"));
    }

}

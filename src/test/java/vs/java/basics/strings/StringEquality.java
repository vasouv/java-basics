package vs.java.basics.strings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author vasouv
 */
public class StringEquality {

    @Test
    public void stringsFromPoolAreEqual() {

        String first = "vasouv";
        String second = "vasouv";

        assertTrue(first == second);

    }

    @Test
    public void stringsWithNewAreNotEqual() {

        String third = new String("vasouv");
        String fourth = new String("vasouv");

        assertFalse(third == fourth);

    }

    @Test
    public void stringsFromPoolAndNewContentsAreEqual() {

        String fifth = "vasouv";
        String sixth = new String("vasouv");

        assertTrue(fifth.equals(sixth));

    }

    @Test
    public void hashCodes() {

        assertTrue("vasouv".hashCode() == (new String("vasouv").hashCode()));
        assertFalse("yo".hashCode() == "vasouv".hashCode());

    }

}

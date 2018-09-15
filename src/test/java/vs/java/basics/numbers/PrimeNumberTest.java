package vs.java.basics.numbers;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vasouv
 */
public class PrimeNumberTest {

    PrimeNumber primeNumber = new PrimeNumber();

    @Test
    public void isPrime() {
        assertTrue(primeNumber.isPrime(2));
        assertTrue(primeNumber.isPrime(5));
        assertTrue(primeNumber.isPrime(23));
        assertTrue(primeNumber.isPrime(127));
    }

    @Test
    public void isNotPrime() {
        assertFalse(primeNumber.isPrime(10));
        assertFalse(primeNumber.isPrime(21));
        assertFalse(primeNumber.isPrime(159));
    }

    @Test(expected = IllegalArgumentException.class)
    public void expectsExceptions() {
        primeNumber.isPrime(-5);
    }

}

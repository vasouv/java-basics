package vs.java.basics.numbers;

/**
 *
 * @author vasouv
 */
public class PrimeNumber {

    public boolean isPrime(int number) {

        if (number < 2) {
            throw new IllegalArgumentException("Number must be > 2");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}

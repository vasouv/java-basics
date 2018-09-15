package vs.java.basics.numbers;

/**
 *
 * @author vasouv
 */
public class ReverseNumber {

    public int reverse(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("Number must be > 0");
        }

        int reverse = 0;
        int remainder = 0;

        do {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        } while (number > 0);

        return reverse;

    }

}

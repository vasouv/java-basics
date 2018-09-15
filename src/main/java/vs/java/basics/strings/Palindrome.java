package vs.java.basics.strings;

/**
 *
 * @author vasouv
 */
public class Palindrome {

    public boolean isPalindromeWithLoop(String input) {

        if (input.length() < 2) {
            return true;
        }

        int length = input.length() - 1;
        int begin = 0;
        int end = length;

        while (begin < end) {
            if (input.charAt(begin) != input.charAt(end)) {
                return false;
            }
            begin++;
            end--;
        }

        return true;
    }

    public boolean isPalindromeWithSubString(String input) {

        if (input.length() < 2) {
            return true;
        }

        String firstHalf, secondHalf;

        if (input.length() % 2 == 0) {
            firstHalf = input.substring(0, input.length() / 2);
            secondHalf = input.substring(input.length() / 2);
        } else {
            firstHalf = input.substring(0, input.length() / 2);
            secondHalf = input.substring((input.length() / 2) + 1);
        }

        String secondReverse = new StringBuilder(secondHalf).reverse().toString();

        return firstHalf.equals(secondReverse);
    }

}

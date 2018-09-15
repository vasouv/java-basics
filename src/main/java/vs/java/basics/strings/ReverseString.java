package vs.java.basics.strings;

/**
 *
 * @author vasouv
 */
public class ReverseString {

    public String reverseJava(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public String reverseStringBuilder(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }

        return sb.toString();
    }

    public String reverseCharEffective(String input) {

        char[] inputArray = input.toCharArray();
        int begin = 0;
        int end = input.length() - 1;

        char temp;
        while (begin < end) {
            temp = inputArray[begin];
            inputArray[begin] = inputArray[end];
            inputArray[end] = temp;
            begin++;
            end--;
        }

        return new String(inputArray);
    }

}

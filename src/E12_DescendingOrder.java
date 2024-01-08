import java.util.Arrays;

/*Your task is to make a function that can take any non-negative
integer as an argument and return it with its digits in descending order.
 Essentially, rearrange the digits to create the highest possible number.

        Examples:
Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321*/
public class E12_DescendingOrder {

    public static int sortDesc(final int num) {
        char[] ch = Integer.toString(num).toCharArray();

        int[] in = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            in[i] = Character.getNumericValue(ch[i]);
        }

        in = Arrays.stream(in).boxed()  // Konwersja int na Integer
                .sorted((a, b) -> Integer.compare(b, a))  // Sortowanie malejące
                .mapToInt(Integer::intValue)  // Konwersja z powrotem na int
                .toArray();
        int result = 0;
        for (int digit : in) {
            result = result * 10 + digit;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(465));

    }

}

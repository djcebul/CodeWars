/*Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
        35231 => [1,3,2,5,3]
        0 => [0]*/

public class E2_ConvertNumber {
    public class Kata {
        public static int[] digitize(long n) {
            char[] cyfry = Long.toString(n).toCharArray();
            int[] wynik = new int[cyfry.length];
            for (int i = cyfry.length - 1, j = 0; i >= 0; i--, j++) {
                wynik[j] = Character.getNumericValue(cyfry[i]);
            }

            return wynik;
        }
    }
}

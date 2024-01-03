/*Write a program that will calculate the number of trailing zeros in a factorial of a given number.

N! = 1 * 2 * 3 *  ... * N

Be careful 1000! has 2568 digits...

For more info, see: http://mathworld.wolfram.com/Factorial.html

Examples
zeros(6) = 1
        # 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero

zeros(12) = 2
        # 12! = 479001600 --> 2 trailing zeros
Hint: You're not meant to calculate the factorial. Find another way to find the number of zeros.*/

public class E10_TrailingZeros {
    public static int zeros(int n) {
        int count = 0;

        while (n >= 5) {
            n /= 5;
            count += n;
        }

        return count;
    }

        public static void main(String[] args) {
            System.out.println(zeros(6));  // Powinno wypisać 1
            System.out.println(zeros(1256)); // Powinno wypisać 2
        }
 }

/*
Objasnienie:
        można zauważyć, że każde zero na końcu wynika z iloczynu 10, a 10 jest wynikiem mnożenia 2 i 5.

W procesie tworzenia silni, liczby parzyste (które są wielokrotnościami liczby 2)
są zawsze dostępne w większej ilości niż liczby podzielne przez 5.
Dlatego, aby znaleźć liczbę zer na końcu silni, wystarczy policzyć, ile razy liczba 5 pojawia się jako czynnik w iloczynie.

      Na przykład, w przypadku liczby 10!, możemy podać jedynie liczbę wystąpień 5:

        10! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10
        = 3628800

Jednakże, możemy zauważyć, że występuje jedno 5 (wynikające z liczby 5) oraz jedno 10 (wynikające z iloczynu 2 i 5).
*/

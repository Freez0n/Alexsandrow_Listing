package listing_5;

class Factorial {
    long computerI(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++)
        result *= i;

        return result;
    }
    long computerR(int n) {
        if (n == 1) return n;
        return computerR(n - 1) * n;
    }
}
class RecursionDemo {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Факториал, расчитанный в цикле ");
        for (int i = 6; i > 0; i--) {
            System.out.println(i + "! = " + f.computerI(i));
        }

        System.out.println("Факториал, расчитанный с помощью рекурсии");
        for (int r = 1; r <= 6; r++) {
            System.out.println(r + "! = " + f.computerR(r));
        }
    }
}
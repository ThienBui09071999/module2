package ss2_array_and_loop.bai_tap;

public class PrimeUnder100 {
    public static void main(String[] args) {
        System.out.print("Các số nguyên tố bé hơn 100: ");
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int j = 2; j <= x / 2; j++) {
            if (x % j == 0) {
                return false;
            }
        }
        return true;
    }
}

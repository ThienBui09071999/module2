package ss2_array_and_loop.bai_tap;
import java.util.Scanner;
public class ShowPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số lượng số nguyên tố: ");
        int number = scanner.nextInt();
        System.out.print("Kết quả: ");
        int count = 0;
        int i = 2;
        while (count < number) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(x); j++) {
            if (x % j == 0) {
                return false;
            }
        }
        return true;
    }
}

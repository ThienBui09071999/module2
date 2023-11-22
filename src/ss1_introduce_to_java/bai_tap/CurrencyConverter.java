package ss1_introduce_to_java.bai_tap;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị tiền USD: ");
        double usdAmount = scanner.nextDouble();

        System.out.print("Nhập tỉ giá chuyển đổi (USD/VND) hiện tại: ");
        double exchangeRate = scanner.nextDouble();

        double vndAmount = usdAmount * exchangeRate;

        System.out.println("Số tiền VND tương ứng là: " +vndAmount + "VND");

        scanner.close();
    }
}

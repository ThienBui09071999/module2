package ss2_array_and_loop.bai_tap;
import java.util.Scanner;
public class FindMinimumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của mảng
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();

        // Khởi tạo mảng số nguyên
        int[] array = new int[size];

        // Nhập giá trị cho từng phần tử trong mảng
        System.out.println("Nhập giá trị cho từng phần tử trong mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Tìm giá trị nhỏ nhất trong mảng
        int minValue = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        // Hiển thị giá trị nhỏ nhất trong mảng
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
    }
}

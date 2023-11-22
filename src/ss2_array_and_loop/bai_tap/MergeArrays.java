package ss2_array_and_loop.bai_tap;
import java.util.Scanner;
public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của hai mảng
        System.out.print("Nhập kích thước của mảng 1: ");
        int size1 = scanner.nextInt();
        System.out.print("Nhập kích thước của mảng 2: ");
        int size2 = scanner.nextInt();

        // Khởi tạo hai mảng số nguyên
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        // Nhập giá trị của mảng 1
        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Nhập giá trị của mảng 2
        System.out.println("Nhập các phần tử của mảng 2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Tính kích thước của mảng thứ ba
        int size3 = size1 + size2;

        // Khởi tạo mảng thứ ba
        int[] array3 = new int[size3];

        // Sao chép các phần tử của mảng 1 vào mảng thứ ba
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        // Sao chép các phần tử của mảng 2 vào mảng thứ ba
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        // Hiển thị mảng thứ ba sau khi gộp
        System.out.print("Mảng sau khi gộp: ");
        for (int i = 0; i < size3; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}

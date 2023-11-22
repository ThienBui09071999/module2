package ss2_array_and_loop.bai_tap;
import java.util.Scanner;
public class TotalOfColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập kích thước của ma trận
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();
        // Khởi tạo ma trận số thực
        double[][] matrix = new double[rows][cols];
        // Nhập giá trị cho từng phần tử trong ma trận
        System.out.println("Nhập giá trị cho từng phần tử trong ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị cho phần tử tại hàng " + (i) + " cột " + (j) + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        // in ma trận
        System.out.println("My matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int choice;
        do {
            System.out.print("Chọn cột bạn muốn tính tổng: ");
            choice = scanner.nextInt();
            int sum = 0;
            if (choice < 0 || choice >= cols) {
                System.out.println("Không hợp lệ. Vui lòng chọn lại.");
            } else {
                for (int i = 0; i < rows; i++) {
                    sum += matrix[i][choice];
                }
                System.out.println("Tổng của cột " + choice + " là: " + sum);
            }
        } while (choice < 0 || choice >= cols);
    }
}

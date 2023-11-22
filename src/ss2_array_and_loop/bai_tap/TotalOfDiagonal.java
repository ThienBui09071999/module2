package ss2_array_and_loop.bai_tap;
import java.util.Scanner;

public class TotalOfDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập kích thước của ma trận
        System.out.print("Nhập kích thước ma trận vuông: ");
        int size = scanner.nextInt();
        // Khởi tạo ma trận số thực
        double[][] matrix = new double[size][size];
        // Nhập giá trị cho từng phần tử trong ma trận
        System.out.println("Nhập giá trị cho từng phần tử trong ma trận:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập giá trị cho phần tử tại hàng " + (i) + " cột " + (j) + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        // in ma trận
        System.out.println("My matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == size-1 || i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Tổng hai đường chéo là: "+sum);
    }
}

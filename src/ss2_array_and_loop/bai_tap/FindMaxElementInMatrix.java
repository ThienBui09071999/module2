package ss2_array_and_loop.bai_tap;
import java.util.Scanner;
public class FindMaxElementInMatrix {
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
        System.out.println("Nhập giá trị cho từng phần tử trong ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Tìm phần tử lớn nhất và tọa độ của nó
        double maxElement = matrix[0][0];
        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        // Hiển thị phần tử lớn nhất và tọa độ của nó
        System.out.println("Phần tử lớn nhất trong ma trận là " + maxElement);
        System.out.println("Tọa độ của phần tử lớn nhất là hàng " + (rowIndex) + ", cột " + (colIndex));
    }
}

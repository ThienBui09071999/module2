package ss2_array_and_loop.bai_tap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20.");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();

        // Nhập giá trị cần chèn
        System.out.print("Enter the value to insert: ");
        int valueToInsert = scanner.nextInt();

        // Nhập vị trí cần chèn
        System.out.print("Enter the position to insert (from 0 to " + (size-1) + "): ");
        int position = scanner.nextInt();
        if (position < 0 || position > size) {
            System.out.println("Invalid position.");
        } else {
            // Tạo mảng mới với kích thước lớn hơn 1 đơn vị
            int[] newArray = new int[size + 1];
            // Sao chép các phần tử từ mảng gốc vào mảng mới
            for (int j = 0; j < size; j++) {
                if (j < position) {
                    newArray[j] = array[j];
                } else {
                    newArray[j + 1] = array[j];
                }
            }
            newArray[position] = valueToInsert;
            // Cập nhật mảng gốc
            array = newArray;
        }
        System.out.print("Array after inserting value " + valueToInsert + " into position " + position + ": ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }
}

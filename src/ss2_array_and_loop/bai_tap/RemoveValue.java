package ss2_array_and_loop.bai_tap;
import java.util.Scanner;
public class RemoveValue {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
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
        int number;
        System.out.print("Number to find: ");
        number = scanner.nextInt();
        int index = -1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == number ) {
                index = j;
                for (int k = index; k <array.length-1 ; k++) {
                    array[k] = array[k+1];
                }
                array[array.length-1]=0;
                j--;
            }
        }
        if (index == -1) {
            System.out.println(number + " Không nằm trong mảng");
        } else {
            System.out.print("Các phần tử trong mảng sau khi xóa: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
        }
    }
}

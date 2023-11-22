package ss11_stack_queue.change_to_binary;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input Number: ");
        int number = Integer.parseInt(scanner.nextLine());
        ChangeToBinary changeToBinary = new ChangeToBinary(number);
        System.out.print("Change to Binary: ");
        changeToBinary.change();
    }
}

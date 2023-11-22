package ss1_introduce_to_java.bai_tap;
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}


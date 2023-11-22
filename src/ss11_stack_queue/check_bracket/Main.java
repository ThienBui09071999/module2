package ss11_stack_queue.check_bracket;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your String: ");
        String string = scanner.nextLine();
        CheckBracket checkBracket=new CheckBracket(string);
        if(checkBracket.checkBracket()){
            System.out.print("It's OK");
        } else System.out.print("Some thing is wrong");
    }
}

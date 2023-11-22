package ss11_stack_queue.check_palindrome_use_queue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your String: ");
        String string = scanner.nextLine();
        CheckPalindromeUsingQueue checkPalindromeUsingQueue= new CheckPalindromeUsingQueue(string);
        if(checkPalindromeUsingQueue.isPalindrome()){
            System.out.print("Your String is : " + string + " is a Palindrome");
        }
        else System.out.print("Your String is : " + string + " is not a Palindrome");;
    }
}

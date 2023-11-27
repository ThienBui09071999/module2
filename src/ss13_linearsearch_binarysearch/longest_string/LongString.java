package ss13_linearsearch_binarysearch.longest_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input String: ");
        String string = scanner.nextLine();
        List<Character> maxSubString = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (maxSubString.isEmpty()) {
                maxSubString.add(string.charAt(i));
            } else if (string.charAt(i) > maxSubString.get(maxSubString.size() - 1)) {
                maxSubString.add(string.charAt(i));
            }
        }
        for (Character ch : maxSubString) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

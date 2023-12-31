package ss13_linearsearch_binarysearch.longest_increasing_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LongestIncreasingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input String: ");
        String string = scanner.nextLine();
        List<Character> maxSubString = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            List<Character> list = new ArrayList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.get(list.size() - 1)) {
                    list.add(string.charAt(j));
                } else break;
            }
            if (list.size() > maxSubString.size()) {
                maxSubString.clear();
                maxSubString.addAll(list);
            }
            list.clear();
        }
        for (Character ch : maxSubString) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

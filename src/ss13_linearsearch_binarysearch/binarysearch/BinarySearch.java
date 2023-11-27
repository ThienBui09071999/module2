package ss13_linearsearch_binarysearch.binarysearch;

import java.util.*;
public class BinarySearch {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        System.out.print("input size :");
        int size = Integer.parseInt(scanner.nextLine());
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(random.nextInt(100));

        }
        Collections.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\ninput value  to search:");
        int value = Integer.parseInt(scanner.nextLine());
        int index = binarySearch(arr,value);
        if (index == -1) {
            System.out.print("\nCan not find value : " + value + " in array");
        } else System.out.print("\nindex of value is : " + index);
    }
    private static int binarySearch(List<Integer> array,int value) {
        int left = 0;
        int right = array.size()-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array.get(mid) == value) {
                return mid;
            } else if (array.get(mid) < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

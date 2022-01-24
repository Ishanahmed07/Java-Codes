
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 5, 9, 3, 7, 4, 5, 8 };
        System.out.print("Enter the element you want to search : ");
        int element = sc.nextInt();
        System.out.println(search(arr, element));
        sc.close();
    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("true");
                return i;
            }
        }
        return -1;

        // for (int element : arr) {
        // if (element == target) {
        // System.out.println("true");
        // return target;
        // }
        // }
        // return -1;

    }
}

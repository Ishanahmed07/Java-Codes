
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { -8, -1, 0, 5, 8, 9, 10, 12, 15, 18, 20, 26, 29, 50 };
        System.out.print("Enter the element you want to search : ");
        int target = sc.nextInt();
        System.out.println(binarySearch(arr, target));
        sc.close();
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
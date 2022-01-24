import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 6 };
        reeverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reeverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap1(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap1(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

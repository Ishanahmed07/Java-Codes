public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        System.out.println(ceiling(arr, target));

    }

    // Ceiling of a number is = smallest number >= target
    static int ceiling(int[] arr, int target) {
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
        System.out.println("The index of ceiling number is " + start);
        return arr[start];
    }
}

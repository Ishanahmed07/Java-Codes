public class AgnosticBinarySearch {
    public static void main(String[] args) {
        // int[] arr = { -5, -2, 0, 5, 10, 45, 85, 90, 100 };
        int[] arr1 = { 100, 90, 86, 52, 45, 10, -5, -15 };
        int target = 0;
        System.out.println(agnosticBinarySearch(arr1, target));
    }

    // This is applicable for both ascending or descending order array.
    static int agnosticBinarySearch(int[] arr, int target) {

        if (arr[0] < arr[arr.length - 1]) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                    return mid;
                } else if (target > arr[mid]) {
                    start = mid + 1;

                } else {
                    end = end - 1;
                }
            }
        } else {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {

                int mid = start + (end - start) / 2;
                if (target == arr[mid]) {
                    return mid;
                } else if (target < arr[mid]) {
                    start = mid + 1;

                } else {
                    end = end - 1;
                }
            }
        }
        return -1;

    }
}

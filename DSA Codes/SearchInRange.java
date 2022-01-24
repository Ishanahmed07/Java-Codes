public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 5, 9, 3, 7, 4, 5, 8 };
        int target = 5;
        System.out.println(search(arr, target, 1, 5));

    }

    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                System.out.println("true");
                return i;
            }
        }
        return -1;
    }
}

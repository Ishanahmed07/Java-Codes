public class MinValueInArray {
    public static void main(String[] args) {
        int[] arr = { 9, 7, 2, 3, 5, 12, 7 };
        System.out.println(minValue(arr));
    }

    static int minValue(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}

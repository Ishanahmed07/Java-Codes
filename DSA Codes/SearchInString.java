
import java.util.Arrays;
import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String st = sc.nextLine();
        System.out.print("Enter the char u want to search : ");
        char ch = sc.next().charAt(0);
        System.out.println(Arrays.toString(st.toCharArray()));
        System.out.println(search(st, ch));
        sc.close();
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                System.out.println(i);
                return true;
            }
        }
        return false;

        // for (char ch : str.toCharArray()) {
        // if (target == ch) {
        // return true;
        // }
        // }
        // return false;
    }
}

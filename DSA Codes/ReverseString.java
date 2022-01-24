import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.print(rev(s));
        sc.close();
    }

    static String rev(String s) {
        String rStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rStr = rStr + s.charAt(i);
        }
        return rStr;
    }
}

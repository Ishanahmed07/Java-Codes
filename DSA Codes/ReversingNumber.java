import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse : ");
        int number = sc.nextInt();
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            number /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);

        sc.close();
    }
}

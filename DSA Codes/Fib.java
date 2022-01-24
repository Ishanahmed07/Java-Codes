import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int temp;
        int count = 2;
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        while (count <= num) {
            temp = b;
            b += a;
            a = temp;
            count++;
        }
        System.out.println(b);
        sc.close();
    }
}

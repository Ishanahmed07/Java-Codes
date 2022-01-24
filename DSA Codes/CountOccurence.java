
import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print("Enter the number you want to find : ");
        int num = sc.nextInt();
        int counter = 0;
        while (number > 0) {
            int rem = number % 10;
            if (rem == num) {
                counter++;
            }
            number /= 10;
        }
        System.out.println(counter);

        sc.close();
    }
}

import java.util.Scanner;

public class IfElseHack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = scanner.nextInt();
        if (a % 2 != 0) {
            System.out.println("Weird");
        } else if (a % 2 == 0 && a >= 2 && a <= 5) {
            System.out.println("Not Weird");
        } else if (a % 2 == 0 && a >= 6 && a <= 20) {
            System.out.println("Weird");
        } else if (a % 2 == 0 && a > 20) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}

// https://www.hackerrank.com/challenges/java-if-else/problem
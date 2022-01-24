import java.util.Scanner;

public class Recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1); // formula for calculation of factorial
        }
    }

    static int factorial_iterative(int x) { // using the for loop
        if (x == 0 || x == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= x; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which factorial is to calculate : ");
        int a = sc.nextInt();
        // int a = 5;//
        System.out.println("Printing the factorial from recursion .");
        System.out.println("The factorial of a is : " + factorial(a));
        System.out.println("Using iterative function.");
        System.out.println("The factorial of a is : " + factorial_iterative(a));
        sc.close();

    }
}

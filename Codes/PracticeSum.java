import java.util.*;

public class PracticeSum {
    // Checking number is even is or not
    public static void primeOrNot(int n) {
        if (n % 2 == 0) {
            System.out.println("The entered number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    // Printing the table of a given number
    public static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    // Printing average of three number
    static public float average(int a, int b, int c) {
        float avg = (a + b + c) / 3;
        return avg;
    }

    // Printing the sum of n odd numbers
    public static void oddSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (n % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    // Finding the greater number
    // private static void greaterNumber(int x, int y) {

    // if (x > y) {
    // System.out.printf("The greater number between %d and %d is : " + x, x, y);
    // } else {
    // System.out.printf("The greater number between %d and %d is : " + y, x, y);
    // }
    // }

    // Circumference of the circle
    // private static void Circumference(int r) {
    // float c = 2 * 3.14f * r;
    // System.out.println("The circumference of the circle is " + c);
    // }

    // Elligible to vote or not
    public static void age(int n) {
        if (n >= 18) {
            System.out.println("Elligible for voting");
        } else {
            System.out.println("Not elligible for voting");
        }
    }

    // Running infinite loop
    public static void loop() {
        do {

        } while (true);
    }

    void counting(int n, int a) {

        int positive = 0;
        int negative = 0;
        int zeros = 0;

        System.out.println("1 ---> CONTINE\n0 ---> EXIT");
        while (n != 0) {
            System.out.println("Enter a number : ");
            if (n > 0)
                positive++;
            else if (n < 0)
                negative++;
            else
                zeros++;
        }
        System.out.println("Positive : " + positive);
        System.out.println("Negative : " + negative);
        System.out.println("Zeros : " + zeros);
    }

    // Printing the value for ----> 2^5=2*2*2*2*2
    public static void operation(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        System.out.printf("The value of %d raised to the power %d is : " + result, a, b);
    }

    // Marks
    public static void Marks() {

        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 --> CONTINUE\nPress 0 --> EXIT");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter Your marks : ");
                int marks = sc.nextInt();
                if (marks > 100) {
                    System.out.println("Enter valid marks!!");
                } else if (marks >= 90) {
                    System.out.println("\nThis is Good\n");
                } else if (marks >= 60 || marks <= 89) {
                    System.out.println("\nThis is also Good\n");
                } else if (marks >= 0 || marks <= 59) {
                    System.err.println("\nThis is also good as well\n");
                }
                break;

            }
            sc.close();

        } while (choice != 0);
    }

    // Finding the minumum and maximum value
    public static void finding() {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < max) {
                max = number[i];
            }
            if (number[i] > min) {
                min = number[i];
            }
        }

        System.err.println("Maximum value is " + min);
        System.err.println("Minimum value is " + max);
        sc.close();
    }

    // Printing fibonaci series
    public static void fib(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;
        while (sum <= n) {
            System.out.print(sum + " ");
            a = b;
            b = sum;
            sum = a + b;
        }

    }

    // Repleacing the e char with i in a string
    public static void replace(String st) {
        System.out.println("Original : " + st);
        System.out.print("Result : " + st.replace('e', 'i'));
    }

    // email and username using subsequence
    public static void username(String s) {

        System.out.println("Email : " + s);
        int a = s.indexOf('@');
        System.out.print("Username : " + s.subSequence(0, a));
    }

    // additio of string length of two string
    public static void addString() {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int a = s1.length() + s2.length();
        System.out.println("The combined length of the string is " + a);
        sc.close();
    }

    // Printing the transpose of the matrix
    public static void transposeMat() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of colums : ");
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("Elements of matrix are : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The transpose of the matrix is :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // int n = sc.nextInt();

        /////////// calling funtions
        // primeOrNot(n);
        // table(5);
        // System.out.println(average(95, 85, 75));
        // oddSum(n);
        // greaterNumber(m, n);
        // Circumference(m);
        // age(m);
        // fib(n);
        // replace(s);
        // username(s);
        // addString();
        // transposeMat();
        sc.close();
    }
}

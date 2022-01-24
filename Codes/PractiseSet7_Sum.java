
public class PractiseSet7_Sum {

    // Problem 1
    static void table(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d\n", a, i, a * i);
        }
    }

    // Problem 2
    static void pattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Problem 3
    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    // Problem 4
    static void pattern1(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Problem 9
    static float degree(int n) {
        return n * 1.8f + 32;
    }

    // Problem 10
    static int addition(int n) {
        if (n == 1) {
            return 1;
        } else {
            int add = 0;
            for (int i = 0; i <= n; i++) {
                add += i;

            }
            return add;
        }
    }

    public static void main(String[] args) {

        // int x = 4;
        // int y=5;

        // Problem 1
        // table(x);

        // Problem 2
        // pattern(x);

        // Problem 3
        // int t = sum(y);
        // System.out.println(t);

        // Problem 4
        // pattern1(5);

        // Problem 9
        // float fahrenheit = degree(75);
        // System.out.println(fahrenheit);

        // Problem 10
        // int c = addition(5);
        // System.out.println(c);

    }
}

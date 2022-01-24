import java.util.*;

interface AddSubs {
    public void add();

    public void substract();

}

interface MulDiv {
    public void multiplication();

    public void division();
}

class calculator implements AddSubs, MulDiv {
    Scanner sc = new Scanner(System.in);
    int a, b;

    public void add() {

        System.out.print("\nEnter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("\nThe addiion of two numbers is " + (a + b) + "\n");

    }

    public void substract() {
        System.out.print("\nEnter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("\nThe substraction of two numbers is " + (a - b) + "\n");

    }

    public void multiplication() {
        System.out.print("\nEnter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("\nThe multiplicationof two numbers is " + (a * b) + "\n");

    }

    public void division() {
        System.out.print("\nEnter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("\nThe division of two numbers is " + (float) (a / b) + "\n");

    }

}

public class Exp9_MultipleInheritance extends calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        calculator calc = new calculator();
        System.out.println("\n\t\t***MINI CALCULATOR***");
        System.out.println("\nWhat operation do you want to perform --> \n");
        int opt;
        do {
            System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n0.EXIT\n");
            System.out.print("Choose the operation --> ");
            opt = sc.nextInt();
            switch (opt) {

            case 1:
                calc.add();
                break;

            case 2:
                calc.substract();
                break;

            case 3:
                calc.multiplication();
                break;

            case 4:
                calc.division();
                break;
            default:
            }
            if (opt > 4 || opt == 0) {
                opt = 0;
            } else {
                System.err.println("Choose the correct option..");
            }
        } while (opt != 0);
        sc.close();

    }
}
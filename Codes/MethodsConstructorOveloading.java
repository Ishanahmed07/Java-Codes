import java.util.Scanner;

//creating a constructor
class sum {
    double width, height, length;

    public sum(double w, double h, double l) {
        width = w;
        height = h;
        length = l;
    }

    sum() {
        width = height = length = 0;
    }

    sum(double len) {
        width = height = length = len;
    }

    double volume() {
        return width * height * length;
    }
}

public class MethodsConstructorOveloading {

    // creating methods
    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double mul(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number : ");
        double b = sc.nextDouble();

        System.out.printf(
                "Press 1 ---> Addition.\nPress 2 ---> Subtraction.\nPress 3 ---> Multiplication.\nPress 4 ---> Division.\n");

        System.out.print("Enter your choice according to the operation you want to perform : ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.printf("You have entered %d\n", num);
                System.out.printf("So the addition of %f and %f is " + add(a, b), a, b);
                break;

            case 2:
                System.out.printf("You have entered %d\n", num);
                System.out.printf("So the subtraction of %f and %f is " + sub(a, b), a, b);
                break;

            case 3:
                System.out.printf("You have entered %d\n", num);
                System.out.printf("So the multiplication of %f and %f is " + mul(a, b), a, b);
                break;

            case 4:
                System.out.printf("You have entered %d\n", num);
                System.out.printf("So the division of %f and %f is " + div(a, b), a, b);
                break;

            default:
                System.out.println("invalid Input!!...");
        }
        System.out.print("\n\nCalling Constructor");
        System.out.print("\nEnter width : ");
        int x = sc.nextInt();
        System.out.print("Enter height : ");
        int y = sc.nextInt();
        System.out.print("Enter length : ");
        int z = sc.nextInt();
        sum obj = new sum(x, y, z);
        sum obj1 = new sum();
        sum obj2 = new sum(z);
        double vol;
        vol = obj.volume();
        System.out.println("Volume of box is " + vol);
        vol = obj1.volume();
        System.out.println("Volume = " + vol);
        vol = obj2.volume();
        System.out.println("Volume of cube is " + vol);

        System.out.printf("\n\t**Have an awesome day**");
        sc.close();

    }
}
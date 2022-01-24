
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // String name = new String("Code With Harry");
        // String hl = "Harry";
        // String nm;
        // nm = new String("Hello");
        // System.out.println(name);
        // System.out.println(hl);
        // System.out.println(nm);
        // int a = 7;
        // float b = 5.36527f;
        // System.out.printf("The value of a and b is %d and %f\n",a,b);
        // System.out.format("The value of a and b is %d and %f",a,b); //Format is same
        // as printf function
        Scanner sc = new Scanner(System.in);
        // String st = sc.next(); // here next will take only first word so
        String st = sc.nextLine(); // nextLine will tale all the input
        System.out.println(st);
        sc.close();

    }
}

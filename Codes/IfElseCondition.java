import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Your age : ");
        int age = s.nextInt();
        if (age >= 18) {
            System.out.println("You can drive!");
        } else {
            System.out.println("Yor cannot drive !!!..");
        }
        s.close();

    }
}

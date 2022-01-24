
// Program to demonstrate the method overloading
// Name: Sudarshan Tarmale  Roll no: 312056
import java.util.*;

public class Exp4 {

    public static void student(String name) {
        System.out.println("Hello, " + name + " enter the following information.\n");
    }

    public static void student(String name, int roll, String div) {
        System.out.println("Name: " + name);
        System.out.format("Roll no: " + roll + "\t" + " Branch: " + div+"\n");
    }

    public static void student(String[] sub, int[] marks) {
        System.out.println("Your marks in the final exam are as following:");
        for (int i = 0; i < 4; i++) {
            System.out.println(" "+sub[i] + ": " + marks[i]);
        }
    }

    public static void student(int[] marks) {
        float avg = 0;

        for (int i = 0; i < 4; i++) {
            if (marks[i] > 100){
                System.out.println("Enter correct marks");
                break;
            }
            else {
                avg += marks[i];
            }
        }
        float percentage = (avg * 100) / 400;
        System.out.println("\nYour have scored " + percentage + "% in your final exam.\n\n");
    }
class A{

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        student(name);
        System.out.print("Enter your roll number: ");
        int roll = sc.nextInt();
        System.out.print("Enter branch: ");
        String div = sc.next();
        student(name, roll, div);
        System.out.println("Enter marks scored in PCMB:");
        String[] sub = new String[4];
        sub[0] = "Physics";
        sub[1] = "Chemistry";
        sub[2] = "Mathematics";
        sub[3] = "Biology";
        int[] marks = new int[4];
        for (int i = 0; i < 4; i++) {
            marks[i] = sc.nextInt();
        }
        student(sub, marks);
        student(marks);
        sc.close();
    }
}

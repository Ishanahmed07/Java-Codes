import java.util.Scanner;

abstract class Contact {
    void inputNumber() {
    };

    void saveNumber() {
    };

    Scanner sc = new Scanner(System.in);
}

class saveContact extends Contact {

    void inputNumber() {

        System.out.print("\nEnter the phone number : ");
        String num = sc.next();

        System.out.println("The entered number is " + num);

    }

    void saveNumber() {
        System.out.print("\nDo you want to save the contact or want to call -\n");
        System.out.print("\nPress 1 --> Save \nPress 2 --> Call\n");
        System.out.print("\nEnter your choice : ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("\nEnter the name : ");
            sc.next();
            System.out.println("Contact save successfully...");
        } else if (choice == 0) {
            System.out.println("");
        } else {
            System.out.println("Calling....");
        }
    }
}

public class Exp10_AbstractClass {
    public static void main(String[] args) {
        saveContact save = new saveContact();
        save.inputNumber();
        save.saveNumber();
    }
}

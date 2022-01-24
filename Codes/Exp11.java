import java.util.Scanner;

class ATM {
    Scanner s = new Scanner(System.in);
    final int balance = 10000;

}

class withdraw extends ATM {
    void Withdrawn() {
        System.out.println("Enter the amount to withdraw : ");
        // int amnt =
        s.nextInt();
        if (balance > 0) {
            System.out.println("Withdrawing the money..");
        }
        // else {
        // System.out.println("Balance is low..");
        // }
    }
}

public class Exp11 {
    public static void main(String[] args) {
        withdraw w = new withdraw();
        w.Withdrawn();
    }
}
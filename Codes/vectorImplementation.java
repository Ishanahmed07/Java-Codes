
//Program to emplement the vector methods
import java.util.*;

public class vectorImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> stringList = new Vector<String>();
        Vector<Float> floatList = new Vector<Float>();
        Vector<Integer> integerList = new Vector<Integer>();
        System.out.print("\n---------------------------------------------------------------------");
        System.out.print("\n\t\t  ****WELCOME TO MIRAJ CINEMA****\n");
        System.out.print("---------------------------------------------------------------------\n\n");
        System.out.println("MENU -->\n");
        System.out.println("Press 1 : List of the Movies\nPress 2 : List of Snacks\n");
        int choice;
        do {
            System.out.print("\nEnter yout choice : ");
            choice = sc.nextInt();
            if (choice > 2) {
                System.out.print("\nEnter the valid choice.\n");
                System.out.println("\nPress 1 : List of the Movies\nPress 2 : List of Snacks\n");
            }
        } while (choice >= 3);
        int ch1, ch2;
        switch (choice) {
        case 1:
            stringList.add("1. Harry Potter and the chamber of secrets");
            stringList.add("2. Stand By Me 2 Doraemon");
            stringList.add("3. The Lion King");
            stringList.add("4. Avengers Endgame");
            stringList.add("5. Conjuring");
            floatList.add(2.30f);
            floatList.add(3.10f);
            floatList.add(12.30f);
            floatList.add(4.10f);
            floatList.add(6.10f);
            integerList.add(350);
            integerList.add(300);
            integerList.add(250);
            integerList.add(400);
            integerList.add(300);
            integerList.add(300);
            int n = stringList.size();
            for (int i = 0; i < n; i++) {
                System.out.println(stringList.get(i));
            }
            System.out.println();
            System.out.print("Which movie you want to watch: ");
            ch1 = sc.nextInt();
            System.out.println();
            System.out.print("Timing for the movie is " + floatList.get(ch1 - 1) + "0Pm\n");
            System.out.println("Price for the ticket is " + integerList.get(ch1 - 1) + "Rs");
            System.out.println();
            System.out.println("Do you want to book the ticket ? (0-->Yes/1-->No)");
            int ch = sc.nextInt();
            if (ch == 0) {
                System.out.print("Enter the number of members : ");
                int number = sc.nextInt();
                System.err.println("Your ticket has been succesfully booked for " + number + " members.");
                System.out.println("Your total amount is " + number * integerList.get(ch1 - 1) + "Rs.\n");
            }
            break;
        case 2:
            stringList.add("1. Popcorn");
            stringList.add("2. Candy");
            stringList.add("3. Soda");
            stringList.add("4. Sandwich");
            stringList.add("5. French Fries");
            floatList.add(80f);
            floatList.add(70f);
            floatList.add(40f);
            floatList.add(50f);
            floatList.add(60f);
            int m = stringList.size();
            for (int j = 0; j < m; j++) {
                System.out.println(stringList.get(j));
            }
            System.out.println();
            System.out.print("Which snack do want to take : ");
            ch2 = sc.nextInt();
            System.out.println("The price is " + floatList.get(ch2 - 1) + "Rs\n");
            System.out.print("For how many members do you want the snacks : ");
            int mem = sc.nextInt();
            System.out.println("Your ordered is booked succesfully.");
            System.out.println("Your total amount is " + mem * floatList.get(ch2 - 1) + "Rs.\n");
            System.out.print("Please wait for a while...\n");
            break;
        default:
            System.out.println("Enter the valid option.");
            break;
        }
        System.out.println("\n\t\t***THANK YOU FOR COMING***\n\t\t     **VISIT AGAIN** ");
        System.out.println();
        sc.close();
    }
}

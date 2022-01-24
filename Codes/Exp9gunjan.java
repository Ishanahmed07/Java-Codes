import java.util.*;

interface ticket {
    public void sode();

    public void display();

    public void details();
}

interface Many {
    public void printticket();
}

class Myprint implements Many, ticket {
    Scanner sc = new Scanner(System.in);
    String s, di, date, n, g;
    int t, no, a;

    public void sode() {
        System.out.println("==============================================================================");
        System.out.println("Please enter your source and destination!!");
        System.out.print("Enter your source ==> ");
        s = sc.nextLine();
        System.out.print("Enter your destination ==> ");
        di = sc.nextLine();
        System.out.print("Enter the date you want to travel on ==> ");
        date = sc.nextLine();
    }

    public void display() {
        System.out.println("==============================================================================");
        System.out.println(
                "\nThese are the trains and the timings available based on the source and \ndestination you have selected");
        System.out.println(
                "(1) Rajdhani 16:00\n(2) Howra 16:55\n(3) Tejas 17:00\n(4) Nizamuddin 20:00\n(5) Golden Temple 21:00");
        System.err.print("\nSelect the train and timing which will be suitable for you ==>");
        t = sc.nextInt();
        if (t > 5) {
            System.out.println("Please select a valid option!! ");
        }
    }

    public void details() {
        System.out.println("==============================================================================");
        System.out.print("Enter the number of passenger you want to book ticket for ==> ");
        no = sc.nextInt();
        for (int i = 1; i <= no; i++) {
            System.out.println("\nPassenger " + i + ".");
            System.out.print("Enter Name of passenger ==> ");
            n = sc.next();
            System.out.print("Enter gender ==> ");
            g = sc.next();
            System.out.print("Enter Age ==> ");
            a = sc.nextInt();
        }
    }

    public void printticket() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("|\t\t\t**TICKET**\t\t\t\t|");
        System.out.println("----------------------------------------------------------------");
        System.out.println("|Source : " + s + "                     Destination : " + di + "\t|");
        System.out.println("|\tDate of departure ==> " + date + "\t\t\t\t|");
        System.out.println("|\tTotal number of passengers : " + no + "\t\t\t\t|");

        System.out.println("|***************************************************************|");
        System.out.println("|\tThank you for choosing INDIAN RAILWAYS.\t\t\t|");
        System.out.println("\n");
    }
}

public class Exp9gunjan extends Myprint {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("|                                                              |");
        System.out.println("|                RAILWAY TICKET BOOKING SYSTEM                 |");
        System.out.println("|                                                              |");
        System.out.println("----------------------------------------------------------------");

        System.out.println("Welcome to INDIAN railways!!!");
        Myprint my = new Myprint();
        my.sode();
        my.display();
        my.details();
        my.printticket();
    }
}

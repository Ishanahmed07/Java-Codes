
import java.util.Scanner;

class Shop {
    final int pen = 5;
    final int book = 30;
    final int longBook = 50;
    final int drawingBook = 70;
    int quan;

    void display() {

        System.out.println(" ................................................");
        System.out.println("\t***Welcome to the Books Emprium***");
        System.out.println(" ................................................");
    }
}

class pen extends Shop {
    void purchase(int quan) {
        this.quan = quan;
        System.out.println("The total price is " + quan * pen + "Rs");

    }
}

class book extends Shop {
    void purchase(int quan) {
        this.quan = quan;
        System.out.println("The total price is " + quan * book + "Rs");

    }
}

class longBook extends Shop {
    void purchase(int quan) {
        this.quan = quan;
        System.out.println("The total price is " + quan * longBook + "Rs");

    }
}

class drawingBook extends Shop {
    void purchase(int quan) {
        this.quan = quan;
        System.out.println("The total price is " + quan * drawingBook + "Rs");

    }

}

class bill extends Shop {
    void display() {
        super.display();
        System.out.println("\nWhat do you want : \n");

    }

}

public class Exp11_thiskeyword {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        bill b1 = new bill();
        b1.display();
        System.out.println("1 --> Pen\n2 --> Book\n3 --> LongBook\n4 --> DrawingBook\n");
        System.out.print("Tell your choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                pen p = new pen();
                System.out.println("\nThe price for the one pen is 5Rs\n");
                System.err.print("Enter the quantity of Pen : ");
                int quan = sc.nextInt();
                p.purchase(quan);
                break;
            case 2:
                book b = new book();
                System.out.println("\nThe price for the one book is 30Rs\n");
                System.err.print("Enter the quantity of Book : ");
                int quan1 = sc.nextInt();
                b.purchase(quan1);
                break;
            case 3:
                longBook l = new longBook();
                System.out.println("\nThe price for the one longbook is 50Rs\n");
                System.err.print("Enter the quantity of LongBook : ");
                int quan3 = sc.nextInt();
                l.purchase(quan3);
                break;
            case 4:
                drawingBook d = new drawingBook();
                System.out.println("\nThe price for the one DrawingBook is 70Rs\n");
                System.err.print("Enter the quantity of DrawingBook : ");
                int quan4 = sc.nextInt();
                d.purchase(quan4);
        }
        if (choice > 4) {
            System.out.println("Enter the correct choice .. ");
        } else {
            System.out.println("\tTHANK YOU !! \n\tVISIT AGAIN");
        }
        sc.close();
    }
}

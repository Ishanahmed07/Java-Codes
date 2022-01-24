//program to demonstrate heirarchial inheritance

import java.util.*;

//parent class
class Pattern {
    Scanner sc = new Scanner(System.in);
    int rows;

    void noofrows() {
        System.out.print("Enter the number of rows you want yor pattern to be of -->");
        rows = sc.nextInt();
        System.out.println("\n");
    }

    void choice() {
        System.out.println("Do you want to Continue : ");
        System.out.println("Press 1 --> Yes\nPress 2 --> No");
        System.out.println("Enter your chice : ");
        sc.nextInt();
    }
}

// 1st child class
class Pattern1 extends Pattern {
    void diamond() {
        int i, j;
        int space = rows - 1;
        for (j = 1; j <= rows; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= rows - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (rows - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }

}

// 2nd child class
class Pattern2 extends Pattern {
    void Sandglass() {
        int i, j, k;
        for (i = 0; i <= rows - 1; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = i; k <= rows - 1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (i = rows - 1; i >= 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = i; k <= rows - 1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }
}

// 3rd child class
class Pattern3 extends Pattern {
    void Pascals() {
        int i, j;
        for (i = 0; i <= rows - 1; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (i = rows - 1; i >= 0; i--) {
            for (j = 0; j <= i - 1; j++) {
                System.out.print("*" + " ");
            }

        }
        System.out.println("\n");
    }
}

// 4th child class
class Pattern4 extends Pattern {
    void Pyramid() {
        int i, j;
        for (i = 0; i < rows; i++) {

            for (j = rows - i; j > 1; j--) {

                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println("\n");
    }
}

public class heirarchialGUNJAN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("========================================================================");
        System.out.println("\t\t\tPATTERNS SHOP ");
        System.out.println("========================================================================");
        System.out.println(
                " WELCOME to our patterns shop!! \n Here you can design your own piece of clothing. You just have to select a pattern of your choice from the options we have \n and you will get your own customised clothing of the pattern of your own choice!!");
        int ch;
        do {
            System.out.println(
                    "-----------------------------------------------------------------------------------------------");
            System.out.println(
                    "\nTHESE ARE YOUR OPTIONS :\n\n (1)Diamond shaped pattern \n (2)Sandglass star pattern \n (3)Right Pascals Triangle Pattern \n (4)Pyramid Pattern\n (5)EXIT\n");
            System.out.print("Enter your choice ==> ");
            ch = s.nextInt();
            switch (ch) {
            case 1:
                Pattern1 p1 = new Pattern1();
                p1.noofrows();
                p1.diamond();
                // p1.choice();
                break;
            case 2:
                Pattern2 p2 = new Pattern2();
                p2.noofrows();
                p2.Sandglass();
                // p2.choice();

                break;
            case 3:
                Pattern3 p3 = new Pattern3();
                p3.noofrows();
                p3.Pascals();
                p3.choice();//

                break;
            case 4:
                Pattern4 p4 = new Pattern4();
                p4.noofrows();
                p4.Pyramid();
                // p4.choice();

                break;
            case 5:
                break;
            default:
                System.out.println("Please enter a valid choice!!");
            }

            System.out.println("Do you want to continue : ");
            System.out.println("Press 1 --> Yes\nPress 2 --> No");
            int opt = s.nextInt();
            if (opt == 1) {
            }

            System.out.println("Thank you for choosing Patterns shop!! Do visit again.");
            System.out.println("\n");
        } while (ch != 5);
        s.close();
    }
}
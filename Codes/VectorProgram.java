import java.util.*;

public class VectorProgram {
    public static void main(String[] args) {

        int n = -1, option;
        Vector<String> list = new Vector<String>();
        Scanner s = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("========================================");
        System.out.println("|            SHOOPING LIST             |");
        System.out.println("========================================");
        do {
            System.out.println("\t\t\t\n*****MAIN MENU******");
            System.out.println(
                    "\t\n1. Create a list\t\n2. Add an item to your list\t\n3. Remove an item from your list\t\n4. Display your list\t\n5. Exit\n");
            System.out.print("Choose an option --> ");
            option = s.nextInt();
            switch (option) {
            case 1:
                System.out.print("Enter the number of items you want to add in your list --> ");
                int no = s.nextInt();
                for (int i = 1; i <= no; i++) {
                    System.out.print("Enter item number " + i + "--> ");
                    String e = s.next();
                    list.add(e);
                    n++;
                }
                System.out.println("YOUR LIST HAS BEEN SUCCESSFULLY CREATED!");
                break;

            case 2:
                n++;
                System.out.println("Enter your item --> ");
                String e1 = s.next();
                list.add(e1);
                System.out.println(list.get(n) + " is added to your list");
                break;

            case 3:
                if (n == -1) {
                    System.out.println("LIST IS EMPTY!!!");
                } else {
                    System.out.print("Enter the item to be removed --> ");
                    int d = s.nextInt();
                    if (d > n) {
                        System.out.println("INCORRECT ITEM NUMBER!");
                    } else {
                        System.out.println(list.get(d - 1) + " is removed from the list");
                        list.remove(d - 1);
                        n--;
                    }
                }
                break;

            case 4:
                if (n == -1) {
                    System.out.println("LIST IS EMPTY!!");
                } else {
                    for (int j = 0; j <= n; j++) {
                        System.out.println(j + 1 + "." + list.get(j));
                    }
                }
                break;

            case 5:
                break;

            default:
                System.out.println("ENTER VALID OPTION!!");
                break;
            }
        } while (option != 5);
        s.close();
        {
            return;
        }

    }
}

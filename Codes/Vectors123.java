import java.util.*;

public class Vectors123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> list = new Vector<String>();
        System.out.println("\n________________________________________\n");
        System.out.println("\t ---:Employee List:---");
        System.out.println("________________________________________\n");
        int opt, count = 0;
        do {
            System.out.println(
                    "1.Create employee list\n2.Display the employee list\n3.Removing employee from list who left the job\n4.Total no of emplyees woring currently\n5.Clear the list\n6.EXIT");
            System.out.print("Enter your choice-->");
            opt = sc.nextInt();
            switch (opt) {
            case 1:
                // Inserting the employee names
                int s;
                System.out.println("Enter OK to STOP");
                do {
                    String name = sc.nextLine();
                    list.add(name);
                    if (name.length() == 2) {
                        s = -1;
                    } else {
                        s = 0;
                    }

                } while (s != -1);
                System.out.println("Employee list is created sucessfully...!\n");
                break;
            case 2:
                // Displaying the list
                int n = list.size();
                if (n == 0) {
                    System.out.println("LIST IS EMPTY !!!");
                } else {
                    System.out.println("\nEmployee List:-");
                    for (int i = 0; i < n - 1; i++) {
                        System.out.println(list.get(i));
                    }
                    System.out.println();
                }
                break;
            case 3:
                // Deleting the employee
                System.out.print("Name of employee you want to remove-->");
                String dlt = sc.nextLine();
                list.remove(dlt);
                System.out.println(dlt + " removed succesfully from the list");
                count++;
                break;
            case 4:
                // total number of emplyees working and who left the job
                System.out.println("Total number of employees working in this oranisation are " + (list.size() - 1));
                System.out.println("No of employees who retired from the job are " + count + "\n");
                break;
            case 5:
                // Deleting the whole list
                list.clear();
                System.out.println("Press 1 to create the new list\n");
                count = 0;
                break;
            case 6:
                break;
            default:
                System.out.println("Invalid choice...!\n");
                break;
            }
        } while (opt != 6);
        sc.close();
    }
}

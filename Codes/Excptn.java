import java.util.*;

class MarksOutOfLength extends Exception {
    public String getMessage() {
        return "Marks cannot be greater than 100 OR less than 0";
    }
}

public class Excptn {

    public static void input() throws MarksOutOfLength {
        System.out.println(" _______________________________________________________________________________________");
        System.out.println("|                                                                                       |");

        System.out.println("|                            M.H. SABOO SIDDIK COLLEGE                                  |");
        System.out
                .println("|_______________________________________________________________________________________|\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your Roll No. : ");
        int rn = sc.nextInt();
        System.out.println();

        String subjects[] = { "Physics", "Chemistry", "Maths", "Biology", "English", "Hindi" };
        int[] in = new int[6];
        for (int i = 0; i < in.length; i++) {
            System.out.print("Enter your marks in " + (i + 1) + " subject : ");
            in[i] = sc.nextInt();

            try {
                if (in[i] > 100 || in[i] < 0)
                    throw new MarksOutOfLength();
            } catch (MarksOutOfLength e) {
                System.out.println("\nException!.. Marks are not valid!..");
                System.out.println("Exception occur due to " + e);
                System.out.print("\nEnter the correct " + (i + 1) + " marks : ");
                in[i] = sc.nextInt();
                try {
                    if (in[i] > 100 || in[i] < 0)
                        throw new MarksOutOfLength();
                } catch (MarksOutOfLength e1) {
                    System.out.println("\nException!.. Marks are not valid!..");
                    System.out.println("Again you have entered invalid marks !......");
                    System.out.print("\nEnter the correct " + (i + 1) + " marks : ");
                    in[i] = sc.nextInt();

                }

                System.out.println();
            }
        }

        int total = 0;
        for (int j = 0; j < 6; j++) {
            total += in[j];
        }
        float percent = total / subjects.length;
        System.out.println(" _______________________________________________________________________________________");
        System.out.println("|                                                                                       |");

        System.out.println("|                            M.H. SABOO SIDDIK COLLEGE                                  |");
        System.out
                .println("|_______________________________________________________________________________________|\n");
        System.out.println();
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + rn);
        System.out.println();
        System.out.println(" ---------------------------------------------------------------------------------------");
        for (int l = 0; l < subjects.length; l++) {
            System.out.println("  " + subjects[l] + "  \t\t:  " + in[l]);

        }
        System.out.println(" ---------------------------------------------------------------------------------------");
        System.out.println("\n  Total   \t\t:  " + total);

        System.out.println("\n  Percentage   \t\t:  " + percent + "%");
        System.out.println(" ---------------------------------------------------------------------------------------");

        sc.close();
    }

    public static void main(String[] args) throws MarksOutOfLength {

        input();

    }
}

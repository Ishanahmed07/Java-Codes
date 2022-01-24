import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Input1 {
    int p;
    String mail;

    void check() throws IOException {
        Scanner s = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\t  --: LOGIN :--   ");
        System.out.print("\nEnter your email address : ");
        mail = s.next();
        int i = 0;
        System.out.print("Enter your password : ");
        while (i == 0) {
            try {
                p = Integer.parseInt(br.readLine());
                i++;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("\nPlease enter integer type data...");
                System.out.println("Exceptoin occured : " + e);
                System.out.print("\nEnter correct password again in integer : ");
            }

        }
        s.close();
    }

    void print() {
        System.out.println("\n");
        System.out.println(" __________________________________________________");
        System.out.println("|                                                  |");
        System.out.println("|           --: STUDENT DETAILS :--                |");
        System.out.println("|__________________________________________________|");
        System.out.println("|                                                  |");
        System.out.println("|                   --------                       |");
        System.out.println("|                  |    P   |                      |");
        System.out.println("|                  |    H   |                      |");
        System.out.println("|                  |    O   |                      |");
        System.out.println("|                  |    T   |                      |");
        System.out.println("|                  |    O   |                      |");
        System.out.println("|                   --------                       |");
        System.out.println("|                                                  |");
        System.out.println("|       EMAIL --> " + mail + "                  | ");
        System.out.println("|       PASSWORD --> " + p + "                          | ");
        System.out.println("|__________________________________________________|\n");

    }
}

public class Test {
    public static void main(String[] args) throws IOException {
        Input1 a = new Input1();
        a.check();
        a.print();
    }
}

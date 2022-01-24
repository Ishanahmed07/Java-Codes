
import java.util.*;

public class stringMethods {
    public static void main(String[] args) {
        String first = "", second = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("\n---------------------------------------------------------------------\n");
        String title = new String("\t\t   ****String Operation****");
        System.out.println(title.toUpperCase());
        System.out.print("---------------------------------------------------------------------\n\n");
        System.out.println();
        System.out.print("Enter the first Sting: ");
        first = sc.nextLine();
        System.out.print("Enter the second Sting: ");
        second = sc.nextLine();
        System.out.println("\nThe strings are: " + first + " & " + second + "\n");

        System.out.println("The length of the first string is :" + first.length());
        System.out.println("The length of the second string is :" + second.length() + "\n");

        System.out.println("The concatenation of first and second string is :" + first.concat(" " + second) + "\n");

        System.out.println("The first character of " + first + " is: " + first.charAt(0));
        System.out.println("The first character of " + second + " is: " + second.charAt(0) + "\n");

        System.out.println("The uppercase of " + "'" + first + "'" + " is: " + first.toUpperCase());
        System.out.println("The lowercase of " + "'" + first + "'" + " is: " + first.toLowerCase() + "\n");

        System.out.println("The uppercase of " + "'" + second + "'" + " is: " + second.toUpperCase());
        System.out.println("The lowercase of " + "'" + second + "'" + " is: " + second.toLowerCase() + "\n");

        System.out.print("Enter your email : ");
        String in = sc.nextLine();
        int indexOf = in.indexOf('@');
        String in1 = in.substring(0, indexOf);
        System.out.println("Email --> " + in);
        System.out.println("Username --> " + in1);
        System.out.println();

        System.out.print("Enter a character to know a position in \'" + first + "\' : ");
        String str = sc.next();
        char c = str.charAt(0);
        System.out.println("The " + c + " occurs at position " + first.indexOf(c) + " in " + first + "\n");

        System.out.println("Enter the character you want to replace in first string : ");
        char brep = sc.next().charAt(0);
        System.out.println("Enter the replacing character : ");
        char arep = sc.next().charAt(0);
        System.out.printf("Replacing \'%c\' with \'%c\' in " + first + " is: " + first.replace(brep, arep) + "\n", brep,
                arep);
        System.out.println();
        System.out.print("Checking the equality of string.\n");

        boolean check = first.equals(second);
        if (!check) {
            System.out.println(first + " and " + second + " are not same.");
        } else {
            System.out.println(first + " and " + second + " are same.\n\n");
        }

        System.out.println("\n\n**Program to demonstrate the occurance of vowel in a string**\n");
        System.out.print("Enter a string/sentance : ");
        String s = sc.next();
        s = s.toLowerCase();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (ch == 'a') {
                ++a;
            } else if (ch == 'e') {
                ++e;
            } else if (ch == 'i') {
                ++i;
            } else if (ch == 'o') {
                ++o;
            } else if (ch == 'u') {
                ++u;
            }
        }
        System.out.println("a-->" + a);
        System.out.println("e-->" + e);
        System.out.println("i-->" + i);
        System.out.println("o-->" + o);
        System.out.println("u-->" + u);

        sc.close();
    }
}
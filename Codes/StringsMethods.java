import java.util.*;

public class StringsMethods {
    public static void main(String[] args) {
        String name = "Java";
        int a = name.length();
        System.out.println(a);

        String n = "JAVA";
        String nm = n.toLowerCase(Locale.ROOT);
        System.out.println(nm);

        String s = "java";
        String j1 = s.toUpperCase(Locale.ROOT);
        System.out.println(j1);

        String nonTrimmedString = "    Harry   ";
        System.out.println(nonTrimmedString); // This will print the string as it is with spaces
        String Trimmed = nonTrimmedString.trim();
        System.out.println(Trimmed);
        System.out.println(nonTrimmedString.trim()); // This will print the string as it is with 0 spaces

        String sub = "Party Cloud";
        System.out.println(sub.substring(4)); // print string from the given index excluding before index
        System.out.println(sub.substring(4, 9)); // print from the start n end point of the string

        String na = "Harry";
        System.out.println(na.replace('r', 'p')); // Replace a particular char from the string

        String h = "Happy";
        System.out.println(h.startsWith("h")); // This will print false as h is in lower case
        System.out.println(h.startsWith("H")); // java is case sensitive

        String t = "Happy";
        System.out.println(t.endsWith("y"));
        System.out.println(t.endsWith("r"));

        String g = "Character";
        System.out.println(g.charAt(4)); // Will show a character at particular index

        String p = "Character";
        System.out.println(p.indexOf("t"));
        System.out.println(p.indexOf("a"));

        String u = "Second Semester";
        System.out.println(u.indexOf("e", 2));
        System.out.println(u.indexOf("s", 2));

        // Escape sequence
        System.out.println("This is a \\ backslash");
        System.out.println("This is a \' inverted comma");
    }
}

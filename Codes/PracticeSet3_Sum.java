
public class PracticeSet3_Sum {
    public static void main(String[] args) {

        // Question 1
        String st = "COMPLETED";
        System.out.println(st.toLowerCase());

        // Question 2
        String s = "   Java  ";
        System.out.println(s.replace(" ", "_"));

        // Question 3
        String a = "Harry";
        System.out.println("Dear " + a + ", Thanks a lot");
        String y = a.replace("Harry", "Java");
        System.out.println("Dear " + y + ", Thanks a lot");

        // Question 4
        String g = "This is a string contains  Double and Triple spaces";
        System.out.println(g.indexOf("  "));
        System.out.println(g.indexOf("   "));

        // Question 5
        System.out.println("\"Dear Harry , This java course is nice . Thanks\"");
    }
}

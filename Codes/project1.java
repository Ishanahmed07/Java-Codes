import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your CGPA of 5 Subjects");
        System.out.println("Enter G1 : ");
        double a = sc.nextInt();
        System.out.println("Enter G2 : ");
        double b = sc.nextInt();
        System.out.println("Enter G3 : ");
        double c = sc.nextInt();
        System.out.println("Enter G4 : ");
        double d = sc.nextInt();
        System.out.println("Enter G5 : ");
        double e = sc.nextInt();
        double Sum = a + b + c + d + e;
        double Total = Sum / 5;
        System.out.print("The Total CGPA is ");
        System.out.println(Total);
        sc.close();
    }
}

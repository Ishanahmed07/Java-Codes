
import java.util.*;

class custom {
    double r;
    double Area;

    public void display() {
        System.out.println("The area is of the circle is " + Area + ".");
    }
}

public class Experiments {
    public static void main(String[] args) {
        // System.out.println("This is our main class.");
        custom cal = new custom();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius : ");
        cal.r = s.nextInt();

        cal.Area = cal.r * cal.r * 3.14;
        cal.display();
        s.close();
    }

}

//
//// Program to illustrate the Inout methods in the java
//
// import java.util.*;
// import java.io.*;
//
//// Taking the information of the student from the user.
//
// public class Experiments {
// public static void main(String args[]) throws IOException {
// DataInputStream dis = new DataInputStream(System.in);
// Scanner sc = new Scanner(System.in);
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
// System.out.println("Enter your Roll no: ");
// int rn = Integer.parseInt(dis.readLine());
//
// System.out.println("Enter your percentage(%): ");
// float marks = sc.nextFloat();
//
// System.out.println("You are promoted to next class.");
// boolean pass = Boolean.parseBoolean(br.readLine());
//
// String name = args[0];
//
// System.out.println(
// "Name: " + name + " " + "Percentage: " + marks + " " + "You are promoted to
// the next class: " + pass);
// System.out.println("Roll no: " + rn);
//
// }
// }
//
//
//
//
//

/*
 * //import java.io.BufferedReader; //import java.io.DataInputStream; //import
 * java.io.IOException; //import java.io.InputStreamReader; //import
 * java.util.Scanner; import java.util.*; import java.io.*;
 * 
 * public class Experiments {
 * 
 * public static void main(String []args)throws IOException { DataInputStream
 * dis = new DataInputStream(System.in); Scanner sc = new Scanner (System.in);
 * BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 * 
 * 
 * System.out.println("Enter the Id:"); int id
 * =Integer.parseInt(dis.readLine());
 * 
 * System.out.println("Enter the salary:"); float sal = sc.nextFloat();
 * 
 * System.out.println("Eligible for promotion:"); boolean pro
 * =Boolean.parseBoolean(br.readLine());
 * 
 * String name=args[10];
 * 
 * System.out.println("Name : "+name); System.out.println("Salary :"+sal );
 * System.out.println("Id :"+id);
 * System.out.println("Eligibility for promotion :"+pro);
 * 
 * } }
 * 
 */

/*
 * Scanner sc = new Scanner(System.in); System.out.println("Enter the year : ");
 * int yr = sc.nextInt();
 * 
 * if (yr%4==0 && yr%100!=0 || yr%400==0){
 * System.out.printf("%d is a leap year.",yr); } else {
 * System.out.printf("%d is not a leap year",yr); }
 */
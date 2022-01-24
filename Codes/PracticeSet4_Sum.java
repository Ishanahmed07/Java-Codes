import java.util.Scanner;

public class PracticeSet4_Sum {
    public static void main(String[] args) {

        // //Question 1
        // int a = 10;
        // if (a == 11) {
        // System.out.print("I am 11");
        //
        // } else {
        // System.out.print("I am not 11");
        //
        // }

        // //Question 2
        // byte m1,m2,m3;
        // Scanner = new Scanner(System.in);
        // System.out.println("Enter your Physics marks : ");
        // m1 = scanner.nextByte();
        // System.out.println("Enter your Chemistry marks : ");
        // m2 = scanner.nextByte();
        // System.out.println("Enter your Mathematics marks : ");
        // m3 = scanner.nextByte();
        // float avg = (m1+m2+m3)/3.0f;
        // System.out.println("Your overall percentage is : "+avg);
        // if (m1 >= 33 && m2 >= 33 && m3 >=33){
        // System.out.println("You are passed");
        // }
        // else{
        // System.out.println("You are fail");
        // }

        // //Question 3
        // float tax = 0;
        // Scanner i = new Scanner(System.in);
        // System.out.println("Enter the amount : ");
        // float income = i.nextFloat();
        // if (income <= 2.5f){
        // tax = tax + 0.0f;
        // }
        // else if (income > 2.5 && income <=5 ){
        // tax = tax+0.05f*(income-2.5f);
        // }
        // else if (income > 5 && income <= 10){
        // tax = tax+0.05f*(5f-2.5f);
        // tax = tax + 0.2f*(income - 5f);
        //
        // }
        // else if (income >= 10){
        // tax = tax+0.05f*(5f-2.5f);
        // tax = tax + 0.2f*(10f - 5f);
        // tax = tax + 0.3f*(income - 10f);
        //
        // }
        // System.out.println("The total tax to pay is : "+tax);
        //

        // //Question 4
        // Scanner week = new Scanner(System.in);
        // System.out.print("Enter a number for a day : ");
        // int a = week.nextInt();
        // switch (a){
        // case 1 :
        // System.out.println("Monday");
        // break;
        // case 2 :
        // System.out.println("Tuesday");
        // break;
        // case 3 :
        // System.out.println("Wednesday");
        // break;
        // case 4 :
        // System.out.println("Thursday");
        // break;
        // case 5 :
        // System.out.println("Friday");
        // break;
        // case 6 :
        // System.out.println("Saturday");
        // break;
        // case 7 :
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Enter the correct value");
        // }
        // System.out.println("Thanks!...");

        // //Question 5
        // Scanner y = new Scanner(System.in);
        // System.out.println("Enter a year : ");
        // int year = y.nextInt();
        // if (year%4==0 || year%100==0 || year%400==0 ){
        // System.out.println("The entered year is leap year.");
        // }
        // else{
        // System.out.println("The entered year is not a leap year.");
        // }

        // Question 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a website : ");
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an Organization Website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a Commercial Website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian Website");
        }
        sc.close();
    }
}

// % (marks/total) * 100
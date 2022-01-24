// Program to demonstrate the hierarchical inheritance

import java.util.*;

/* Parent class */
class Student {
    String name;
    int rn;
    String dob;
    int marks[] = new int[5];
    String sub[] = new String[5];

    void display(String name, int rn, String dob) {
        System.out.println("\n\tM.H.Saboo Siddik College of Engineering,Bycula");
        System.out.println("===============================================================");
        System.out.println("\n Name of student : " + name);
        System.out.println(" Roll no : " + rn);
        System.out.println(" Date of birth : " + dob);
        System.out.println(" College : M.H.Saboo Siddik College");
    }

    static void percentage(String[] sub, int[] marks) {
        int total = 0;
        System.out.println("\nYour marks in the final exam are as following:\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(" " + sub[i] + " : " + marks[i]);
            total += marks[i];
        }
        double result = total / 5;
        System.out.println("\nYour percentage is " + result + "%");
    }

    int fail = 0;

    void result() {
        for (int i = 0; i < 5; i++) {
            if (marks[i] < 35) {
                fail++;
            }
        }
        if (fail == 0) {
            System.out.println("Congrajulations...!, You have sucessfully passed the board exams.");
        } else {
            System.out.println("You are failed in " + fail + " subjects...!\nBetter luck next time.");
        }
    }
}

/* Child class */
class scistudent extends Student {
    double E;
    double M;
    Scanner sc = new Scanner(System.in);
    String sub[] = { "Physics", "Chemistry", "Mathematics", "Biology", "English" };

    void inputsMarks() {
        double M;
        double E;
        System.out.println("\nEnter your marks:");
        for (int i = 0; i < 5; i++) {
            System.out.print(sub[i] + ": ");
            marks[i] = (int) sc.nextDouble();
        }

        E = (marks[0] + marks[1] + marks[2]) / 3;
        M = (marks[0] + marks[1] + marks[3]) / 3;

        if (E > M) {
            Sdsgn = E;
        } else {
            Mdsgn = M;
        }
    }

    double Sdsgn;
    double Mdsgn;
    double dsgn;

    void result() {
        super.result();
        if (fail == 0) {
            System.out.println(Sdsgn + " " + Mdsgn);
            System.out.println("\nField you should choose for further education");
            if (Sdsgn >= 75) {
                System.out.println("Engineering Fields:\n1.CS\n2.IT\n3.EXTC\n4.MECH\n5.CIVIL");
            } else if (Mdsgn >= 75) {
                System.out.println("Medical Fields:\n1.MBBS\n2.BAMS\n3.BHMS");
            }
        }
    }
}

/* Child class */
class comstudent extends Student { /* Child class */
    String sub[] = { "Economics", "Buiseness Studies", "Mathematics", "Accountancy", "English" };

}

public class Exp8_Inheritancesudarshan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tM.H.Saboo Siddik College of Engineering,");
        System.out.println("\t\t\tByculla");
        System.out.println("===============================================================");
        System.out.println("\t\t--:Enter your details:-- \n");
        System.out.print("Enter your name--> ");
        String name = sc.next();
        System.out.print("Enter your roll no--> ");
        int rn = sc.nextInt();
        System.out.print("Enter your D.O.B.--> ");
        String dob = sc.next();
        System.out.print("\nSelect your Stream : ");
        System.out.print("1.Science\t2.Commerce\nEnter your choice --> ");
        int opt = sc.nextInt();
        switch (opt) {
        case 1:
            scistudent s1 = new scistudent();
            s1.inputsMarks();
            s1.display(name, rn, dob);
            System.out.println(" Stream: Scince\n");
            scistudent.percentage(s1.sub, s1.marks);
            s1.result();
            System.out.println("\n\t   --:Thank You, " + name + ":--\n");
            System.out.println("===============================================================");
            break;
        case 2:
            comstudent c1 = new comstudent();
            System.out.println("\nEnter your marks:");
            for (int i = 0; i < 5; i++) {
                System.out.print(c1.sub[i] + ": ");
                c1.marks[i] = sc.nextInt();
            }
            c1.display(name, rn, dob);
            System.out.println(" Your Stream: Commerce\n");
            comstudent.percentage(c1.sub, c1.marks);
            c1.result();
            System.out.println("\n\t--:Thank You, " + name + ":--\n");
            System.out.println("===============================================================");
            break;
        default:
            System.out.println("Invalid choice...!!!");
            break;
        }
        sc.close();
    }
}

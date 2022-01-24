import java.io.*;
import java.util.*;

public class Tausif {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Sub[] = { "Engineering Mathematics-III", "Data Structure", "DSGT", "DLCOA", "Computer Graphics" };
        Vector<String> StudName = new Vector<>();
        Vector<String> MotherName = new Vector<>();
        Vector<String> StudSeatNo = new Vector<>();
        int lastindex = 0;
        int StudMarks[][] = new int[50][5];
        StudenData stu = new StudenData(StudName, StudSeatNo, StudMarks, MotherName, Sub);
        PrintResul res = new PrintResul(StudName, StudSeatNo, StudMarks, MotherName, Sub);
        int cont = 1;
        // int entryindex;
        do {
            System.out.println("1.ADD STUDENT RESULT\n2.CHECK STUDENT RESULT");
            int ch = Integer.parseInt(br.readLine());
            if (ch == 1) {
                lastindex = stu.InsertData(lastindex);
            } else if (ch == 2) {
                String SNo;
                String Mname;
                System.out.println("Enter the Seat number of Student");
                SNo = br.readLine();
                System.out.println("Enter Mothers name");
                Mname = br.readLine();
                int i = 0;
                while (!(SNo.equals(StudSeatNo.get(i)) && Mname.equals(MotherName.get(i)))) {
                    try {

                        while (!(SNo.equals(StudSeatNo.get(i)) && Mname.equals(MotherName.get(i)))) {
                            i++;

                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.err.println("Please enter correct Seat Number / Mother's Name\n");
                        System.out.println("Enter the Seat number of Student again");
                        SNo = br.readLine();
                        System.out.println("Enter Mothers name again");
                        Mname = br.readLine();
                        i = 0;

                    }

                }
                res.SeeReslt(i);

            }
            System.out.println("Press 1 to continue and any other key for EXIT");
            cont = Integer.parseInt(br.readLine());

        } while (cont == 1);
    }
}

class StudenData {
    Vector<String> StudentName;
    Vector<String> Mothername;
    Vector<String> SearNo;
    int Marks[][];
    String[] sub;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);

    public StudenData(Vector<String> studName, Vector<String> studSeatNo, int[][] studMarks, Vector<String> motherName,
            String[] Sub) {
        StudentName = studName;
        Mothername = motherName;
        SearNo = studSeatNo;
        Marks = studMarks;
        sub = Sub;
    }

    int InsertData(int lastindex) throws IOException {
        int numb = 0;
        String Name;
        String motherName;
        int marks = -2;
        String seatno = "0";
        System.out.println("For how many students you want to enter the data");
        while (numb == 0) {
            try {
                numb = Integer.parseInt(br.readLine());
            } catch (InputMismatchException | NumberFormatException e) {

                System.err.println("Entered value is not a number please enter number again");
            }
        }
        int i;
        for (i = lastindex; i < (lastindex + numb); i++) {

            System.out.println("Enter the NAME of student");
            Name = br.readLine();
            StudentName.add(Name);

            System.out.println("Enter the MOTHER NAME of student");
            motherName = br.readLine();
            Mothername.add(motherName);

            seatno = "0";
            System.out.println("Enter the 6 digit Seat Number of the student");
            while (seatno.length() != 6)
                try {
                    seatno = br.readLine();
                    if (seatno.length() != 6) {
                        MyException me = new MyException("Wrong entry ! Please Enter the 6 digit roll number again");
                        throw me;
                    }
                } catch (MyException me) {

                }
            SearNo.add(seatno);

            for (int j = 0; j < 5; j++) {

                System.out.println("Enter the marks of student " + (i + 1) + " in " + sub[j]);
                marks = Integer.parseInt(br.readLine());
                while (marks < 0 || marks > 100) {
                    try {
                        MyException me = new MyException("Wrong entry please enter the marks again between 0 to 100");
                        throw me;

                    } catch (MyException me) {
                        marks = Integer.parseInt(br.readLine());
                    }
                }
                Marks[i][j] = marks;

            }
        }
        return i;
    }

    static class MyException extends Exception {
        String str;

        MyException(String str) {
            this.str = str;
            System.err.println(str);
        }
    }
}

class PrintResul extends StudenData {

    public PrintResul(Vector<String> studName, Vector<String> studSeatNo, int[][] studMarks, Vector<String> motherName,
            String[] Sub) {
        super(studName, studSeatNo, studMarks, motherName, Sub);
    }

    void SeeReslt(int n) {
        System.out.println("________________________________________________________________________________________");
        System.out.println("| CANDIDATE NAME : " + StudentName.get(n));
        System.out.println("|_______________________________________________________________________________________|");
        System.out.println("| MOTHER'S NAME  : " + Mothername.get(n));
        System.out.println("|_______________________________________________________________________________________|");
        System.out.println("| SEAT NO : " + SearNo.get(n)
                + "                             | BRANCH : COMPUTER ENGINEERING          |");
        System.out.println("|______________________________________________|________________________________________|");
        System.out.println("\n");

        System.out.println("_________________________________________________________________________________________");
        System.out
                .println("|     SUBJECT NAME AND CODE    |     REQ.MARKS   |    OBTAINED MARKS   |    MAX MARKS    |");
        System.out
                .println("|______________________________|_________________|_____________________|_________________|");
        System.out.println(
                "|" + sub[0] + "   | \t 35    " + "    \t |\t\t" + Marks[n][0] + "              |\t\t100   \t |");
        System.out
                .println("|______________________________|_________________|_____________________|_________________|");
        System.out.println("|" + sub[1] + "                |      35         |      " + Marks[n][1]
                + "             |      100     \t |");
        System.out
                .println("|______________________________|_________________|_____________________|_________________|");
        System.out.println("|" + sub[2] + "                          |      35         |      " + Marks[n][2]
                + "             |      100      \t |");
        System.out
                .println("|______________________________|_________________|_____________________|_________________|");
        System.out.println("|" + sub[3] + "                         |      35         |      " + Marks[n][3]
                + "             |      100    \t |");
        System.out
                .println("|______________________________|_________________|_____________________|_________________|");
        System.out.println("|" + sub[4] + "             |      35         |      " + Marks[n][4]
                + "             |      100    \t |");
        System.out
                .println("|______________________________|_________________|_____________________|_________________|");
    }
}

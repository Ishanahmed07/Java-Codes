import java.util.*;

public class Game {
    public static void main(String[] args) {
        Random r = new Random();
        int rand = r.nextInt(4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("HELLO! Have a nice day");
        System.out.println("Let's Start the game.");
        System.out.println("NOTE :");
        System.out.printf("1 is for Stone\n");
        System.out.printf("2 is for paper\n");
        System.out.printf("3 is for Scissor\n");
        System.out.print("Enter a number  : ");
        int num = scanner.nextInt();
        if (num > 3) {
            System.out.println("Enter a correct number .");
        }
        switch (num) {
        case 1:
            if (rand == 1) {
                System.out.println("Tie!");
            } else if (rand == 2) {
                System.out.println("Loss!..");
            } else if (rand == 3) {
                System.out.println("****WIN!****");
            }

        case 2:
            if (num == 2 && rand == 1) {
                System.out.println("****WIN!****");
            } else if (num == 2 && rand == 2) {
                System.out.println("Tie!");
            } else if (num == 2 && rand == 3) {
                System.out.println("Loss!..");
            }

        case 3:
            if (num == 3 && rand == 1) {
                System.out.println("Loss!..");
            } else if (num == 3 && rand == 2) {
                System.out.println("****WIN!****");
            } else if (num == 3 && rand == 3) {
                System.out.println("Tie!");
            }
        }
        scanner.close();
    }

}

import java.util.*;

public class arkaan {
    public static void main(String[] args) {

        // public static void main(String args[]){

        int max = 10;
        int min = 1;

        int wrong = 0; // number of times guessed wrong
        int attempts = 3; // total attempts
        int keepGoing = 1;

        System.out.println("This is the one and only guessing game!");
        System.out.println("Please guess a number between 1 and 10");

        while (keepGoing == 1) {
            int x = 1;
            int rnd = (int) (Math.random() * ((max - min) + 1)) + min; // computer's random number
            attempts = 3; // reset afer each loop
            do {
                try {
                    Scanner scan = new Scanner(System.in);
                    int guessInt = scan.nextInt();
                    x = 2; // directions followed
                    if (guessInt == rnd) {
                        System.out.println("Winner! The correct number was " + rnd);
                        System.out.println("Play Again: Press 1, Quit: Press 2");
                        int winAgain = scan.nextInt();
                        x = 2; // directions followed
                        if (winAgain == 1) {
                            System.out.println("Please guess a number between 1 and 10");
                            keepGoing = 1;
                            wrong = 0;// reset number of wrong guesses
                            x = 2; // directions followed
                        } else if (winAgain == 2) {
                            x = 2; // directions followed
                            System.exit(0); // rage quit
                        }
                    } else if (guessInt != rnd) {
                        wrong += 1;
                        attempts = 3 - wrong;
                        System.out.println("WRONG! Attempts Remaining: " + attempts);
                    }

                    if (wrong == 3) {// after 3 fails:
                        System.out.println("MISSION FAILED! The Correct Answer Was: " + rnd);
                        System.out.println("Play Again: Press 1, Quit: Press 2");
                        int failAgain = scan.nextInt();
                        if (failAgain == 1) {
                            System.out.println("Please guess a number between 1 and 10");
                            keepGoing = 1;
                            wrong = 0;// reset number of wrong guesses
                            x = 2; // directions followed
                        } else if (failAgain == 2) {
                            x = 2; // directions followed
                            System.exit(0); // rage quit
                        }
                    } else if (wrong != 3) {
                        keepGoing = 1;
                    }
                    scan.close();
                } // try
                catch (Exception e) {// error handling
                    System.out.println("Follow the directions!");
                }
            } while (x == 1);// do (keep looping until directions are followed and x = 2)
        } // while
    } // method

} // class
  // ARKAAN KHAN
  // }}

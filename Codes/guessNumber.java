
import java.util.Random;
import java.util.*;

class Game1 {
    int inputNumber;
    int randomNumber;
    int numberOfGuesse = 0;

    Game1() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100);
        System.out.println(randomNumber);
    }

    void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number ");
        inputNumber = sc.nextInt();
        sc.close();
    }

    boolean isCorrect() {
        numberOfGuesse++;
        if (inputNumber == randomNumber) {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", inputNumber,
                    numberOfGuesse);
            return true;
        } else if (inputNumber < randomNumber) {
            System.out.println("Too low...");
        } else if (inputNumber > randomNumber) {
            System.out.println("Too high...");
        }
        return false;
    }

    void setnumberOfGuesse(int numberOfGuesse) {
        this.numberOfGuesse = numberOfGuesse;

    }

    int getnumberOfGuesse() {
        return numberOfGuesse;
    }
}

public class guessNumber {
    public static void main(String[] args) {

        Game1 g = new Game1();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrect();
        }
    }
}

/*
 * import java.util.Random; import java.util.*;
 * 
 * class Game1 { public int number; public int inputNumber; public int
 * noOfGuesses = 0;
 * 
 * public int getNoOfGuesses() { return noOfGuesses; }
 * 
 * public void setNoOfGuesses(int noOfGuesses) { this.noOfGuesses = noOfGuesses;
 * }
 * 
 * Game1() { Random rand = new Random(); this.number = rand.nextInt(100); }
 * 
 * void takeUserInput() { Scanner sc = new Scanner(System.in);
 * System.out.println("Guess the number"); inputNumber = sc.nextInt();
 * sc.close(); }
 * 
 * boolean isCorrectNumber() { noOfGuesses++; if (inputNumber == number) {
 * System.out.
 * format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts",
 * number, noOfGuesses); return true; } else if (inputNumber < number) {
 * System.out.println("Too low..."); } else if (inputNumber > number) {
 * System.out.println("Too high..."); } return false; }
 * 
 * }
 * 
 * public class guessNumber { public static void main(String[] args) {
 * 
 * Game1 g = new Game1(); boolean b = false; while (b != true) {
 * g.takeUserInput(); b = g.isCorrectNumber(); // System.out.println(b); }
 * 
 * } }
 */
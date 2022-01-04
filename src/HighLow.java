import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class HighLow {
    //Game picks a random number between 1 and 100.
    //Prompts user to guess the number.
    //All user inputs are validated.
    //If user's guess is less than the number, it outputs "HIGHER".
    //If user's guess is more than the number, it outputs "LOWER".
    //If a user guesses the number, the game should declare "GOOD GUESS!"
    //Hints
    //
    //Use the random method of the java.lang.Math class to generate a random number.
    //Bonus
    //
    //Keep track of how many guesses a user makes.
    //Set an upper limit on the number of guesses.
    public static Scanner scanner = new Scanner(System.in);

    public static void guessingGame () {
        boolean playAgain = true;

        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        randomNumber += 1;

        while (playAgain) {
            System.out.print("Enter a number between 1 and 100: ");
            int userNumber = scanner.nextInt();

            //if userNumber is greater than random number say lower, higher, match, etc.

            System.out.println("Would you like to play again?");
            System.out.print("Press \'Y\' to continue or any other key to exit. ");
            String response = scanner.next().toLowerCase();
            if (response.equals("y")) {
                playAgain = true;
            }else {
                System.out.println("Exiting...");
                playAgain = false;
            }
        }
    }// end guessingGame

    public static void main(String[] args) {
        guessingGame();
    }
}

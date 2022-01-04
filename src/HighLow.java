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

        while (playAgain) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(100);
            randomNumber += 1;

            boolean notMatch = true;

            while (notMatch) {
                System.out.print("Enter a number between 1 and 100: ");
                int userNumber = scanner.nextInt();
                if (randomNumber > userNumber) {
                    System.out.println("HIGHER");
                }else if (randomNumber < userNumber) {
                    System.out.println("LOWER");
                }else {
                    System.out.println("GOOD GUESS!");
                    notMatch = false;
                }
            }

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

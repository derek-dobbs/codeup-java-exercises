import java.util.Scanner;

public class ConsoleExercises {
    public static void  main(String[] args) {
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        Copy this code into your main method:
        double pi = 3.14159;

        Write some Java code that uses the variable pi to output the following:
        The value of pi is approximately 3.14.

        Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
         */
        double pi = 3.14159;

//        System.out.format("The value of pi is approximately %.2f%n", pi);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        What happens if you input something that is not an integer?
        //If the input is not an integer there will be an error message "InputMismatchException"

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter an integer: ");
//        String userInput = scanner.next();
//        int userInput = scanner.nextInt();

//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        System.out.printf("You entered: %d%n", userInput);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        What happens if you enter less than 3 words?
        What happens if you enter more than 3 words?
         */
//        System.out.println("\t\t\tEnter three words");
//
//        System.out.print("Enter the first word: ");
//        String firstWord = scanner.nextLine();
//
//        System.out.printf("%nEnter the second word: ");
//        String secondWord = scanner.nextLine();
//
//        System.out.printf("%nEnter the third word: ");
//        String thirdWord = scanner.nextLine();
//
//        System.out.printf("You entered: %n%s%n%s%n%s", firstWord, secondWord, thirdWord);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("Enter a sentence: ");
        String userSentence = scanner.nextLine();

        System.out.printf("%nYou entered: %s.", userSentence);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }//end main
}//end class

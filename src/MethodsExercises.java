import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static Scanner scanner = new Scanner(System.in);

    public static double addNumbers (double num1, double num2) {
        return num1 + num2;
    }

    public static double subtractNumbers (double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplyNumbers (double num1, double num2) {
        return num1 * num2;
//        for(int i = 1; i < num2; i++) {
//            System.out.println(num1);
//            num1 += num1;
//        }
//        return num1;
        //not getting correct output when using loop

        
    }

    public static double divideNumbers (double num1, double num2) {
        if(num1 == 0 || num2 == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return num1 / num2;
    }

    public static double modulusNumbers (double num1, double num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int number = scanner.nextInt();

        if (number < min || number > max ) {
            System.out.println("Number is out of range. Try again");
            return getInteger(min, max);
        }
        return number;
    }

    public static void showFactoral () {
        int num = getInteger(1, 10);
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
            System.out.println(i + "! = " + result);
        }

        System.out.println("Would you like to enter another number?");
        System.out.println("Press \'Y\' to continue or any other key to exit.");
        String confirmation = scanner.next().toLowerCase();

        if (confirmation.equals("y")) {
            showFactoral();
        }else {
            System.out.println("Exiting...");
        }
        System.exit(0);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Create an application that simulates dice rolling.
    public static void rollDice () {
        //Ask the user to enter the number of sides for a pair of dice.
        System.out.println("Welcome to Dice Roller!");
        System.out.print("Enter the number of sides for each die: ");
        Scanner scanner = new Scanner(System.in);
        int sides = scanner.nextInt();
        boolean goAgain = true;

        while (goAgain) {
            //Prompt the user to roll the dice.
            System.out.println("Press \'R\' to roll the dice or any other key to exit.");
            String response = scanner.next().toLowerCase();

            if (response.equals("r")) {
                Random rand = new Random();
                Random rand2 = new Random();
                int die1 = rand.nextInt(sides);
                die1 += 1;
                int die2 = rand.nextInt(sides);
                die2 += 1;
                System.out.printf("Die 1: %d, Die 2: %d", die1, die2);
            }else {
                System.out.println("Exiting...");
                System.exit(0);
            }
            System.out.println("\nWould you like to roll again?");
            System.out.print("Press \'Y\' to continue or any other key to exit. ");
            String rollAgainResponse = scanner.next().toLowerCase();

            if (rollAgainResponse.equals("y")) {
                goAgain = true;
            }else {
                goAgain = false;
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
//        System.out.println(addNumbers(4, 2));
//        System.out.println(subtractNumbers(4, 2));
//        System.out.println(multiplyNumbers(5, 5));
//        System.out.println(divideNumbers(4, 0));
//        System.out.println(modulusNumbers(4, 2));
//        showFactoral();
//        rollDice();
    }//end main
}//end class

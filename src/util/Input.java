package util;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public Input () {

    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        System.out.println("Please enter a value: ");
        String userInput = scanner.nextLine();
        System.out.printf("You have entered %s%n", userInput);
        return userInput;
    }

    public boolean yesNo() {
        System.out.println("Would you like to continue? ");
        String response = scanner.nextLine();
        if (response.toLowerCase().equals("Y") || response.toLowerCase().equals("y") || response.toLowerCase().equals("Yes") || response.toLowerCase().equals("yes")) {
            return true;
        }else {
            return false;
        }
    }

    public static int getInt(int min, int max) {
        boolean outOfRange = true;
//        Scanner sc = setScanner();
        Scanner sc = new Scanner(System.in);
        int userInput;
        do {
            System.out.printf("Enter a number between %d and %d. ", min, max);
            userInput = sc.nextInt();
            if (userInput >= min && userInput <= max) {
                outOfRange = false;
            }
        }while (outOfRange);
        return userInput;
    }
//
//    public int getInt() {
//
//    }
//
//    public double getDouble (double min, double max) {
//
//    }
//
//    public double getDouble () {
//
//    }

//    public static class InputTest {
//        public static void main(String[] args) {
////            System.out.println(yesNo("y"));
////            System.out.println(getInt(1, 10));
//        }// end psvm
//
//    }//end class InputTest
}//end class Input



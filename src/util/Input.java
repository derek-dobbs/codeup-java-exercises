package util;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input () {

    }

    public Scanner getScanner() {
        return scanner;
    }

    public Scanner setScanner(Scanner scanner) {
        return scanner = new Scanner(System.in);
    }

    public String getString(String string) {
        return string;
    }

    public static boolean yesNo(String input) {
        if (input.toLowerCase().equals("Y") || input.toLowerCase().equals("y") || input.toLowerCase().equals("Yes") || input.toLowerCase().equals("yes")) {
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

    public static class InputTest {
        public static void main(String[] args) {
//            System.out.println(yesNo("y"));
            System.out.println(getInt(1, 10));
        }// end psvm

    }//end class InputTest
}//end class Input



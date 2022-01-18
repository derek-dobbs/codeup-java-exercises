//package util;
//
//import java.util.Locale;
//import java.util.Scanner;
//
//public class Input {
//    private Scanner scanner = new Scanner(System.in);
//
//    public Input () {
//
//    }
//
//    public Scanner getScanner() {
//        return scanner;
//    }
//
//    public void setScanner(Scanner scanner) {
//        this.scanner = scanner;
//    }
//
//    public String getString(String s) {
//        System.out.println("Please enter a value: ");
//        String userInput = scanner.nextLine();
//        System.out.printf("You have entered %s%n", userInput);
//        return userInput;
//    }
//
//    public static boolean yesNo(String prompt) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(prompt);
//        String response = scanner.nextLine();
//        if (response.toLowerCase().equals("Y") || response.toLowerCase().equals("y") || response.toLowerCase().equals("Yes") || response.toLowerCase().equals("yes")) {
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//    public int getInt(int min, int max) {
//        boolean outOfRange = true;
////        Scanner sc = setScanner();
//        Scanner sc = new Scanner(System.in);
//        int userInput;
//        do {
//            System.out.printf("Enter a number between %d and %d. ", min, max);
//            userInput = sc.nextInt();
//            if (userInput >= min && userInput <= max) {
//                outOfRange = false;
//            }
//        }while (outOfRange);
//        return userInput;
//    }
//
////    public int getInt() {
////        ////
////        String input = getString("Please enter a whole number: ");
////        int userNumber;
////        try {
////            userNumber = Integer.valueOf(userNumber);
////        }catch (NumberFormatException e) {
////            e.printStackTrace();
////            return userNumber;
////        }
////        ////
//////        System.out.print("Please enter an integer: ");
//////        int userInt = scanner.nextInt();
//////        System.out.printf("You entered %d", userInt);
//////        return userInt;
////    }
//
//    public double getDouble (double min, double max) {
//        System.out.printf("Enter a number between %d and %d. ", min, max);
//        double userDouble = scanner.nextDouble();
//        if (userDouble < min || userDouble > max) {
//            return getDouble(min, max);
//        }
//        return userDouble;
//    }
//
//    public double getDouble () {
//
////        ////////////////
////        String input = getString("Please enter a decimal number: ");
////        double userNumber;
////        try {
////            userNumber = Double.valueOf(userNumber);
////        }catch (NumberFormatException e) {
////            e.printStackTrace();
////            return userNumber;
////        }
////        ////////////////
//
////        System.out.print("Please enter a number: ");
////        double userDouble = scanner.nextDouble();
////        System.out.printf("You entered: %f", userDouble);
////        return userDouble;
////    }
//
////    public double getDouble(String s) {
////    }
//
////    public static class InputTest {
////        public static void main(String[] args) {
//////            System.out.println(yesNo("y"));
//////            System.out.println(getInt(1, 10));
////        }// end psvm
////
////    }//end class InputTest
//}//end class Input
//
//

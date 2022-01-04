import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {

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

    public static int getInteger(int min, int max) {     //unclear on how to do exercise according to directions
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int number = scanner.nextInt();

        if (number < min || number > max ) {
            System.out.println("Number is out of range. Try again");
            getInteger(min, max);
        }
        System.out.print("The number you entered was: ");
        return number;
    }

    public static void showFactoral () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.nextLine();

        String message = num + "! = " + num + "\t= " + num;

        System.out.println(message);
    }

    public static void main(String[] args) {
//        System.out.println(addNumbers(4, 2));
//        System.out.println(subtractNumbers(4, 2));
//        System.out.println(multiplyNumbers(5, 5));
//        System.out.println(divideNumbers(4, 0));
//        System.out.println(modulusNumbers(4, 2));
//        int userInput = getInteger(1, 10);
//        System.out.println(userInput);
        showFactoral();
    }//end main
}//end class

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
////            System.out.print(i + " ");
//            i++;
//        }

        for (int i = 5; i <= 15 ; i++) {
//            System.out.print(i + " ");
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println();
//        int j = 100;
//        do {
//            if(j % 5 == 0) {
////                System.out.println(j);
//            }
//            j--;
//        }while(j >= -10);

        for (int i = 100; i >= -10;) {
            if(i % 5 == 0) {
//                System.out.println(i);
            }
            i--;
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        long l = 2;
//        do {
////            System.out.println(l);
//            l *= l;
//        }while (l < 1000000);

        for (long i = 2; i < 1000000;) {
//            System.out.println(i);
            i *= i;
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
//                System.out.println("FizzBuzz");
            }else if(i % 3 == 0) {
//                System.out.println("Fizz");
            }else if (i % 5 == 0) {
//                System.out.println("Buzz");
            }else {
//                System.out.println(i);
            }
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to? ");
        int userInput = scanner.nextInt();
        System.out.println("Here is your table!");
        System.out.println();
        System.out.println("number\t| squared\t| cubed");
        System.out.println("------\t| -------\t| -----");

        for (int i = 1; i <= userInput; i++) {
            long squaredNumber = i * i;
            long cubedNumber = i * i * i;

            if(i < 4) {
                System.out.printf("%d\t\t| %d\t\t\t| %d%n", i, squaredNumber, cubedNumber);
            }else {
                System.out.printf("%d\t\t| %d\t\t| %d%n", i, squaredNumber, cubedNumber);
            }
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }//end main
}// end class
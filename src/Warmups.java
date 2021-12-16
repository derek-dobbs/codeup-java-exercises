import java.util.Scanner;
public class Warmups {
    public static void main(String[] args) {
        //December 15, 2021
        System.out.println("Java is statically typed, while Javascript is dynamically typed.");

        //December 16, 2021
        Scanner scanner = new Scanner(System.in);
        System.out.println("What did you eat for breakfast today?");
        String userInput = scanner.nextLine();

        System.out.printf("You ate %s for breakfast today", userInput);
    }// end main
}//end class

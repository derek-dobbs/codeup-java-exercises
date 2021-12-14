import java.util.Scanner;
public class ConsoleIOPractice {
    public static void main (String[] args) {
//        System.out.println("Test");

//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);

//        String greeting = "Salutations";
//        String name = "codeup";
//        System.out.printf("%s, %s!", greeting, name);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
//        String userInput = scanner.next();
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }//end main
}//end class

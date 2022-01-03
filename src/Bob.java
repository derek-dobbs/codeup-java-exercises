import java.util.Locale;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isConfirmed = true;

        do {
            System.out.print("Enter a question for Bob, enter Q to exit: ");
            String userQuestion = scanner.nextLine();

            if (userQuestion.toLowerCase().equals("q")) {
                System.out.println("Goodbye!");
                System.exit(0);
            }else if (userQuestion.endsWith("?")) {
                System.out.println("Sure.");
            }else if (userQuestion.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            }else if (userQuestion.equals("")) {        //not getting correct output
                System.out.println("Fine. Be that way!");
            }else {
                System.out.println("Whatever.");
            }
        }while (isConfirmed);
    }// end main
}// end class Bob

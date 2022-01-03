import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a question for Bob: ");
        String userQuestion = scanner.nextLine();

        if (userQuestion.endsWith("?")) {
            System.out.println("Sure.");
        }else if (userQuestion.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        }else if (userQuestion.equals("")) {        //not getting correct output
            System.out.println("Fine. Be that way!");
        }else {
            System.out.println("Whatever.");
        }
    }// end main
}// end class Bob

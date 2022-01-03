import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a question for Bob: ");
        String userQuestion = scanner.nextLine();
//        System.out.println(userQuestion.charAt(userQuestion.length() - 1));

        if (userQuestion.charAt(userQuestion.length() - 1) == '?') {
            System.out.println("Sure");
        }else if (userQuestion.charAt(userQuestion.length() - 1) == '!') {
            System.out.println("Whoa, chill out!");
        }else if (userQuestion.equals("")) {
            System.out.println("Fine. Be that way!");
        }else {
            System.out.println("Whatever.");
        }


    }// end main
}// end class Bob

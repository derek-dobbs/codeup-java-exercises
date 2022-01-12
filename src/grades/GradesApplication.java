package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class GradesApplication {
    public static void displayStudentInfo (Student student1) {
        String studentName = student1.getName();
        String ghUserName = student1.getGitHubUserName();
        int average = student1.getGradeAverage(student1.getGrades());

        System.out.println("Name: " + studentName + " - GitHub Username: " + ghUserName + "\nCurrent Average: " + average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Student1", "s1GH");
        s1.addGrade(95);
        s1.addGrade(100);
        s1.addGrade(98);

        Student s2 = new Student("Student2", "s2GH");
        s2.addGrade(87);
        s2.addGrade(100);
        s2.addGrade(91);

        Student s3 = new Student("Student3", "s3GH");
        s3.addGrade(65);
        s3.addGrade(78);
        s3.addGrade(87);

        Student s4 = new Student("Student4", "s4GH");
        s4.addGrade(88);
        s4.addGrade(52);
        s4.addGrade(47);

        students.put(s1.getGitHubUserName(), s1);
        students.put(s2.getGitHubUserName(), s2);
        students.put(s3.getGitHubUserName(), s3);
        students.put(s4.getGitHubUserName(), s4);

        ArrayList<String> userNames = new ArrayList<>();
        userNames.add(s1.getGitHubUserName());
        userNames.add(s2.getGitHubUserName());
        userNames.add(s3.getGitHubUserName());
        userNames.add(s4.getGitHubUserName());

        boolean isContinue = true;

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");

        do {
            String userNamesString = userNames.toString();
            userNamesString =  userNamesString.replace('[', ' ')
                    .replace(']', ' ')
                    .replace(',', '|')
                    .replace(' ', '|')
                    .replace("||", "| |");
            System.out.println(userNamesString);
            System.out.print("What student would you like to see more information on? ");
            String userChoice = scanner.nextLine();

            if(students.containsKey(userChoice)) {
                displayStudentInfo(students.get(userChoice));
            }else {
                System.out.println("Sorry, no student found with the Github username of " + "\"" + userChoice +  "\"");
            }

            System.out.print("Would you like to see another student? ");
            String userConfirm = scanner.nextLine().toLowerCase();

            if(userConfirm.equals("y") || userConfirm.equals("yes")){
                isContinue = true;
            }else {
                System.out.println("Goodbye, and have a wonderful day!");
                isContinue = false;
            }
        }while (isContinue);
    }
}

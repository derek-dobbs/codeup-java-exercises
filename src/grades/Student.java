package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private String gitHubUserName;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String gitHubUserName) {
        this.name = name;
        this.gitHubUserName = gitHubUserName;
    }

    public String getGitHubUserName() {
        return gitHubUserName;
    }

    public void setGitHubUserName(String gitHubUserName) {
        this.gitHubUserName = gitHubUserName;
    }

    //The grades property should be an ArrayList of integers.
    ArrayList<Integer> grades = new ArrayList<>();

    //The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.
    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
//
    // returns the average of the students grades
    public int getGradeAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student derek = new Student("Derek");
//        System.out.println(derek.getName());
        derek.addGrade(98);
        derek.addGrade(95);
        derek.addGrade(83);
        System.out.println(derek.getGrades());
//        System.out.println(derek.getGradeAverage(derek.getGrades()));

    }
}

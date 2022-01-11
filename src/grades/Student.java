package grades;

import java.util.ArrayList;

public class Student {
    private String name;

    //The grades property should be an ArrayList of integers.
    ArrayList<Integer> grades = new ArrayList<>();

    //The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.
    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public Student(String name) {
        this.name = name;
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

//    // returns the student's name
//    public String getName();      ////don't need this, already have one

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
//
    // returns the average of the students grades
    public int getGradeAverage(ArrayList<Integer> grades) {

    }

    public static void main(String[] args) {
        Student derek = new Student("Derek");
//        System.out.println(derek.getName());
//        derek.addGrade(100);
//        derek.addGrade(95);
//        derek.addGrade(80);
//        System.out.println(derek.getGrades());
        System.out.println(derek.getGradeAverage());

    }
}

package View;

import Models.Student;

public class StudentGradesView {

    public void displayWelcome() {
        System.out.println("Welcome to student grades calculator");
    }

    public void displayGoodbye() {
        System.out.println("Goodbye!");
    }

    public void displayGrades(Student student) {
        System.out.println("----- Result ----");
        System.out.println("Student: " + student.getName());
        System.out.println("Assignments grade: " + student.getAssignments());
        System.out.println("Midterm exam grade: " + student.getMidTerm());
        System.out.println("Final exam grade: " + student.getFinalTerm());
        System.out.println("Overall grade: " + student.getGrade());
    }
}

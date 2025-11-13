package Main;

import Models.Student;
import Util.InputValidator;
import View.StudentGradesView;


public class StudentGradesSystem {
    void main(String[] args) {
        InputValidator inputValidator = new InputValidator();
        StudentGradesView studentGradesView = new StudentGradesView();
        studentGradesView.displayWelcome();

        var studentName = inputValidator.getInputNameValidation();
        var studentAssignmentGrade = inputValidator.getInputGradeValidation("assignments");
        var studentMidTermGrade = inputValidator.getInputGradeValidation("midterm");
        var studentFinalTermGrade = inputValidator.getInputGradeValidation("final exam");


        Student student = new Student(studentName, studentAssignmentGrade, studentMidTermGrade, studentFinalTermGrade);
        student.setGrade();

        studentGradesView.displayGrades(student);
        studentGradesView.displayGoodbye();
    }
}

package Models;

public class Student {
    private final String name;
    private final int midTerm;
    private final int finalTerm;
    private final int assignments;
    private String grade;

    public Student(String name, int midTerm, int finalTerm, int assignments) {
        this.name = name;
        this.midTerm = midTerm;
        this.finalTerm = finalTerm;
        this.assignments = assignments;
    }

    // setters and getters
    public String getName() {
        return name;
    }

    public int getMidTerm() {
        return midTerm;
    }

    public int getFinalTerm() {
        return finalTerm;
    }

    public int getAssignments() {
        return assignments;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade() {
        int total = midTerm + finalTerm + assignments;
        switch (total / 10) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
        }
    }
}

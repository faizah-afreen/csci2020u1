import java.util.stream.StreamSupport;

public class StudentRecord
{
    private String studentID;
    private float assignments;
    private float midterm;
    private float finals;
    private double marks;
    private String grades;

    public String getGrades() {
        if (getMarks() >= 80 && getMarks() <= 100)
            this.grades = "A";
        else if (getMarks() >= 70 && getMarks() <= 79)
            this.grades = "B";
        else if (getMarks() >= 60 && getMarks() <= 69)
            this.grades = "C";
        else if (getMarks() >= 50 && getMarks() <= 59)
            this.grades = "D";
        else
            this.grades = "F";
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        this.marks = (getAssignments() * 0.2) + (getMidterm() * 0.3) + (getFinals() * 0.5);
        return marks;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public float getAssignments() {
        return assignments;
    }

    public void setAssignments(float assignments) {
        this.assignments = assignments;
    }

    public float getMidterm() {
        return midterm;
    }

    public void setMidterm(float midterm) {
        this.midterm = midterm;
    }

    public float getFinals() {
        return finals;
    }

    public void setFinals(float finals) {
        this.finals = finals;
    }

    public StudentRecord(String s, float a, float m, float f)
    {
        this.studentID = s;
        this.assignments = a;
        this.midterm = m;
        this.finals = f;
    }
}



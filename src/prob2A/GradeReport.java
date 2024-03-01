package prob2A;

public class GradeReport {

    private String grade;
    private Student student;

    public void setGrade(String grade) {
        this.grade = grade;
    }
    GradeReport(Student student) {
        this.student = student;
    }
    public String getGrade() {
        return grade;
    }

    public Student getStudent() {
        return student;
    }
}

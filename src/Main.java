import prob2A.Student;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.getGradeReport().setGrade("A");
        System.out.println(student);
    }
}
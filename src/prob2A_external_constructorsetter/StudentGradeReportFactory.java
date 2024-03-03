package lesson2.labsolns.prob2A_external_constructorsetter;


/** Typical use: Loading data from database into class model */
public class StudentGradeReportFactory {
	
	public static StudentAndReport createStudentAndReport(String name, String grade) {
		GradeReport g = new GradeReport(grade);
		Student st = new Student(name, g);
		g.setStudent(st);
		return new StudentAndReport(st, g);
	}
}

package lesson2.labsolns.prob2A_externally_owned_two_setters;

/** Typical use: Loading data from database into class model */
public class StudentGradeReportFactory {
	
	public static StudentAndReport createStudentAndReport(String name, String grade) {
		GradeReport g = new GradeReport(grade);
		Student st = new Student(name);
		g.setStudent(st);
		st.setReport(g);
		return new StudentAndReport(st, g);
	}
}

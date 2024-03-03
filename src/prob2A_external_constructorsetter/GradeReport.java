package lesson2.labsolns.prob2A_external_constructorsetter;




public class GradeReport implements Comparable<GradeReport>{
	private Student student;
	private String grade;
	
	//package level access to prevent access from outside
	GradeReport(String grade) {
		this.grade = grade;
	}
	public void setStudent(Student s) {
		student = s;
	}
	public Student getStudent() {
		return student;
	}
	public String getGrade() {
		return grade;
	}
	@Override
	public int compareTo(GradeReport o) {
		return grade.compareTo(o.grade);
	}
}

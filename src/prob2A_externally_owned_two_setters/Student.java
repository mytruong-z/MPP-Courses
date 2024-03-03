package lesson2.labsolns.prob2A_externally_owned_two_setters;



public class Student {
	private GradeReport report;
	private String name;
	Student(String nm) {
		name = nm;
	}
	public String getName() {
		return name;
	}
	public void setReport(GradeReport report) {
		this.report = report;
	}
	public GradeReport getReport() {
		return report;
	}
}

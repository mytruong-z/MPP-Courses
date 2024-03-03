package lesson2.labsolns.prob2A_external_constructorsetter;

public class Student {
	private GradeReport report;
	private String name;
	
	//package level access to prevent access from outside
	Student(String nm, GradeReport report) {
		name = nm;
		this.report = report;
		
	}
	public String getName() {
		return name;
	}
	public GradeReport getReport() {
		return report;
	}
}

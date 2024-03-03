package lesson2.labsolns.prob2A_externally_owned_two_setters.otherpackage;

public class DataRecord {
	String id;
	String name;
	String grade;
	public DataRecord(String id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
}

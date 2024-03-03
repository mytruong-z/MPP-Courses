package lesson2.labsolns.prob4;

import java.util.*;

public class Section {
	//package access constructor
	Section() {
		//do nothing 	
	}
	String courseName;
	int sectionNumber;
	List<TranscriptEntry> gradeSheet = new ArrayList<>();
	
	public void addStudent(Student student) {
		StudentSectionFactory.addStudentToSection(this, student);
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getSectionNumber() {
		return sectionNumber;
	}

	public void setSectionNumber(int sectionNumber) {
		this.sectionNumber = sectionNumber;
	}

	public List<TranscriptEntry> getGradeSheet() {
		return gradeSheet;
	}

	public void setGradeSheet(List<TranscriptEntry> gradeSheet) {
		this.gradeSheet = gradeSheet;
	}

	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Section)) return false;
		Section s = (Section)ob;
		return (s.sectionNumber == sectionNumber);
	}
}

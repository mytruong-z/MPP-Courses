package lesson2.labsolns.prob4;

import java.util.*;

public class Student {
	//package level constructor
	Student() {
		//do nothing
	}
	String id;
	String name;
	List<TranscriptEntry> grades = new ArrayList<>();
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}	
	
	public void setGrade(Section section, String grade) {
		StudentSectionFactory.newTranscriptEntry(this,section,grade);
	}
	
	public void addSection(Section sect) {
		StudentSectionFactory.addSectionForStudent(this, sect);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TranscriptEntry> getGrades() {
		return grades;
	}

	public void setGrades(List<TranscriptEntry> grades) {
		this.grades = grades;
	}

	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Student)) return false;
		Student s = (Student)ob;
		return s.id.equals(id);
	}
	
}

package lesson2.labsolns.prob2A_externally_owned_two_setters.otherpackage;
import java.util.*;

import lesson2.labsolns.prob2A_externally_owned_two_setters.*;


public class Main {

	public static void main(String[] args) {
		//two setters
		printTopStudents();
	}
	public static void printTopStudents() {
		Collection<DataRecord> data = Database.h.values();
		List<GradeReport> reports = new ArrayList<>();
		for(DataRecord d : data) {
			StudentAndReport sr 
			  = StudentGradeReportFactory
			      .createStudentAndReport(d.getName(), d.getGrade());
			reports.add(sr.report);	
		}
		
		Collections.sort(reports);
		Iterator<GradeReport> it = reports.iterator();
		System.out.println("A Students:");
		GradeReport next = null;
		while((next =it.next()) != null && next.getGrade().equals("A")) {
			System.out.print(next.getStudent().getName() + " ");
		}
	}
	

}

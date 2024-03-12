package lesson9.demo.actice_exercise_lambdas_streams.quizclasses;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTestData {
	private static List<Address> addresses = new ArrayList<Address>();
	private static List<Employee> list = new ArrayList<Employee>();
	static {
		addresses.add(new Address("101 lesson9.demo.actice_exercise_lambdas_streams.pipeline.Main", "Fairfield", "IA", "52556"));
		addresses.add(new Address("1 Davis", "Van Nuys", "CA", "92243"));
		addresses.add(new Address("52 Westland", "Santa Monica", "CA", "93341"));
		addresses.add(new Address("23 N. Platte", "Austin", "TX", "65352"));
		addresses.add(new Address("44 Dogwood", "Santa Monica", "CA", "93341"));
		addresses.add(new Address("13141 W. Stevens", "Fairfield", "IA", "52556"));
		addresses.add(new Address("634 B. St.", "Woodland Hills", "CA", "93356"));
		addresses.add(new Address("134501 N. Redwood", "Richland", "IA", "52542"));
		addresses.add(new Address("3 Azure Ln.", "Sacramento", "CA", "93731"));
		addresses.add(new Address("222 N. Anthony", "Los Altos", "CA", "95512"));
		addresses.add(new Address("18801 Thomas", "Des Moines", "IA", "53723"));
		addresses.add(new Address("3 Eventual", "Los Angeles", "CA", "23214"));
		addresses.add(new Address("34 Jones St.", "Fairfield", "IA", "52556"));
		addresses.add(new Address("500 lesson9.demo.actice_exercise_lambdas_streams.pipeline.Main", "Fairfield", "IA", "52556"));
		list.add(new Employee("Joe", 100000, 1980, addresses.get(0)));
		list.add(new Employee("Tim", 50000, 1982, addresses.get(1)));
		list.add(new Employee("Joe", 90000, 1970, addresses.get(2)));
		list.add(new Employee("Rick", 50000, 1955, addresses.get(3)));
		list.add(new Employee("Andy", 60000, 1966, addresses.get(4)));
		list.add(new Employee("Tim", 10000, 1995, addresses.get(5)));
		list.add(new Employee("Tony", 130000, 1991, addresses.get(6)));
		list.add(new Employee("Timmy", 150000, 1988, addresses.get(7)));
		list.add(new Employee("Rich", 50000, 1980, addresses.get(8)));
		list.add(new Employee("Andrew", 160000, 1970, addresses.get(9)));
		list.add(new Employee("Ton", 150000, 1958, addresses.get(10)));
		list.add(new Employee("Jose", 40000, 1970, addresses.get(11)));
		list.add(new Employee("Timothy", 50000, 1996, addresses.get(12)));
		list.add(new Employee("Ricardo", 50000, 1988, addresses.get(13)));
	}
	public static List<Employee> getList() {
		return list;
	}
	
}

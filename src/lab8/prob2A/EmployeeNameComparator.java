package lab8.prob2A;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		//need to compare on name and then on salary
		if (e1.name.compareTo(e2.name) != 0) {
			return e1.name.compareTo(e2.name);
		} else {
			return e1.salary - e2.salary;
		}
	}
}

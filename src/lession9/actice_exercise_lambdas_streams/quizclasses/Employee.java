package lesson9.demo.actice_exercise_lambdas_streams.quizclasses;

public class Employee {
	String name;
	int salary;
	int yearOfBirth;
	Address address;
	public Employee(String n, int s, int y, Address a) {
		this.name = n;
		this.salary = s;
		this.yearOfBirth = y;
		this.address = a;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary);
		sb.append(" year of birth: ");
		sb.append("" + yearOfBirth+">");
		return sb.toString();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public Address getAddress() {
		return address;
	}
}


package lesson9.demo.actice_exercise_lambdas_streams.quizclasses;

public class Pair {
	public String name;
	public double salary;
	public Pair(String n, double s) {
		name = n;
		salary = s;
	}
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Pair p = (Pair)ob;
		return name.equals(p.name) && salary == p.salary;
	}
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
}

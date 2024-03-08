package lab8;

import java.util.function.BiFunction;
import java.util.function.Function;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EmployeeNameComparator {
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

public class LambdaAndMethodReferenceExercises {
    // A. (Employee e) -> e.getName()
    Function<Employee, String> getNameFunction = Employee::getName;

    // C. (String s1, String s2) -> s1.compareTo(s2)
    BiFunction<String, String, Integer> compareToFunction = String::compareTo;

    // D. (Integer x, Integer y) -> Math.pow(x, y)
    BiFunction<Integer, Integer, Double> powerFunction = Math::pow;

    // E. (Apple a) -> a.getWeight() - Assume Apple class is available
    // F. (String x) -> Integer.parseInt(x)
    Function<String, Integer> parseIntFunction = Integer::parseInt;

    // G. EmployeeNameComparator comp = new EmployeeNameComparator();
    // (Employee e1, Employee e2) -> comp.compare(e1, e2)
    EmployeeNameComparator comp = new EmployeeNameComparator();
    BiFunction<Employee, Employee, Integer> compareFunction = comp::compare;
    void evaluator() {
        System.out.println(getNameFunction.apply(new Employee("My Truong"))); // A
        System.out.println(compareToFunction.apply("orange", "banana")); // C
        System.out.println(powerFunction.apply(2, 3)); // D
        System.out.println(parseIntFunction.apply("123")); // F
        System.out.println(compareFunction.apply(new Employee("Bob"), new Employee("Alice"))); // G
    }

    public static void main(String[] args) {
        LambdaAndMethodReferenceExercises examples = new LambdaAndMethodReferenceExercises();
        examples.evaluator();
    }
}
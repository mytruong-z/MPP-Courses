package lesson9.Lab9Part2.prob11b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>,Integer,Character,String> lambdaLibrary =
            (emps,salary,character) ->
                emps.stream()
                        .filter(emp -> emp.getSalary() > salary)
                        .filter(emp -> emp.getLastName().charAt(0) > character)
                        .map(emp -> Employee.fullName(emp))
                        .sorted()
                        .collect(Collectors.joining(", "));
}

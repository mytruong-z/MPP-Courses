package lab8.prob6;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Example {
    Function<String, String> toUpper = (String x) -> x.toUpperCase();
    //type: Class::instanceMethod
    Function<String, String> upper1 = (String x) -> x.toUpperCase();
    Function<String, String> upper2 = String::toUpperCase;

    //type:  Class::instanceMethod
    Function<Employee, String> eToString1 = e -> e.getName();
    Function<Employee, String> eToString2 = Employee::getName;

    //type: Class::instanceMethod
    BiConsumer<Employee, String> setName1 = (e, s) -> e.setName(s);
    BiConsumer<Employee, String> setName2 = Employee::setName;

    //type: Class::instanceMethod
    Comparator<String> strComp1 = (s1,s2) -> s1.compareTo(s2);
    Comparator<String> strComp2 = String::compareTo;

    //type: Class::staticMethod
    BiFunction<Integer, Integer, Double> min1 = (x, y) -> Math.pow(x,y);
    BiFunction<Integer, Integer, Double> min2 = Math::pow;

    BiFunction<Integer, Integer, Double> pow1 = (x, y) -> Math.pow(x,y);

    //type: Class::instanceMethod
    Function<Apple, Double> appleWeight1 = (Apple a) -> a.getWeight();
    Function<Apple, Double> appleWeight2 = Apple::getWeight;

    //type: Class::staticMethod
    Function<String, Integer> parser1 = x -> Integer.parseInt(x);
    Function<String, Integer> parser2 = Integer::parseInt;

    //type: obj::instanceMethod
    EmployeeNameComparator comp = new EmployeeNameComparator();
    Comparator<Employee> empComp1 = (e1, e2) -> comp.compare(e1,e2);
    Comparator<Employee> empComp2 = comp::compare;
    void evaluator() {
        Employee testEmp = new Employee("My Truong", 200000);
        Apple testApple = new Apple(2.5);
        System.out.println(upper2.apply("Hello"));
        System.out.println(eToString2.apply(testEmp));

        setName2.accept(testEmp,"My Truong");
        System.out.println(testEmp.getName());

        System.out.println(strComp2.compare("a", "b"));
        System.out.println(min2.apply(2,10));
        System.out.println(appleWeight2.apply(testApple));
        System.out.println(parser2.apply("25"));
        System.out.println(empComp2.compare(testEmp, new Employee("My Truong", 200000)));
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.evaluator();
    }
}

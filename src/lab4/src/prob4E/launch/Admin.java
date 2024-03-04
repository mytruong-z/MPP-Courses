package lab4.src.prob4E.launch;

import java.util.List;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> emps) {
        double sum = 0.0;
        for (Employee e : emps) {
            sum += e.computeUpdatedBalanceSum();
        }
        return sum;
    }
}

package lab4.src.prob4E.launch;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account)  {
        accounts.add(account);
    }


    public double computeUpdatedBalanceSum() {
        double sum = 0.0;
        for(Account a : accounts) {
            sum += a.computeUpdatedBalance();
        }
        return sum;
    }
}

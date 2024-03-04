package lab4.src.prob4C;

import java.util.List;

public class Commissioned extends Employee {
    private double commission;
    private double baseSalary;

    private List<Order> orders;

    public Commissioned(String empId, double commission, double baseSalary) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double total = 0;
        for (Order order: orders) {
            total += order.getOrderAmount() * (1 - commission);
        }
        return  total;
    }
}

package lab4.src.prob4C;

public class Hourly extends Employee {
    private Double hourlyWage;
    private int hoursPerWeek;

    public Hourly(String empId) {
        super(empId);
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return this.calcCompensation(month, year).getNetPay(hourlyWage * hoursPerWeek * 4);
    }
}

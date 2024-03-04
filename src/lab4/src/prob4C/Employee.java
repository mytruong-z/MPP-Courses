package lab4.src.prob4C;

public abstract class Employee {
    private String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public String getEmpId() {
        return empId;
    }

    public void print() {
        System.out.println("Employee ID: " + empId);
    }

    Paycheck calcCompensation(int month, int year) {
        return new Paycheck();
    }

    public abstract double calcGrossPay(int month, int year);

}

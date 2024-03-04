package lab4.src.prob4E.launch;

public class CheckingAccount extends Account {
    private double balance;
    private double monthlyFee;
    private String accountId;

    public CheckingAccount(String accountId, double balance, double fee) {
        this.accountId = accountId;
        this.balance = balance;
        this.monthlyFee = fee;
    }

    public double getBalance() {
        return balance;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public String getAccountId() {
        return accountId;
    }

    @Override
    public String getAccountID() {
        return accountId;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance - monthlyFee;
    }
}

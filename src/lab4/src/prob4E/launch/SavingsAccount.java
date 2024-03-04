package lab4.src.prob4E.launch;

public class SavingsAccount extends Account {
    private double balance;
    private double interestRate;
    private String accountId;

    public SavingsAccount(String accountId, double balance, double interestRate) {
        this.accountId = accountId;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
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
        return balance + (balance * interestRate);
    }
}

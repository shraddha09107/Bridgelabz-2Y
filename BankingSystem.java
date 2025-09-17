import java.util.*;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String a, String h, double b) { accountNumber=a; holderName=h; balance=b; }
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    protected void setBalance(double b) { balance=b; } // protected

    public void deposit(double amount) {
        if (amount>0) setBalance(getBalance() + amount);
    }

    public boolean withdraw(double amount) {
        if (amount>0 && getBalance() >= amount) {
            setBalance(getBalance() - amount); return true;
        }
        return false;
    }

    public abstract double calculateInterest();
}

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String a, String h, double b) { super(a,h,b); }
    @Override public double calculateInterest() { return getBalance() * 0.04; } // 4% annual simple
    @Override public boolean applyForLoan(double amount) {
        return amount <= calculateLoanEligibility();
    }
    @Override public double calculateLoanEligibility() { return getBalance() * 2; }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String a, String h, double b) { super(a,h,b); }
    @Override public double calculateInterest() { return 0.0; } // no interest
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        SavingsAccount s = new SavingsAccount("S001","Ishka",20000);
        CurrentAccount c = new CurrentAccount("C001","Rina",5000);
        accounts.add(s); accounts.add(c);

        for (BankAccount acc : accounts) {
            System.out.println(acc.getHolderName() + " (" + acc.getAccountNumber() + ") balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                Loanable l = (Loanable) acc;
                System.out.println("Loan eligibility: " + l.calculateLoanEligibility());
                System.out.println("Apply for loan 30000: " + l.applyForLoan(30000));
            }
            System.out.println("---");
        }
    }
}

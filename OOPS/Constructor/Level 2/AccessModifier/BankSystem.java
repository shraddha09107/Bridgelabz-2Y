class BankAccount {
    public int accountNumber;        // public
    protected String accountHolder;  // protected
    private double balance;          // private

    BankAccount(int accNo, String holder, double balance) {
        this.accountNumber = accNo;
        this.accountHolder = holder;
        this.balance = balance;
    }

    // Public getter & setter for balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accNo, String holder, double balance, double interestRate) {
        super(accNo, holder, balance);
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: ₹" + getBalance() + ", Interest: " + interestRate + "%");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(10101, "Ishka", 20000, 5.5);
        sa.deposit(5000);
        sa.withdraw(3000);
        sa.display();
    }
}

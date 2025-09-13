class BankAccount {
    static String bankName = "ABC Bank";   // static variable
    static int totalAccounts = 0;

    final int accountNumber;   // final variable
    String accountHolderName;
    double balance;

    // Constructor using 'this'
    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    // Static method
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ishka", 101, 5000);
        BankAccount acc2 = new BankAccount("Anish", 102, 8000);

        acc1.displayDetails();
        acc2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}

interface SensitiveData {}

class BankDetails implements SensitiveData {
    String accNo = "12345";
    String pin = "9999";
}

public class SensitiveTag {
    public static void main(String[] args) {
        BankDetails b = new BankDetails();
        if (b instanceof SensitiveData)
            System.out.println("Encrypting sensitive data...");
        // Read accNo to avoid unused variable warning
        System.out.println("Account Number: " + b.accNo);
        // Read pin to avoid unused variable warning
        System.out.println("PIN: " + b.pin);
    }
}

interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refunded ₹" + amount);
    }
}

class Paytm implements PaymentProcessor {
    public void pay(double amount) { System.out.println("Paid ₹" + amount + " via Paytm"); }
}

public class PaymentMain {
    public static void main(String[] args) {
        Paytm p = new Paytm();
        p.pay(200);
        p.refund(50);
    }
}

package java.learn.Behavioural.strategy;

public class PayPalPayment implements PaymentStrategy {
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Paid R%.2f using %s account: %s%n", amount, name(), email);
    }

    @Override
    public String name() {
        return "PayPal";
    }
}

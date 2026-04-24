package java.learn.Behavioural.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        // Strategy 1: card payment
        checkout.setStrategy(new CreditCardPayment("Alice M.", "**** **** **** 4821"));
        checkout.pay(150.00);

        // Strategy 2: PayPal payment (same checkout, different algorithm)
        checkout.setStrategy(new PayPalPayment("alice@example.com"));
        checkout.pay(75.50);
    }
}

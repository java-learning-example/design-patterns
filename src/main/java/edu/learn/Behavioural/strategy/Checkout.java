package edu.learn.Behavioural.strategy;

public class Checkout {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy is not set.");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }

        // Context delegates payment behavior to currently selected strategy.
        strategy.pay(amount);
    }
}

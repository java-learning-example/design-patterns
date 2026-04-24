package edu.learn.Behavioural.strategy;

public interface PaymentStrategy {
    void pay(double amount);
    String name();
}

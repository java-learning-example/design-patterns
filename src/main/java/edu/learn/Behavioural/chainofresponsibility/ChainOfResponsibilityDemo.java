package edu.learn.Behavioural.chainofresponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        SupportHandler billing = new BillingSupport();
        SupportHandler technical = new TechnicalSupport();
        SupportHandler manager = new ManagerSupport();

        billing.setNext(technical).setNext(manager);

        billing.handle("bill mismatch");
        billing.handle("login error");
        billing.handle("custom refund request");
    }
}

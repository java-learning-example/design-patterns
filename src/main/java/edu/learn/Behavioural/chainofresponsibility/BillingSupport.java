package edu.learn.Behavioural.chainofresponsibility;

public class BillingSupport extends SupportHandler {
    @Override
    protected boolean canHandle(String issue) { return issue.contains("bill"); }

    @Override
    protected void process(String issue) { System.out.println("Billing team handled: " + issue); }
}

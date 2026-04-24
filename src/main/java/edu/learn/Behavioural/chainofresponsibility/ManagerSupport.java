package edu.learn.Behavioural.chainofresponsibility;

public class ManagerSupport extends SupportHandler {
    @Override
    protected boolean canHandle(String issue) { return true; }

    @Override
    protected void process(String issue) { System.out.println("Manager handled: " + issue); }
}

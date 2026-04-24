package edu.learn.Behavioural.chainofresponsibility;

public class TechnicalSupport extends SupportHandler {
    @Override
    protected boolean canHandle(String issue) { return issue.contains("error"); }

    @Override
    protected void process(String issue) { System.out.println("Tech team handled: " + issue); }
}

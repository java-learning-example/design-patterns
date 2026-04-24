package edu.learn.Behavioural.chainofresponsibility;

public abstract class SupportHandler {
    private SupportHandler next;

    public SupportHandler setNext(SupportHandler next) {
        this.next = next;
        return next;
    }

    public void handle(String issue) {
        if (canHandle(issue)) {
            process(issue);
        } else if (next != null) {
            next.handle(issue);
        } else {
            System.out.println("No handler found for: " + issue);
        }
    }

    protected abstract boolean canHandle(String issue);
    protected abstract void process(String issue);
}

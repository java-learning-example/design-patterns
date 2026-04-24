package java.learn.Behavioural.chainofresponsibility;

abstract class SupportHandler {
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

class BillingSupport extends SupportHandler {
    protected boolean canHandle(String issue) { return issue.contains("bill"); }
    protected void process(String issue) { System.out.println("Billing team handled: " + issue); }
}

class TechnicalSupport extends SupportHandler {
    protected boolean canHandle(String issue) { return issue.contains("error"); }
    protected void process(String issue) { System.out.println("Tech team handled: " + issue); }
}

class ManagerSupport extends SupportHandler {
    protected boolean canHandle(String issue) { return true; }
    protected void process(String issue) { System.out.println("Manager handled: " + issue); }
}

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

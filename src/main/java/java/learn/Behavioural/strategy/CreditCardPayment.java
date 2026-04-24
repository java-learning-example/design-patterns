package java.learn.Behavioural.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardHolder;
    private final String maskedCard;

    public CreditCardPayment(String cardHolder, String maskedCard) {
        this.cardHolder = cardHolder;
        this.maskedCard = maskedCard;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Paid R%.2f using %s (%s)%n", amount, name(), maskedCard);
        System.out.println("Card holder: " + cardHolder);
    }

    @Override
    public String name() {
        return "Credit Card";
    }
}

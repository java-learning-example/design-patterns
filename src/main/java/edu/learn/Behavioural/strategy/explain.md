## Strategy Pattern

Strategy lets us define multiple algorithms behind one interface and swap them at runtime.

### Structure used here
- `PaymentStrategy` is the common interface.
- `CreditCardPayment` and `PayPalPayment` are concrete strategies.
- `Checkout` is the context: it does not know payment details, it only delegates to the selected strategy.
- `StrategyDemo` shows switching strategy on the same checkout flow.

### Why this is good design
- We can add new payment types without editing `Checkout`.
- Business flow remains stable while behavior changes through composition.
- This follows Open/Closed Principle (open for extension, closed for modification).

### Real-world mapping
- E-commerce checkout chooses payment method (card, PayPal, wallet, bank transfer).
- Pricing engines choose discount strategy (festival, loyalty, coupon).
- Routing systems choose path algorithm based on traffic mode.

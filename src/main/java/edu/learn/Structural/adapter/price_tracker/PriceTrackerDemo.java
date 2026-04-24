package edu.learn.Structural.adapter.price_tracker;

public class PriceTrackerDemo {
    public static void main(String[] args) {
        StockPriceProvider provider = new MainframeAdapter(new MainframePriceService());

        String ticker = args.length > 0 ? args[0] : "MSFT";
        double price = provider.getPrice(ticker);

        System.out.printf("Ticker %s current price: $%.2f%n", ticker, price);
    }
}

package edu.learn.Structural.adapter.price_tracker;

public class MainframeAdapter implements StockPriceProvider {
    private final MainframePriceService legacyService;

    public MainframeAdapter(MainframePriceService legacyService) {
        this.legacyService = legacyService;
    }

    @Override
    public double getPrice(String ticker) {
        // 1. Call the legacy service
        // 2. Parse the String to a Double (handle the '$')
        // 3. Return the double
        String rawPrice = legacyService.fetchPriceFromHardware(ticker);
        String normalized = rawPrice.replace("$", "").trim();

        try {
            return Double.parseDouble(normalized);
        } catch (NumberFormatException ex) {
            throw new IllegalStateException("Legacy service returned invalid price: " + rawPrice, ex);
        }
    }
}

## Price Tracker Adapter Example

This example shows how to use a legacy mainframe pricing API through an Adapter so modern code can consume a clean interface.

### Files and roles

- `MainframePriceService` -> **Adaptee (legacy service)**, returns price as a string like `"$123.45"`.
- `StockPriceProvider` -> **Target interface (modern contract)**, expects `double getPrice(String ticker)`.
- `MainframeAdapter` -> **Adapter**, converts legacy string response into `double`.
- `PriceTrackerDemo` -> **Client**, depends only on `StockPriceProvider`.

### Run

From repo root:

```bash
java src/main/java/edu/learn/Structural/adapter/price_tracker/PriceTrackerDemo.java
```

With custom ticker:

```bash
java src/main/java/edu/learn/Structural/adapter/price_tracker/PriceTrackerDemo.java AAPL
```

### Example output

```text
Ticker MSFT current price: $284.71
```

Note: price changes each run because the legacy service currently uses `Math.random()`.

package edu.learn.Structural.adapter.price_tracker;

// legacy (adaptee)
public class MainframePriceService {
    public String fetchPriceFromHardware(String stockId){
        return "$" + (Math.random() * 500);
    }
}

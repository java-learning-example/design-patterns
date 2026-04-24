package edu.learn.Structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        TemperatureProvider provider = new WeatherAdapter(new LegacyWeatherService());
        System.out.println("Temp C: " + provider.getTempCelsius());
    }
}

package edu.learn.Structural.adapter;

public class WeatherAdapter implements TemperatureProvider {
    private final LegacyWeatherService legacy;

    public WeatherAdapter(LegacyWeatherService legacy) {
        this.legacy = legacy;
    }

    @Override
    public double getTempCelsius() {
        double f = legacy.fetchTempFahrenheit();
        return (f - 32) * 5 / 9;
    }
}

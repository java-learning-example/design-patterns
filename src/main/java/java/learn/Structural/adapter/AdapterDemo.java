package java.learn.Structural.adapter;

class LegacyWeatherService {
    public double fetchTempFahrenheit() {
        return 77.0;
    }
}

interface TemperatureProvider {
    double getTempCelsius();
}

class WeatherAdapter implements TemperatureProvider {
    private final LegacyWeatherService legacy;

    public WeatherAdapter(LegacyWeatherService legacy) {
        this.legacy = legacy;
    }

    public double getTempCelsius() {
        double f = legacy.fetchTempFahrenheit();
        return (f - 32) * 5 / 9;
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
        TemperatureProvider provider = new WeatherAdapter(new LegacyWeatherService());
        System.out.println("Temp C: " + provider.getTempCelsius());
    }
}

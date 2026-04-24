## Adapter Pattern

Adapter converts one interface into another expected by the client.

### Example in code
- `LegacyWeatherService` returns Fahrenheit.
- `TemperatureProvider` expects Celsius.
- `WeatherAdapter` translates between the two.

package temperatureconverter;

public class CelsiusConverter {
    public static void convert(double temperature) {
        TemperatureConverter.showConversions(temperature, convertToFahrenheit(temperature), convertToKelvin(temperature));
    }

    private static double convertToKelvin(double temperature) {
        return temperature + 273.15;
    }

    private static double convertToFahrenheit(double temperature) {
        return (temperature * 1.8) + 32;
    }
}


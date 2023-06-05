package temperatureconverter;

public class KelvinConverter {
    public static void convert(double temperature) {
        TemperatureConverter.showConversions(convertToCelsius(temperature), convertToFahrenheit(temperature), temperature);
    }

    private static double convertToCelsius(double temperature) {
        return temperature - 273.15;
    }

    private static double convertToFahrenheit(double temperature) {
        return (temperature - 273.15) * 1.8 + 32;
    }
}
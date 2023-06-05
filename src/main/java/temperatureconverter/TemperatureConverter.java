package temperatureconverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter {
    private char unit;
    private double temperature;
    private final Scanner scanner = new Scanner(System.in);

    public char getUnit() {
        return unit;
    }

    public double getTemperature() {
        return temperature;
    }
    public TemperatureConverter(){
        this.unit = Unit();
        this.temperature = Temperature();
        this.scanner.close();
    }
    private double Temperature() {
        while (true) {
            System.out.print("Insert the temperature (number only): ");
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Try again!");
            }
        }
    }

    private Character Unit() {
        while (true) {
            System.out.print("Insert the unit (C, F or K): ");
            try {
                return this.unit = scanner.next("[CcFfKk]").charAt(0);
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Try again!");
            }
        }
    }

    public void convert() {
        switch (Character.toUpperCase(this.unit)) {
            case 'C' -> CelsiusConverter.convert(this.temperature);
            case 'F' -> FahrenheitConverter.convert(this.temperature);
            case 'K' -> KelvinConverter.convert(this.temperature);
        }
    }

    protected static void showConversions(double celsiusTemperature, double fahrenheitTemperature,
                                          double kelvinTemperature) {
        System.out.println("\nThe converted values are: ");
        System.out.printf("Celsius: %.2f ºC \n", celsiusTemperature);
        System.out.printf("Fahrenheit: %.2f ºF \n", fahrenheitTemperature);
        System.out.printf("Kelvin: %.2f ºK \n", kelvinTemperature);
    }
}


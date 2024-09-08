import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose an option:");
        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Fahrenheit to Celsius");
        System.out.println("3: Celsius to Kelvin");
        System.out.println("4: Kelvin to Celsius");
        System.out.println("5: Fahrenheit to Kelvin");
        System.out.println("6: Kelvin to Fahrenheit");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();
        double convertedTemperature = 0;

        switch (choice) {
            case 1:
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.printf("Result: %.2f°C is %.2f°F%n", temperature, convertedTemperature);
                break;
            case 2:
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.printf("Result: %.2f°F is %.2f°C%n", temperature, convertedTemperature);
                break;
            case 3:
                convertedTemperature = celsiusToKelvin(temperature);
                System.out.printf("Result: %.2f°C is %.2f K%n", temperature, convertedTemperature);
                break;
            case 4:
                convertedTemperature = kelvinToCelsius(temperature);
                System.out.printf("Result: %.2f K is %.2f°C%n", temperature, convertedTemperature);
                break;
            case 5:
                convertedTemperature = fahrenheitToKelvin(temperature);
                System.out.printf("Result: %.2f°F is %.2f K%n", temperature, convertedTemperature);
                break;
            case 6:
                convertedTemperature = kelvinToFahrenheit(temperature);
                System.out.printf("Result: %.2f K is %.2f°F%n", temperature, convertedTemperature);
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }

        scanner.close();
    }
}

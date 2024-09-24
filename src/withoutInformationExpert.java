// Non-Information Expert Design
class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

// Main class
public class withoutInformationExpert {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        double celsius = 25;
        double fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
}

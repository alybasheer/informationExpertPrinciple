// Information Expert Design
class Temperature {
    private double celsius;

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    public double getCelsius() {
        return celsius;
    }
}

// Main class
public class withInformationExpert {
    public static void main(String[] args) {
        Temperature temp = new Temperature(25);
        double fahrenheit = temp.toFahrenheit();
        System.out.println(temp.getCelsius() + "°C = " + fahrenheit + "°F");
    }
}

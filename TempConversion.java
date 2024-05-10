
public class TempConversion {
    private double temperature;

    public TempConversion(double temperature) {
        this.temperature = temperature;
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }


}

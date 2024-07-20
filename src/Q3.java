public class Q3 {
    public static void main(String[] args) {
        System.out.println("Celcius   Fahrenheit   Fahrenheit   Celcius");

        for (double i = 0.0; i < 60.0; i += 10) {
            System.out.printf(
                    "%-9.1f %-12.4f %-12.1f %.4f\n",
                    i,
                    celsiusToFahrenheit(i),
                    i + 50.0,
                    fahrenheitToCelsius(i + 50.0)
            );
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
}

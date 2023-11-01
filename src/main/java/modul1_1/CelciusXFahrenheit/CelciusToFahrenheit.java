package modul1_1.CelciusXFahrenheit;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        // Receive temperature in Celcius
        double celcius = 10;

        // Convert to Fahrenheit
        double fahrenheit = 32 + ((double) 9 /5) * celcius;

        // Print the result
        System.out.println("Temperature in Celcius:");
        System.out.println(celcius);
        System.out.println("Temperature in Fahrenheit:");
        System.out.println(fahrenheit);
    }
}

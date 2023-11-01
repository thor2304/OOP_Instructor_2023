package modul1_1.ArealCirkel;

public class CircleAreaAdvanced {
    public static void main(String[] args) {
        // Define the radius of the circle
        int radiusA = 1;
        int radiusB = 3;
        int radiusC = 5;

        calculateArea(radiusA);
        calculateArea(radiusB);
        calculateArea(radiusC);
    }

    private static void calculateArea(int radius) {
        // Calculate the area of the circle by multiplying the radius by itself and then by pi
        double area = Math.PI * radius * radius;

        // Print the result
        System.out.println("Area of circle with radius " + radius + " is:");
        System.out.println(area);
    }
}

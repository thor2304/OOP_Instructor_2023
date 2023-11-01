package modul1_1.ArealCirkel;

public class CircleArea {
    public static void main(String[] args) {
        // Define the radius of the circle
        int radiusA = 1;
        int radiusB = 3;
        int radiusC = 5;

        // Calculate the area of the circle by multiplying the radius by itself and then by pi
        double areaA = Math.PI * radiusA * radiusA;
        double areaB = Math.PI * radiusB * radiusB;
        double areaC = Math.PI * radiusC * radiusC;

        // Print the result
        System.out.println("Area of circle with radius " + radiusA + " is:");
        System.out.println(areaA);

        System.out.println("Area of circle with radius " + radiusB + " is:");
        System.out.println(areaB);

        System.out.println("Area of circle with radius " + radiusC + " is:");
        System.out.println(areaC);

    }
}

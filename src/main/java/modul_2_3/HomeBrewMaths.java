package modul_2_3;

import java.util.Arrays;

public class HomeBrewMaths {
    public static void main(String[] args) {
        System.out.println("The discriminant of 2, 2, -3 is " + discriminant(2, 2, -3));
        System.out.println("The roots for 2x^2 + 2x - 3 are: " + Arrays.toString(roots(2, 2, -3)));
    }

    public static double discriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    /**
     * This function takes in the parameters for a 2nd degree polynomial <br>
     * and returns an array of the roots of this polynomial.
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static double[] roots(double a, double b, double c){
        double discriminant = discriminant(a, b, c);
        if (discriminant < 0) { // If the discriminant is 0, the polynomial has no roots
            return new double[0];
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{
                    (-b + Math.sqrt(discriminant)) / (2 * a),
                    (-b - Math.sqrt(discriminant)) / (2 * a)
            };
        }
    }
}

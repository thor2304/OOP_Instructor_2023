package modul1_3;

public class CircleArea {
    public static void main(String[] args) {
        int[] radii = {1,3,5};

        for (int i = 0; i < radii.length; i++) {
            System.out.println(radii[i] * radii[i] * Math.PI);
        }
    }
}

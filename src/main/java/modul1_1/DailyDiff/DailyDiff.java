package modul1_1.DailyDiff;

public class DailyDiff {
    public static void main(String[] args) {
        double monday = 21.5;
        double tuesday = 23.7;
        double wednesday = 19.6;
        double thursday = 22.5;
        double friday = 25.3;
        double saturday = 21.7;
        double sunday = 18.9;

        // Udskriv resultatet af tirsdag-mandag , onsdag - tirsdag osv.

        System.out.println(tuesday - monday);
        System.out.println(wednesday - tuesday);
        System.out.println(thursday - wednesday);
        System.out.println(friday - thursday);
        System.out.println(saturday - friday);
        System.out.println(sunday - saturday);
    }
}

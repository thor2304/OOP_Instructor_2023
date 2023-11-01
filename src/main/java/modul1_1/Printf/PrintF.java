package modul1_1.Printf;

public class PrintF {
    public static void main(String[] args) {
        int i = 42;
        long l = 56;
        float f = 3.14159f;
        double d = 3.14159*10;
        // 3 tallet i l=%,3d betyder at der bliver sat 3 enheders plads af til tallet som minimum
        // 6 tallet i d=%6.3f betyder at der bliver afsat 6 pladser som minimum (her er komma inklusive)
        // 3 tallet i den samme betyder at vi udskriver med 3 decimaler efter kommaet
        System.out.printf("i=%d l=%,3d f=%f d=%6.3f", i, l, f, d);
    }
}

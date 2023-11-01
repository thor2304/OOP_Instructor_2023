package modul1_1.Heltals_grænser;

public class Overflow {
    public static void main(String[] args) {
        System.out.println("Byte:");
        byte b = 127;
        System.out.println(b);
        b = (byte) (b + 1);
        System.out.println(b);
        b = (byte) (b - 1);
        System.out.println(b);

        System.out.println("Short:");
        short s = 32767;
        System.out.println(s);
        s = (short) (s + 1);
        System.out.println(s);

        System.out.println("Int:");
        int a = 2147483647;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);

        System.out.println("Long:");
        long l = 9223372036854775807L;
        System.out.println(l);
        l = l + 1;
        System.out.println(l);
    }
}

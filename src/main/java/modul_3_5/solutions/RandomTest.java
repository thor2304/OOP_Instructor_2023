package modul_3_5.solutions;

import java.util.Random;

public class RandomTest {
    static final int ITERATIONS = 4;
    static final int LENGTH = 480;
    static Random r = new Random();

    static int[] init(int length) {
        int[] a = new int[length];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt() % 100;
        }
        return a;
    }

    static int[] diff(int[] a, int[] b) {
        // guard: uneven length of inputs
        if (a.length != b.length) {
            return null;
        } // I have just added these brackets because it is best practice to always have them for if statements

        int[] d = new int[a.length];

        for (int i = 0; i < d.length; i++) {
            d[i] = b[i] - a[i]; // 1 -> i, such an annoying error to find. But it is very much possible by using the debugger.
        }

        return d;
    }

    static void print(int[] a) {
        int sum = 0;
        System.out.print("[");

        for (int i = 0; i < a.length; i++) {
            // break line nicely
            if (i != 0 && i % 24 == 0) {
                System.out.println();
                System.out.print(" ");
            }
            System.out.printf("%5d", a[i]);
            sum += a[i];
        }
        // is the above clean code? why? why not?

        int mean = sum / a.length;
        double vsum = 0;
        for (int i = 0; i < a.length; i++) {
            double diff = a[i] - mean;
            vsum += diff * diff;
        }

        System.out.printf(" ] avg=%4d stdev=%5.2f", mean, Math.sqrt(vsum / a.length));
        System.out.println("");
    }


    public static void main(String[] args) {
        for (int i = 0; i < ITERATIONS; i++) {
            int[] a1 = init(LENGTH);
            int[] a2 = init(LENGTH);
            int[] ad = diff(a1, a2);
            print(ad);
        }
    }
}

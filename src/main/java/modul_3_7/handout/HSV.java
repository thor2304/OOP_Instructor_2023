package modul_3_7.handout;

public class HSV {
    private final int h;
    private final int s;
    private final int v;

    public HSV(int h, int s, int v) {
        this.h = h;
        this.s = s;
        this.v = v;
    }

    public int getH() {
        return h;
    }

    public int getS() {
        return s;
    }

    public int getV() {
        return v;
    }

    // http://dystopiancode.blogspot.com/2012/06/hsv-rgb-conversion-algorithms-in-c.html
    public RGB asRGB() {
        double h = (double) (this.h * 360.0 / 255);
        double s = (double) this.s / 255.0;
        double v = (double) this.v / 255.0;
        double c = v * s;
        double m = v - c;
        double x = c * (1.0 - abs(((h / 60) % 2) - 1));
        double r, g, b;
        if (h >= 0 && h < 60) {
            r = c + m;
            g = x + m;
            b = m;
        } else if (h >= 60 && h < 120) {
            r = x + m;
            g = c + m;
            b = m;
        } else if (h >= 120 && h < 180) {
            r = m;
            g = c + m;
            b = x + m;
        } else if (h >= 180 && h < 240) {
            r = m;
            g = x + m;
            b = c + m;
        } else if (h >= 240 && h < 300) {
            r = x + m;
            g = m;
            b = c + m;
        } else if (h >= 300 && h < 360) {
            r = c + m;
            g = m;
            b = x + m;
        } else {
            r = m;
            g = m;
            b = m;
        }
        return new RGB((int) (r * 255), (int) (g * 255), (int) (b * 255));
    }

    public String toString() {
        return "HSV(" + h + "," + s + "," + v + ")";
    }

    private double abs(double input) {
        return (input < 0 ? -input : input);
    }
}

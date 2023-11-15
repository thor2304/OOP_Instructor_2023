package modul_3_7.handout;

public class RGB {
    int r, g, b;

    public RGB(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    // https://www.geeksforgeeks.org/program-change-rgb-color-model-hsv-color-model/
    public HSV asHSV() {
        double r = (double) this.r / 255;
        double g = (double) this.g / 255;
        double b = (double) this.b / 255;
        double cmin = min(r, g, b);
        double cmax = max(r, g, b);
        double diff = cmax - cmin;
        double h = -1;
        double s = -1;
        double v = -1;
        if (cmax == cmin) {
            h = 0;
        } else if (cmax == r) {
            h = (60 * ((g - b) / diff) + 360) % 360;
        } else if (cmax == g) {
            h = (60 * ((b - r) / diff) + 120) % 360;
        } else if (cmax == b) {
            h = (60 * ((r - g) / diff) + 240) % 360;
        }
        h *= 255.0 / 360;
        if (cmax == 0) {
            s = 0;
        } else {
            s = (diff / cmax) * 255;
        }
        v = cmax * 255;
        return new HSV((int) h, (int) s, (int) v);
    }

    public String toString() {
        return "RGB(" + r + "," + g + "," + b + ")";
    }

    private double min(double a, double b, double c) {
        return (a < b ? (a < c ? a : c) : (b < c ? b : c));
    }

    private double max(double a, double b, double c) {
        return (a > b ? (a > c ? a : c) : (b > c ? b : c));
    }
}


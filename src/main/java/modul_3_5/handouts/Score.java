package modul_3_5.handouts;

public class Score {
    public static void main(String[] args) {
        int points = 0;// imagine an arbitrary number of points between 0 and 100

        System.out.print("You ");

        if (points >= 50) {
            System.out.print("PASSED");
        }

        if (points <= 50) {
            System.out.print("FAILED");
        }

        System.out.println("!");
    }
}

package modul_3_5.solutions;

public class Score {
    public static void main(String[] args) {
        int points = 50;// imagine an arbitrary number of points between 0 and 100

        System.out.print("You ");

        if (points >= 50) {
            System.out.print("PASSED");
        }

        if (points < 50) { // One of these <= have to be < otherwise it will print out both for a score of 50
            System.out.print("FAILED");
        }

        // perhaps a better way to do it is to introduce a variable with the pass/fail text. See example method below

        // This problem is also caused by "managing" the state through print lines, which allow for multiple conflicting states at once.
        // If the program used a variable to determine grade or pass/fail, this could not happen.
        // My point here is that this problem can be easily "fixed" but the root cause is not the duplicated <=
        // The root cause is based application design, by mixing business logic with the presentation.

        System.out.println("!");

        betterPassFailPrinter(points);
    }

    public static void betterPassFailPrinter(int points){
        String passFailText = "FAILED";

        if (points >= 50){
            passFailText = "PASSED";
        }

        System.out.println("You " + passFailText + "!");
    }
}

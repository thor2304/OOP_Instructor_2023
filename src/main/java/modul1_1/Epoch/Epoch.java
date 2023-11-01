package modul1_1.Epoch;

public class Epoch {
    public static void main(String[] args) {
        long epochTime = 100_000_000;

        long secondsPerMinute = 60;
        long secondsPerHour = secondsPerMinute * 60;
        long secondsPerDay = secondsPerHour * 24;

        long secondsPerYear = secondsPerDay * 365;

        long years = epochTime / secondsPerYear;
        System.out.println("Years: " + years);

        long remainder = epochTime % secondsPerYear;

        long days = remainder / secondsPerDay;

        System.out.println("remainder: " +remainder);
        System.out.println("days: " +days);

        long diff = epochTime - (days * secondsPerDay + years * secondsPerYear);

        System.out.println("diff: " +diff);
        System.out.println(secondsPerDay);
        System.out.println("Are we within 24 hours?: " + (diff < secondsPerDay));

    }
}

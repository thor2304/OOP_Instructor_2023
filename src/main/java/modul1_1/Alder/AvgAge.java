package modul1_1.Alder;

public class AvgAge {
    public static void main(String[] args) {
        // List the ages of the computer scientist in this data set
        int ada_lovelace = 36;
        int dennis_ritchie = 70;
        int grace_hopper = 85;
        int hedy_lamarr = 85;
        int edsger_dijkstra = 72;
        int douglas_engelbart = 88;

        // Calculate the average age of the computer scientists
        float male_avg = (float)(dennis_ritchie+edsger_dijkstra+douglas_engelbart)/3;
        float female_avg = (float)(ada_lovelace+grace_hopper+hedy_lamarr)/3;
        float avg = (male_avg+female_avg)/2;

        // Calculate the difference between the average ages
        float diff = male_avg-female_avg;

        // Print the results
        System.out.print("Average livespan of a male computer scientist: ");
        System.out.println(male_avg);
        System.out.print("Average livespan of a female computer scientist: ");
        System.out.println(female_avg);
        System.out.print("Average livespan of a computer scientist: ");
        System.out.println(avg);
        System.out.print("Males lives this much longer than female: ");
        System.out.println(diff);

    }
}

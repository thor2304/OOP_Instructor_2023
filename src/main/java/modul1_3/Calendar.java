package modul1_3;

public class Calendar {
    public static void main(String[] args) {
        int[] daysPerMonthRegular = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysPerMonthLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        boolean leapYear = false;

        for(int year = 2000; year <= 2020; year++){
            leapYear = year % 4 == 0;

            int[] activeYear;

            if(leapYear){
                activeYear = daysPerMonthLeapYear;

            }else {
                activeYear = daysPerMonthRegular;
            }

            System.out.print("Year: " + year + " ");
            for (int month = 0; month < activeYear.length; month++) {
                System.out.print( monthNames[month] + ": " + activeYear[month] + ", ");
            }
            System.out.println();
        }

    }
}

package jpnn.JavaChallenges.practice;

public class MinutesToYearsDaysCalculator {
    
    private static final int MIN_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;
    private static final int DAYS_PER_YEAR = 365;
    private static final int MIN_PER_DAY = HOURS_PER_DAY * MIN_PER_HOUR;
    private static final int MIN_PER_YEAR = MIN_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;

    /*
     * Calculates the number of minutes in a day by multiplying the number of hours per day by the number of minutes per hour.
     * Calculates the number of minutes in a year by multiplying the number of minutes per hour, the number of hours per day, and the number of days per year.
     * For that I have to know the minutes per hours, hours per day and days per year.
     */





    //The method should not return anything (void) 
    //and it needs to calculate the years and days from the minutes parameter.
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }

        long years = minutes / MIN_PER_YEAR;
        long days = (minutes / MIN_PER_DAY) % DAYS_PER_YEAR;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");


    }

}

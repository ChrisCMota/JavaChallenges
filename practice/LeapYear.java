package jpnn.practice;

public class LeapYear {
    
    public static boolean isLeapYear(int year){
        
        //check the input
        if(year < 1 || year > 9_999) return false;

        //leap year is divisible by 4 but not by 100.
        //if it is divisible by 100 it has to be divisible by 400 as well
        return (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);

    }

}

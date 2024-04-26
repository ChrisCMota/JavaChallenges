package jpnn.JavaChallenges.basicpractice;

public class SwitchCaseExmp {


    //regular switch case
    public static int getDaysInMonth(int month, int year){
        if(year < 1 || year > 9_999) return -1;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            
            case 2: if (LeapYear.isLeapYear(year)) {
                return 29;
            }else{
                return 28;
            }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            default: return -1;
               
        }
    }

    //enhanced switch case
    public static int getDaysInMonthEnhanced(int month, int year){
        if(year < 1 || year > 9_999) return -1;

        return switch(month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;

            case 2 -> LeapYear.isLeapYear(year) ? 29 : 28;

            case 4, 6, 9, 11 -> 30;

            default -> -1;
        };
    }

    
}

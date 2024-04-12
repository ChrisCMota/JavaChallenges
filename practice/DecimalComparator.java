package jpnn.JavaChallenges.practice;

public class DecimalComparator {
    
    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2){
        long n1Rounded = (long) (n1 * 1000);
        long n2Rounded = (long) (n2 * 1000);

        return n1Rounded == n2Rounded;
    }

}

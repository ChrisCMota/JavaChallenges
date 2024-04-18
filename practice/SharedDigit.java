package jpnn.JavaChallenges.practice;

public class SharedDigit {

    //The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
    public static boolean hasSharedDigit(int n1, int n2){
        if (n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99) return false;
        
        boolean isShared = false;
        
        int n1LastDigit = n1 % 10;
        int n2LastDigit = n2 % 10;
        int n1FirstDigit = n1 / 10;
        int n2FristDigit = n2 / 10;
        
        if(n1LastDigit == n2LastDigit || n1FirstDigit == n2FristDigit || n1FirstDigit == n2LastDigit || n1LastDigit == n2FristDigit){
            isShared = true;
        }
        
     return isShared;
    }
}

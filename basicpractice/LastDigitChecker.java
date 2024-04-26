package jpnn.JavaChallenges.basicpractice;

public class LastDigitChecker {
    public static boolean isValid(int n){
        return n > 9 && n < 1001;
    }
    
    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        if(!isValid(n1) || !isValid(n2) || !isValid(n3)) return false;
        
        
        int n1LastDigit = n1 % 10;
        int n2LastDigit = n2 % 10;
        int n3LastDigit = n3 % 10;
        
        if(n1LastDigit == n2LastDigit || n1LastDigit == n3LastDigit || n2LastDigit == n3LastDigit){
            return true;
        }else{
            return false;
        }
        
    }   
}

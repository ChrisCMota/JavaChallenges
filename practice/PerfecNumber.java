package jpnn.JavaChallenges.practice;

public class PerfecNumber {
    
    public static boolean isPerfectNumber(int number){
        if (number < 1)return false;
        
        int divisorSum = 0;
        
        for (int i = 1; i < number; i++){
            if(number % i == 0){
                divisorSum += i;
            }
        } 
        
        return divisorSum == number;
        
    }
}

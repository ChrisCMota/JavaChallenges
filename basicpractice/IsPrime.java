package jpnn.JavaChallenges.basicpractice;

import java.util.ArrayList;
import java.util.List;

public class IsPrime {

    public static List<Integer> first3PrimeNumbersInRage(int numFrom, int numTo){
        int count = 0;
        List<Integer> first3PrimesNumbers = new ArrayList<>();
        for(int i = numFrom; i <= numTo; i++){
            if (isPrime(i)) {
                first3PrimesNumbers.add(i);
                count++;
                if (count == 3) break;   
            }
        }
        return first3PrimesNumbers;
    }
    
    public static boolean isPrime(int wholeNumber){
        if( wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static List<Integer> isPrimeInRange(int numFrom, int numTo){
        List<Integer> primeNumbersList = new ArrayList<>();
        for (int i = numFrom; i <= numTo; numFrom++) {
            if (isPrime(i)) {
                primeNumbersList.add(i);
            }
        }

        return primeNumbersList;
    }


}

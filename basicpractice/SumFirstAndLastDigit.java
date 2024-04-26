package jpnn.JavaChallenges.basicpractice;

public class SumFirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0) return -1;

        //the last digit of a (int)number is the ramainder of itself divided by 10
        int lastDigit = number % 10;
        //if number >= 10 means that there is more than one number
        while (number >= 10) {
            //keeping dividing by 10 and dropping the last digit 
            //when the condition is satisfied will be only the frist number of the original remainding
            number /= 10;
        }

        return lastDigit + number;
    }
}

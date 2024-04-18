package jpnn.JavaChallenges.practice;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        if (number < 0) {
            return -1;
        }
        //store the sum of lastDigit if even
        int sum = 0;

        while (number > 0) {
            //store the last digit
            int lastDigit = number % 10;
            //check if it is even and sum if true
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            //stripping out the last digit
            number /= 10;
        }
        
        return sum;
    }
}

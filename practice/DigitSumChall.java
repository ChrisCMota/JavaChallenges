package jpnn.JavaChallenges.practice;

public class DigitSumChall {
    

    //sum the digits ex: 1234 = 1+2+3+4 = 10
    //no negative numbers
    public static int sumDigits(int number){
        if(number < 0) return -1;

        int sum = 0;
        
        //stop when the number is not divided by 10 and it has a single number
        while (number > 9) {
            //getting the remainder of the number divided by 10 gives us the rightmost digit
            //when you divide by 10, you're essentially stripping away(arrancando) the rightmost digit
            //add the result into sum
            //only work with int because it rounds the number
            sum += (number % 10);
            //divide a number by 10 drops the mostright digit (if int)
            //set the number to be the number without the last digit
            number = number / 10;
        }

        sum += number;

        return sum;
    }
}

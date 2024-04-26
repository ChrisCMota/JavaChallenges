package jpnn.JavaChallenges.basicpractice;

public class IsPalindrome {
    public static boolean isPalindrome(int number){
        //Store the reversed of the input number
        int reverse = 0;
        //Store the original value because the input number will be modified during the process of reversing it
        int original = number;

        while (original != 0) {
            //reverse the original number by taking the last digit and appending it to the reverse
            //after shifting one place to the left multiplying by 10
            reverse = reverse * 10 + original % 10;
            //remove the last digit by integer divison, shifting to the right
            original /= 10;
        }
        return reverse == number;
    }
}

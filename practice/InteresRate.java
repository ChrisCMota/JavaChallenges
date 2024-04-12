package jpnn.practice;

public class InteresRate {

    public static void printRate(double amount){
        

        for (double rate = 7.5; rate <= 10.0; rate += 0.25){
            double interestRate = calculateInterest(amount, rate);
            System.out.println(interestRate);
        }

    }

    public static double calculateInterest(double amount, double rate){

        return (amount * (rate / 100));
    }
}

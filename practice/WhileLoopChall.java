package jpnn.JavaChallenges.practice;

public class WhileLoopChall {
    
    int evenNummberCounter = 0;
    int oddNumberCounter = 0;

    public boolean isEvenNumber(int number){
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public void printEvenNumbersFrom5To20(){
        int counter = 5;
        while (counter < 21) {
            if (isEvenNumber(counter)) {
                evenNummberCounter++;
                System.out.println(counter);
                counter++;
                if (evenNummberCounter == 5) {
                    break;
                }
            }else{
                counter++;
                oddNumberCounter++;
                continue;
            }
        }
        System.out.println("Even Numbers = " + evenNummberCounter);
        System.out.println("Odd Numbers = " + oddNumberCounter);
    }

}

package jpnn.JavaChallenges.practice;

public class WhileLoopChall {
    

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
                System.out.println(counter);
                counter++;
            }else{
                counter++;
                continue;
            }
        }
    }

}

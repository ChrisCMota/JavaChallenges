package jpnn.JavaChallenges.basicpractice;

public class MegaBytesConverter{

    public MegaBytesConverter(){}

    public static void printMegaBytesAndKiloBytes(int kilobytes){
        //always check the input
        if(kilobytes < 0){
            System.out.println("Invalid Value");
        }

        //variable to store the convertion of KB into MB. (1MB = 1024KB)
        int megaByte = kilobytes / 1024;

        //variable to hold the remainder of the division 
        //Which represents the number of KB that couldn't form a complete MB
        int remainingKB = kilobytes % 1024;

        System.out.println(
            kilobytes + " KB = " + megaByte + " MB and " + remainingKB + " KB"
        );
    }

}
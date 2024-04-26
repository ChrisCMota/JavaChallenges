package jpnn.JavaChallenges.basicpractice;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;

        int commonDivisor = 0;

        if (first > second) {
            for (int i = 1; i <= first; i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    commonDivisor = i;
                }
            }
        } else {
            for (int j = 1; j <= second; j++) {
                if ((second % j == 0) && (first % j == 0)) {
                    commonDivisor = j;
                }
            }
        }
        return commonDivisor;

    }
}

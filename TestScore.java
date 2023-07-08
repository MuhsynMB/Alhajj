import java.util.Scanner;


public class TestScore {
    public static void main(string[] args){
        int[] scores = getScore();
        int lowestScore = findLowest(scores);
        double average = calcAverage(scores, lowestScore);

        System.out.println("The average ofthe five highest scores is %.2f%n", average);
    }
    public static int[]getscores(){
        Scanner input = new Scanner(System.in);
        int[] scores = new int[6];

        System.out.print("Enter six test scores: ");
        for (int i = 0; i < 6; i++) {
         scores[i] = input.nextlnt();   
        }
        return scores;
    }
    public static int findLowest(int[]scores){
        intlowestScore = scores[0];

        for (int i = 1 ; i < 6; i++) {
            if (scores[i]< lowestScore) {
                lowestScore = scores [i];

            }
            
        }
        return lowestScore;
    } 
    public static double calcAverage(int[]scores, int lowestScore){
        int sum = 0;

        for (int i = 0; i < 6; i++) {
            if(scores[i] != lowestScore){
                sum += scores[i];
            }
            
        }
        return (double) sum/5;
    }

}

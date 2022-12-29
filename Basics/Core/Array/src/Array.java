import java.util.Scanner;

public class Array {
    public static void main(String args[]){

        int score = 40;
        int[] scoreArray = new int[10];

        scoreArray[0] = 8;
        scoreArray[2] = 9;
        //System.out.println(scoreArray[2]);
        for (int i = 0 ; i<10;i++){
            scoreArray[i] = i * 10;
        }
        for (int i = 0 ; i < scoreArray.length ; i++){
            System.out.println(scoreArray[i]);
        }

    }
}

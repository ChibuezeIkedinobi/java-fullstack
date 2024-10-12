package algorithm;

import java.util.Scanner;

public class TripletsComparison {
    public static void main(String[] args) {

        int[] nohimScores = getScores();
        int[] freedomScores = getScores();

        int[] result = compareScores(nohimScores, freedomScores);
        System.out.println("Nohim: "+ result[0]+" Freedom: "+result[1]);

    }



    // get the scores
    private static int[] getScores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grades(Nohim | Freedom)");
        int[] scores = new int[3];
        for (int i = 0; i < 3; i++) {
            scores[i] = scanner.nextInt();
        }
        return scores;
    }

    //compare the scores
    private static int[] compareScores(int[] nohim, int[] freedom) {
        int nohimPoints = 0;   // 2
        int freedomPoint = 0;  // 1

        for (int i = 0; i < 3; i++) {
            if(nohim[i] > freedom[i]) {
                nohimPoints++;
            } else if (nohim[i] < freedom[i]) {
                freedomPoint++;
            }
        }
        return new int[] {nohimPoints, freedomPoint};

    }
}

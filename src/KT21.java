/**
 * Created by Maila on 30/01/2016.
 */
public class KT21 {



    public static void main (String[]args){
        int[][] res = muster(9);
    }

    public static int[][] muster ( int n){

        int[][] vastus = new int[n][n];
        for (int i = 0; i < vastus.length; i++) {
            for (int j = 0; j < vastus[i].length; j++) {
                if (i>j) {
                    vastus[i][j] = j;
                } else {
                    vastus[i][j] = i;
                }
            }

        }

        return vastus; // TODO!!! Your code here
    }

}


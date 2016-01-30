/**
 * Created by Maila on 30/01/2016.
 */
public class MassiivIndexiMin {
    public static void main (String[] args) {
        int[][] res = muster (9);
    }

    public static int[][] muster (int n) {
        int i;
        int k;
        int [][] res = new int[n][n];
        for (i = 0; i < n; i++) {
            for (k = 0; k <n; k++) {
                res[i][k]= Math.min((i), (k));
                System.out.print(res[i][k]);
            }
            System.out.println();
        }
        return res; // TODO!!! Your code here
    }

}
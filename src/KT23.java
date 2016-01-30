/**
 * Created by Maila on 30/01/2016.
 */
public class KT23 {

    public static void main (String[] args) {
        System.out.println (score (new int[]{1, 2, 3})); // 9
        // Your tests here
    }

    public static int score (int[] points) {
        int min2 = points[0];
        int min1 = points[0];
        int summa = 0;
        int koht = 0;

        for (int i = 0; i < points.length; i++) {
            if(points[i]<min1) {
                min1 = points [i];
                koht = i;
            }
        }
        if (koht == 0){
            min2 = points[1];
        }
        for (int i = 0; i < points.length; i++) {
            if (i != koht && points[i] < min2) {
                min2 = points[i];
            }
        }

        for (int i = 0; i < points.length; i++) {
            summa = summa + points[i];
        }

        summa = summa - min1 - min2;
        return summa; // TODO!!! Your program here
    }
}

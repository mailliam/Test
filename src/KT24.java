import java.util.Arrays;

/**
 * Created by Maila on 30/01/2016.
 */
public class KT24 {

    public static void main (String[] args) {
        int[] res = veeruMinid (new int[][]{{1}, {4, 5, 6}}); // {1, 2, 3}
        // YOUR TESTS HERE
    }

    public static int[] veeruMinid (int[][] m) {

        int massiive = m.length;
        int pikim = 0;

        for (int i = 0; i < massiive; i++) {
            if(m[i].length > pikim) {
                pikim = m[i].length;
            }
        }

        int[] tulemus = new int[pikim];

        for (int i = 0; i < massiive; i++) {
            m[i] = Arrays.copyOf(m[i], pikim);
            for (int j = 0; j < pikim; j++) {
                int veeruMin = m[0][j];
                if (m[i][j] < veeruMin) {
                    veeruMin = m[i][j];
                }
                tulemus[j] = veeruMin;
            }

        }
        System.out.println(Arrays.toString(tulemus));

        // TODO!!!    YOUR PROGRAM HERE
        return tulemus;
    }

}


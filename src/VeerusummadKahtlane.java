import java.util.Arrays;

/**
 * Created by Maila on 30/01/2016.
 */
public class VeerusummadKahtlane {
    public static void main(String[] args) {
        int[] res = veeruSummad (new int[][] { {1,1,1,1,0}, {1,1,1}, {1,1} }); // {5, 7, 9}
        // {6, 8, 9, 1}
    }
    public static int[] veeruSummad(int[][] m) {
        int massiive = m.length;
        int koigePikem=0;
        for (int i = 0; i < massiive; i++) {
            if(m[i].length>koigePikem) {
                koigePikem = m[i].length;
            }
        }
        int[] tulemus = new int[koigePikem];
        for (int i = 0; i < koigePikem; i++) {
            tulemus[i]=0;
            for (int j = 0; j < massiive; j++) {
                if (i > m[j].length-1) {
                    m[j] = Arrays.copyOf(m[j], m[j].length + (m[j].length - i + 1));
                    m[j][m[j].length - i + 1] = 0;
                    tulemus[i] = tulemus[i] + m[j][i];
                } else {
                    tulemus[i] = tulemus[i] + m[j][i];
                }
            }
        }
        // TODO!!!    YOUR PROGRAM HERE
        System.out.println(Arrays.toString(tulemus));
        return tulemus;
    }
}

import java.util.Arrays;

/**
 * Created by Maila on 30/01/2016.
 */
public class MaatriksSiksak2 {

    public static void main(String[] args) {

        String[][] siksak = new String[100][10];

        for (int i = 0; i < siksak.length; i++) {
            for (int j = 0; j < siksak[i].length; j++) {
                if ((i+j) % 18 ==0  || (i-j) % 18 == 0) {
                    siksak[i][j] = "x";
                } else {
                    siksak[i][j] = " ";
                }
            }
            System.out.println(Arrays.toString(siksak[i]));
        }
    }
}

import java.util.Arrays;

/**
 * Created by Maila on 30/01/2016.
 */
public class MaatriksSikSak {
    static String[][] tykk1 = new String[10][10];
    static String[][] tykk2 = new String[8][10];

    public static void main(String[] args) {
        for (int l = 0; l < 5; l++) {

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == j) {
                        tykk1[i][j] = "x";
                    } else {
                        tykk1[i][j] = " ";
                    }
                }
                System.out.println(Arrays.toString(tykk1[i]));
            }

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i+j == 8) {
                        tykk2[i][j] = "x";
                    } else {
                        tykk2[i][j] = " ";
                    }
                }
                System.out.println(Arrays.toString(tykk2[i]));
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    tykk1[i][j] = "x";
                } else {
                    tykk1[i][j] = " ";
                }
            }
            System.out.println(Arrays.toString(tykk1[i]));
        }
    }
}


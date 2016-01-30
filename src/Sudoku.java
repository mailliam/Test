import java.util.Arrays;

/**
 * Created by Maila on 30/01/2016.
 */
public class Sudoku {

    public static void main(String[] args) {
        int[][] sudoku = new int[9][9];


        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {

                if (i == 0 && j == 0) {
                    int number = (int) (Math.random()*9+1);
                    sudoku[i][j] = number;
                }

                if(i == 0 && j > 0) {

                    int[] rida = new int[j];

                    for (int k = 0; k < rida.length; k++) {
                        rida[k] = sudoku[i][j-1];
                    }


                    for (int k = 0; k < rida.length; k++) {
                        int number = (int) (Math.random()*9+1);
                        if(rida[k] != number) {
                            sudoku[i][j] = number;
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(sudoku[i]));
        }
    }
}

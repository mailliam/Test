/**
 * if, while, int[]
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said üle keskmise?
 */
public class Algoritm1 {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {
        System.out.println(yleKeskmise(new int[]{19, 45, 55, 67, 89}));
        System.out.println(yleKeskmise(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(yleKeskmise(new int[]{21, 85, 45}));
    }

    // Siia meetodi sisse kirjuta lahendus.
    private static int yleKeskmise(int[] ints) {
        int summa = 0;
        int mituYleKeskmise = 0;
        double keskmine;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 60) {
                ints[i] = 60;
            }
            summa = summa + ints[i];
        }
        keskmine = summa/ints.length;
        System.out.println(keskmine);

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > keskmine) {
                mituYleKeskmise = mituYleKeskmise + 1;
            }
        }

        return mituYleKeskmise;
    }

}

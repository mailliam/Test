/**
 * Created by Maila on 30/01/2016.
 */
public class KT22 {


    public static void main (String[] args) {
        String s = "Tere, TUDENG, 1234!";
        String t = asenda (s); // "Tere**TUDENG*******"
        System.out.println (s + " > " + t);
    }

    public static String asenda (String s) {

        for (int i = 0; i < s.length(); i++) {
            if(!Character.isAlphabetic(s.charAt(i))) {
                s = s.replace(s.charAt(i), '*');
            }

        }
        return s; // TODO!!! Your code here
    }

}
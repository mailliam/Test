import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Maila on 27/01/2016.
 */
public class Foor {
    private String name;
    private ArrayList tuled = new ArrayList();

    public Foor(String fooriNimetus) {
        name = fooriNimetus;
    }

    public void syytaTuli(String varv) {
        boolean veelPole = true;
        for (int i = 0; i < tuled.size(); i++) {
            if (tuled.get(i) == varv) {
                veelPole = false;
            }
        }

        if (veelPole) {
            tuled.add(varv);
        }
    }

    public void kustutaTuli(String varv) {
        tuled.remove(varv);
    }

    public ArrayList misTuledPolevad() {
        if (tuled.size() == 0) {
            ArrayList yhtkiTuldEiPole = new ArrayList();
            yhtkiTuldEiPole.add("Mitte ykski");
            return yhtkiTuldEiPole;
        }
        return tuled;
    }

    public String votaNimetus() {
        return name;
    }

    public void hakkeridSaidKontrolli() {
        String[] voimalikudTuled = {"kollane", "roheline", "punane"};
        name = "Avariitekitaja";
        tuled.clear();

        int numberOfLights = (int) (Math.random()*4);

        for (int i = 0; i < numberOfLights; i++) {
            boolean panenTulePolema = ((int) (Math.random()*2) == 1);
            if (panenTulePolema)
                tuled.add(voimalikudTuled[i]);
        }

    }
}

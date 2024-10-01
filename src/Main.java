import java.util.*;
import javax.swing.*;

public class Main {
    public Main() {
        Greenest Meatloaf = new KöttätandeVäxt("Meatloaf", 0.7 );
        Greenest Laura = new Palm("Laura", 5.0);
        Greenest Olof = new Palm("Olof", 1.0);
        Greenest Igge = new Kaktus("Igge", 20);
        List<Greenest> plantsOfGreenest = Arrays.asList(Meatloaf, Laura, Olof, Igge);

        boolean plantLocated = true;
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Vilken växt är törstig? ");
            if (input == null) {
                break;
            }
            plantLocated = false;

            for (Greenest plant : plantsOfGreenest) {
                if (plant.getPlantName().equalsIgnoreCase(input)) {
                    plant.showMessage();
                    plantLocated = true;
                    break;
                }
            }
            if (!plantLocated) {
                JOptionPane.showMessageDialog(null, "Kontrollera stavning och försök igen");
            }
        }
    }

    public static void main(String[] args) {

        Main main = new Main();
    }
}

import java.util.*;
import javax.swing.*;

public class Main {
    public Main() {
        String output = "Vilken växt är törstig? ";
        String errormessage = "VÄnligen kontrollera stavning och försök igen!";

        Greenest Meatloaf = new MeatEatingPlant("Meatloaf", 0.7 );
        Greenest Laura = new Palm("Laura", 5.0);
        Greenest Olof = new Palm("Olof", 1.0);
        Greenest Igge = new Cactus("Igge", 20);
        List<Greenest> plantsOfGreenest = Arrays.asList(Meatloaf, Laura, Olof, Igge);

        boolean plantLocated = true;
        while (true) {
            String input = JOptionPane.showInputDialog(null, output);
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
                JOptionPane.showMessageDialog(null, errormessage);
            }
        }
    }

    public static void main(String[] args) {

        Main main = new Main();
    }
}

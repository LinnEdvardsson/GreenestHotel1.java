import javax.swing.*;

public class Kaktus extends Greenest {
    /*
     ** Instansvariabel inkapslad och även satt som final då det inte kommer ändras för aktuell planta.
     */

    public Kaktus(String plantName, double plantHeight) {
        super(plantName, plantHeight);

    }

    /*
     **  Nedan är Interface implemeterat som ärvs från superklass Greenest som subklass också ärver.
     *   Använder polymorfism för att specialbygga hur metoden ska funka i akutell subklass.
     */

    @Override
    public double calculateFluid() {
        return 0.02;
    }


    @Override
    public void showMessage() {
        JOptionPane.showMessageDialog(null, this.getPlantName() + " vill ha " + calculateFluid() + " l " + LiquidEnum.LIQUID_KAKTUS.getLiquid() + " per dag." );
    }
}


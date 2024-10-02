import javax.swing.*;

public class MeatEatingPlant extends Greenest {
    public MeatEatingPlant(String plantName, double plantHeight) {
        super(plantName, plantHeight);
    }

    /*
     **  Nedan är Interface implemeterat från superklass Greenest som subklass också ärver.
     *   Använder polymorfism för att specialbygga hur metoden ska funka i akutell subklass med hjälp av Enums.
     */
    @Override
    public double calculateFluid() {
        double standardAmount = 0.1;
        return standardAmount + (0.2 * getPlantHeight());
    }

    @Override
    public void showMessage() {
        JOptionPane.showMessageDialog(null, this.getPlantName() + " vill ha " + calculateFluid() + " l " + LiquidEnum.LIQUID_KÖTTÄTANDE.getLiquid() + " per dag");
    }
}

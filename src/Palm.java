import javax.swing.*;


public class Palm extends Greenest {

    public Palm(String plantName, double plantHeight) {
        super(plantName, plantHeight);
    }

    /*
     **  Nedan är Interface implemeterat från superklass Greenest som subklass också ärver.
     *   Använder polymorfism för att specialbygga hur metoden ska funka i akutell subklass.
     */

    @Override
    public double calculateFluid() {
        return getPlantHeight() * 0.5;
    }


    @Override
    public void showMessage() {
        JOptionPane.showMessageDialog(null,this.getPlantName() + " vill ha " +  calculateFluid() + " l " + LiquidEnum.LIQUID_PALM.getLiquid() + " per dag" );
    }





}
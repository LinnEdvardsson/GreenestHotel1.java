public abstract class Greenest implements AmountOfFluid{ //Greenest superklass som inplementerar interface = alla subklasser äver dessa.
    /*
     **  Nedan är instansvarialber gjorda som private med getter/setter under för inkapsling. Att metoder måste användas för att hämta/ändra värde på akutell variabel.
     */
    private String plantName;
    private double plantHeight;


    public Greenest(String plantName, double plantHeight) {
        this.plantName = plantName;
        this.plantHeight = plantHeight;

    }

    public String getPlantName() { return plantName; }

    public double getPlantHeight() { return plantHeight; }


    public abstract double calculateFluid();

    public abstract void showMessage();
}

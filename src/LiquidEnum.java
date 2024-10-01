public enum LiquidEnum {

    LIQUID_PALM("Kranvatten"),
    LIQUID_KAKTUS("Mineralvatten"),
    LIQUID_KÖTTÄTANDE("Proteindryck");

    private final String liquid;


    LiquidEnum(String liquid) {
        this.liquid = liquid;
    }

    public String getLiquid() {
        return liquid;

    }
}


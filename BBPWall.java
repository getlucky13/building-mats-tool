public class BBPWall {
    private String size, type;
    private int tier, nails, planks, sheetMetal, morterMix, concreteBricks;
    final int kitNails = 3;
    final int kitPlanks = 3;
    
    public BBPWall(){
        this.size = "Large";
        this.type = "Full";
        tier = 1;
        nails = 20 + kitNails;
        planks = 11 + kitPlanks;
    }
}

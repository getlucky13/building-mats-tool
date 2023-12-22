public class BBPWall implements BBPPiece {
    private String size, type;
    private int tier, nails, planks, sheetMetal, morterMix, concreteBricks;

    public BBPWall(){
        this.size = "Large";
        this.type = "Full";
        tier = 1;
        nails = 20 + kitNails;
        planks = 11 + kitPlanks;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public int getNails() {
        return nails;
    }

    public void setNails(int nails) {
        this.nails = nails;
    }

    public int getPlanks() {
        return planks;
    }

    public void setPlanks(int planks) {
        this.planks = planks;
    }

    public int getSheetMetal() {
        return sheetMetal;
    }

    public void setSheetMetal(int sheetMetal) {
        this.sheetMetal = sheetMetal;
    }

    public int getMorterMix() {
        return morterMix;
    }

    public void setMorterMix(int morterMix) {
        this.morterMix = morterMix;
    }

    public int getConcreteBricks() {
        return concreteBricks;
    }

    public void setConcreteBricks(int concreteBricks) {
        this.concreteBricks = concreteBricks;
    }

    public void getMats() {

    }

    public HashMap calMats(){
        
    }
}

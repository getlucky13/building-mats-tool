public class BBPKit {
    private int planks, nails;

    public BBPKit(){
        planks = 3;
        nails = 3;
    }

    public int getPlanks() {
        return planks;
    }

    public void setPlanks(int planks) {
        this.planks = planks;
    }

    public int getNails() {
        return nails;
    }

    public void setNails(int nails) {
        this.nails = nails;
    }
    
    public String toString() {
        return "BBP Blueprint Kit: " + planks + " planks and " + nails + " nails";
    }
}

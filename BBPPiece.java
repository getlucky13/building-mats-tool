import java.util.*;

public interface BBPPiece {
    final int kitNails = 3;
    final int kitPlanks = 3;
    public void getMats();
    public HashMap<String, Integer> calcMats(int amount);
}
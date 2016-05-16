package io.FoF.SicBoResultsChecker;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForDiceSingles {

    /**
     * This class checks the dice roll and returns true for a specific single
     * @param dicesValues
     * @param specificValue
     * @return
     */
    public boolean checkForSingles(int[] dicesValues , int specificValue) {
        if ((dicesValues[0] == specificValue) || (dicesValues[1] == specificValue) || (dicesValues[2] == specificValue)) {
            return true;
        }
        return false;
    }

}

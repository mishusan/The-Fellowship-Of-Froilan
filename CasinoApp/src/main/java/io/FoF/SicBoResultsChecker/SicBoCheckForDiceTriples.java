package io.FoF.SicBoResultsChecker;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForDiceTriples {

    /**
     * This class checks the dice roll and returns true for any triple
     * @param dicesValues
     * @return
     */
    public boolean checkForAnyTriple(int[] dicesValues) {
        if (((dicesValues[0] == dicesValues[1]) && (dicesValues[1] == dicesValues[2]) && (dicesValues[0] == dicesValues[2]))) {
            return true;
        }
        return false;
    }/**
     * This class checks the dice roll and returns true for a specific triple
     * @param dicesValues
     * @return
     */

    public boolean checkForAnyTriple(int[] dicesValues, int specificValue) {
        if (checkForAnyTriple(dicesValues)) {
            if (dicesValues[0] == specificValue) {
                return true;
            }
        }
        return false;
    }


}

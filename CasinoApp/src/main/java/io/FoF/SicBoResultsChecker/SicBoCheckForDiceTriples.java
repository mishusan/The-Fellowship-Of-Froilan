package io.FoF.SicBoResultsChecker;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForDiceTriples {

    //This class checks the dice roll triples

    public boolean checkForAnyTriple(int[] dicesValues) {
        if (((dicesValues[0] == dicesValues[1]) && (dicesValues[1] == dicesValues[2]) && (dicesValues[0] == dicesValues[2]))) {
            return true;
        }
        return false;
    }

    public boolean checkForAnyTriple(int[] dicesValues, int specificValue) {
        if (checkForAnyTriple(dicesValues)) {
            if (dicesValues[0] == specificValue) {
                return true;
            }
        }
        return false;
    }


}

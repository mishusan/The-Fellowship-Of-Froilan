package io.FoF.SicBoResultsChecker;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForDiceDoubles {

    //This class checks the dice roll doubles

    public boolean checkForDoubles(int[] dicesValues, int specificValue) {
        int numberOfSpecificValues = 0;
        if (dicesValues[0] == specificValue) {
            numberOfSpecificValues++;
        }
        if (dicesValues[1] == specificValue) {
            numberOfSpecificValues++;
        }
        if (dicesValues[2] == specificValue) {
            numberOfSpecificValues++;
        }
        if (numberOfSpecificValues > 1) {
            return true;
        }
        return false;
    }

}

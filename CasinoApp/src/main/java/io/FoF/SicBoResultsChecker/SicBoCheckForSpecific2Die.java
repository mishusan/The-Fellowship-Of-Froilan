package io.FoF.SicBoResultsChecker;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForSpecific2Die {

    public boolean check2Die(int[] dicesValues, int checkValue1, int checkValue2) {
        boolean roll1 = false;
        boolean roll2 = false;
        if ((dicesValues[0] == checkValue1) || (dicesValues[1] == checkValue1) || (dicesValues[2] == checkValue1)) {
            roll1 = true;
        }
        if ((dicesValues[0] == checkValue2) || (dicesValues[1] == checkValue2) || (dicesValues[2] == checkValue2)) {
            roll2 = true;
        }
        if ((roll1) && (roll2)) {
            return true;
        }
        return false;
    }
}

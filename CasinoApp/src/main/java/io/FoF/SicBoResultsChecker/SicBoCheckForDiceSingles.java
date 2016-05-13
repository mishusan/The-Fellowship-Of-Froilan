package io.FoF.SicBoResultsChecker;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForDiceSingles {

    //This class checks the dice roll singles

    public boolean checkForSingle1s(int[] dicesValues) {
        if ((dicesValues[0] == 1) || (dicesValues[1] == 1) || (dicesValues[2] == 1)) {
            return true;
        }
        return false;
    }

    public boolean checkForSingle2s(int[] dicesValues) {
        if ((dicesValues[0] == 2) || (dicesValues[1] == 2) || (dicesValues[2] == 2)) {
            return true;
        }
        return false;
    }

    public boolean checkForSingle3s(int[] dicesValues) {
        if ((dicesValues[0] == 3) || (dicesValues[1] == 3) || (dicesValues[2] == 3)) {
            return true;
        }
        return false;
    }

    public boolean checkForSingle4s(int[] dicesValues) {
        if ((dicesValues[0] == 4) || (dicesValues[1] == 4) || (dicesValues[2] == 4)) {
            return true;
        }
        return false;
    }

    public boolean checkForSingle5s(int[] dicesValues) {
        if ((dicesValues[0] == 5) || (dicesValues[1] == 5) || (dicesValues[2] == 5)) {
            return true;
        }
        return false;
    }

    public boolean checkForSingle6s(int[] dicesValues) {
        if ((dicesValues[0] == 6) || (dicesValues[1] == 6) || (dicesValues[2] == 6)) {
            return true;
        }
        return false;
    }
}

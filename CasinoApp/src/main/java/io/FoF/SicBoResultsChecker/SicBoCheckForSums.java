package io.FoF.SicBoResultsChecker;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForSums {

    //This class checks the dice roll sums

    public boolean checkSumForSmall(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (!((dicesValues[0] == dicesValues[1]) && (dicesValues[1] == dicesValues[2]) && (dicesValues[0] == dicesValues[2]))) {
            if ((diceSum >= 4) && (diceSum <= 10)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkSumForBig(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (!((dicesValues[0] == dicesValues[1]) && (dicesValues[1] == dicesValues[2]) && (dicesValues[0] == dicesValues[2]))) {
            if ((diceSum >= 11) && (diceSum <= 17)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkSum(int[] dicesValues, int specificSum) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == specificSum) {
            return true;
        }
        return false;
    }


}

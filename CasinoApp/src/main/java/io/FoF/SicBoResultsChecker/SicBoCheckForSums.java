package io.FoF.SicBoResultsChecker;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForSums {

    /**
     * This class checks the dice roll and returns true for dice sum (4 - 10)
     * @param dicesValues
     * @return
     */
    public boolean checkSumForSmall(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (!((dicesValues[0] == dicesValues[1]) && (dicesValues[1] == dicesValues[2]) && (dicesValues[0] == dicesValues[2]))) {
            if ((diceSum >= 4) && (diceSum <= 10)) {
                return true;
            }
        }
        return false;
    }
    /**
     * This class checks the dice roll and returns true for dice sum (11 - 17)
     * @param dicesValues
     * @return
     */
    public boolean checkSumForBig(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (!((dicesValues[0] == dicesValues[1]) && (dicesValues[1] == dicesValues[2]) && (dicesValues[0] == dicesValues[2]))) {
            if ((diceSum >= 11) && (diceSum <= 17)) {
                return true;
            }
        }
        return false;
    }
    /**
     * This class checks the dice roll and returns true for a specific dice sum
     * @param dicesValues
     * @return
     */
    public boolean checkSum(int[] dicesValues, int specificSum) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == specificSum) {
            return true;
        }
        return false;
    }


}

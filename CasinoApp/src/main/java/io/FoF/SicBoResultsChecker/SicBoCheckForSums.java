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

    public boolean checkSumFor4(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == 4) {
            return true;
        }
        return false;
    }

    public boolean checkSumFor5(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == 5) {
            return true;
        }
        return false;
    }

    public boolean checkSumFor6(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == 6) {
            return true;
        }
        return false;
    }

    public boolean checkSumFor7(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == 7) {
            return true;
        }
        return false;
    }

    public boolean checkSumFor8(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == 8) {
            return true;
        }
        return false;
    }

    public boolean checkSumFor9(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == 9) {
            return true;
        }
        return false;
    }

    public boolean checkSumFor10(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == 10) {
            return true;
        }
        return false;
    }

    public boolean checkSumFor11(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == 11) {
            return true;
        }
        return false;
    }

    public boolean checkSumFor12(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == 12) {
            return true;
        }
        return false;
    }

    public boolean checkSumFor13(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == 13) {
            return true;
        }
        return false;
    }

    public boolean checkSumFor14(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == 14) {
            return true;
        }
        return false;
    }

    public boolean checkSumFor15(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == 15) {
            return true;
        }
        return false;
    }

    public boolean checkSumFor16(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == 16) {
            return true;
        }
        return false;
    }

    public boolean checkSumFor17(int[] dicesValues) {
        int diceSum = dicesValues[0] + dicesValues[1] + dicesValues[2];
        if (diceSum == 17) {
            return true;
        }
        return false;
    }
}

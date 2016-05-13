package io.FoF.SicBoResultsChecker;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForDiceDoubles {

    //This class checks the dice roll doubles

    public boolean checkForDouble1s(int[] dicesValues) {
        int numberOf1s = 0;
        if (dicesValues[0] == 1) {
            numberOf1s++;
        }
        if (dicesValues[1] == 1) {
            numberOf1s++;
        }
        if (dicesValues[2] == 1) {
            numberOf1s++;
        }
        if (numberOf1s > 1) {
            return true;
        }
        return false;
    }

    public boolean checkForDouble2s(int[] dicesValues) {
        int numberOf2s = 0;
        if (dicesValues[0] == 2) {
            numberOf2s++;
        }
        if (dicesValues[1] == 2) {
            numberOf2s++;
        }
        if (dicesValues[2] == 2) {
            numberOf2s++;
        }
        if (numberOf2s > 1) {
            return true;
        }
        return false;
    }

    public boolean checkForDouble3s(int[] dicesValues) {
        int numberOf3s = 0;
        if (dicesValues[0] == 3) {
            numberOf3s++;
        }
        if (dicesValues[1] == 3) {
            numberOf3s++;
        }
        if (dicesValues[2] == 3) {
            numberOf3s++;
        }
        if (numberOf3s > 1) {
            return true;
        }
        return false;
    }

    public boolean checkForDouble4s(int[] dicesValues) {
        int numberOf4s = 0;
        if (dicesValues[0] == 4) {
            numberOf4s++;
        }
        if (dicesValues[1] == 4) {
            numberOf4s++;
        }
        if (dicesValues[2] == 4) {
            numberOf4s++;
        }
        if (numberOf4s > 1) {
            return true;
        }
        return false;
    }

    public boolean checkForDouble5s(int[] dicesValues) {
        int numberOf5s = 0;
        if (dicesValues[0] == 5) {
            numberOf5s++;
        }
        if (dicesValues[1] == 5) {
            numberOf5s++;
        }
        if (dicesValues[2] == 5) {
            numberOf5s++;
        }
        if (numberOf5s > 1) {
            return true;
        }
        return false;
    }

    public boolean checkForDouble6s(int[] dicesValues) {
        int numberOf6s = 0;
        if (dicesValues[0] == 6) {
            numberOf6s++;
        }
        if (dicesValues[1] == 6) {
            numberOf6s++;
        }
        if (dicesValues[2] == 6) {
            numberOf6s++;
        }
        if (numberOf6s > 1) {
            return true;
        }
        return false;
    }

}

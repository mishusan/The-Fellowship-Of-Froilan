package io.FoF.SicBoResultsChecker;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForSpecific2Die {

    public boolean checkForA1and2(int[] dicesValues){
        boolean roll1 = false;
        boolean roll2 = false;
        if((dicesValues[0] == 1) || (dicesValues[1] == 1) || (dicesValues[2] == 1)){
            roll1 = true;
        }
        if((dicesValues[0] == 2) || (dicesValues[1] == 2) || (dicesValues[2] == 2)){
            roll2 = true;
        }
        if((roll1) && (roll2)){
            return true;
        }
        return false;
    }
    public boolean checkForA1and3(int[] dicesValues){
        boolean roll1 = false;
        boolean roll3 = false;
        if((dicesValues[0] == 1) || (dicesValues[1] == 1) || (dicesValues[2] == 1)){
            roll1 = true;
        }
        if((dicesValues[0] == 3) || (dicesValues[1] == 3) || (dicesValues[2] == 3)){
            roll3 = true;
        }
        if((roll1) && (roll3)){
            return true;
        }
        return false;
    }
    public boolean checkForA1and4(int[] dicesValues){
        boolean roll1 = false;
        boolean roll4 = false;
        if((dicesValues[0] == 1) || (dicesValues[1] == 1) || (dicesValues[2] == 1)){
            roll1 = true;
        }
        if((dicesValues[0] == 4) || (dicesValues[1] == 4) || (dicesValues[2] == 4)){
            roll4 = true;
        }
        if((roll1) && (roll4)){
            return true;
        }
        return false;
    }
    public boolean checkForA1and5(int[] dicesValues){
        boolean roll1 = false;
        boolean roll5 = false;
        if((dicesValues[0] == 1) || (dicesValues[1] == 1) || (dicesValues[2] == 1)){
            roll1 = true;
        }
        if((dicesValues[0] == 5) || (dicesValues[1] == 5) || (dicesValues[2] == 5)){
            roll5 = true;
        }
        if((roll1) && (roll5)){
            return true;
        }
        return false;
    }
    public boolean checkForA1and6(int[] dicesValues){
        boolean roll1 = false;
        boolean roll6 = false;
        if((dicesValues[0] == 1) || (dicesValues[1] == 1) || (dicesValues[2] == 1)){
            roll1 = true;
        }
        if((dicesValues[0] == 6) || (dicesValues[1] == 6) || (dicesValues[2] == 6)){
            roll6 = true;
        }
        if((roll1) && (roll6)){
            return true;
        }
        return false;
    }
    public boolean checkForA2and3(int[] dicesValues){
        boolean roll2 = false;
        boolean roll3 = false;
        if((dicesValues[0] == 2) || (dicesValues[1] == 2) || (dicesValues[2] == 2)){
            roll2 = true;
        }
        if((dicesValues[0] == 3) || (dicesValues[1] == 3) || (dicesValues[2] == 3)){
            roll3 = true;
        }
        if((roll2) && (roll3)){
            return true;
        }
        return false;
    }
    public boolean checkForA2and4(int[] dicesValues){
        boolean roll2 = false;
        boolean roll4 = false;
        if((dicesValues[0] == 2) || (dicesValues[1] == 2) || (dicesValues[2] == 2)){
            roll2 = true;
        }
        if((dicesValues[0] == 4) || (dicesValues[1] == 4) || (dicesValues[2] == 4)){
            roll4 = true;
        }
        if((roll2) && (roll4)){
            return true;
        }
        return false;
    }
    public boolean checkForA2and5(int[] dicesValues){
        boolean roll2 = false;
        boolean roll5 = false;
        if((dicesValues[0] == 2) || (dicesValues[1] == 2) || (dicesValues[2] == 2)){
            roll2 = true;
        }
        if((dicesValues[0] == 5) || (dicesValues[1] == 5) || (dicesValues[2] == 5)){
            roll5 = true;
        }
        if((roll2) && (roll5)){
            return true;
        }
        return false;
    }
    public boolean checkForA2and6(int[] dicesValues){
        boolean roll2 = false;
        boolean roll6 = false;
        if((dicesValues[0] == 2) || (dicesValues[1] == 2) || (dicesValues[2] == 2)){
            roll2 = true;
        }
        if((dicesValues[0] == 6) || (dicesValues[1] == 6) || (dicesValues[2] == 6)){
            roll6 = true;
        }
        if((roll2) && (roll6)){
            return true;
        }
        return false;
    }
    public boolean checkForA3and4(int[] dicesValues){
        boolean roll3 = false;
        boolean roll4 = false;
        if((dicesValues[0] == 3) || (dicesValues[1] == 3) || (dicesValues[2] == 3)){
            roll3 = true;
        }
        if((dicesValues[0] == 4) || (dicesValues[1] == 4) || (dicesValues[2] == 4)){
            roll4 = true;
        }
        if((roll3) && (roll4)){
            return true;
        }
        return false;
    }
    public boolean checkForA3and5(int[] dicesValues){
        boolean roll3 = false;
        boolean roll5 = false;
        if((dicesValues[0] == 3) || (dicesValues[1] == 3) || (dicesValues[2] == 3)){
            roll3 = true;
        }
        if((dicesValues[0] == 5) || (dicesValues[1] == 5) || (dicesValues[2] == 5)){
            roll5 = true;
        }
        if((roll3) && (roll5)){
            return true;
        }
        return false;
    }
    public boolean checkForA3and6(int[] dicesValues){
        boolean roll3 = false;
        boolean roll6 = false;
        if((dicesValues[0] == 3) || (dicesValues[1] == 3) || (dicesValues[2] == 3)){
            roll3 = true;
        }
        if((dicesValues[0] == 6) || (dicesValues[1] == 6) || (dicesValues[2] == 6)){
            roll6 = true;
        }
        if((roll3) && (roll6)){
            return true;
        }
        return false;
    }
    public boolean checkForA4and5(int[] dicesValues){
        boolean roll4 = false;
        boolean roll5 = false;
        if((dicesValues[0] == 4) || (dicesValues[1] == 4) || (dicesValues[2] == 4)){
            roll4 = true;
        }
        if((dicesValues[0] == 5) || (dicesValues[1] == 5) || (dicesValues[2] == 5)){
            roll5 = true;
        }
        if((roll4) && (roll5)){
            return true;
        }
        return false;
    }
    public boolean checkForA4and6(int[] dicesValues){
        boolean roll4 = false;
        boolean roll6 = false;
        if((dicesValues[0] == 4) || (dicesValues[1] == 4) || (dicesValues[2] == 4)){
            roll4 = true;
        }
        if((dicesValues[0] == 6) || (dicesValues[1] == 6) || (dicesValues[2] == 6)){
            roll6 = true;
        }
        if((roll4) && (roll6)){
            return true;
        }
        return false;
    }
    public boolean checkForA5and6(int[] dicesValues){
        boolean roll5 = false;
        boolean roll6 = false;
        if((dicesValues[0] == 5) || (dicesValues[1] == 5) || (dicesValues[2] == 5)){
            roll5 = true;
        }
        if((dicesValues[0] == 6) || (dicesValues[1] == 6) || (dicesValues[2] == 6)){
            roll6 = true;
        }
        if((roll5) && (roll6)){
            return true;
        }
        return false;
    }
}

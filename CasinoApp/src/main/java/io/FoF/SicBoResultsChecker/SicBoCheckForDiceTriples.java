package io.FoF.SicBoResultsChecker;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForDiceTriples {

    //This class checks the dice roll triples

    public boolean checkForAnyTriple(int[] dicesValues){
        if(((dicesValues[0] == dicesValues[1]) && (dicesValues[1] == dicesValues[2]) && (dicesValues[0] == dicesValues[2]))){
            return true;
        }
        return false;
    }
    public boolean checkForAnyTriple1s(int[] dicesValues){
        if(((dicesValues[0] == dicesValues[1]) && (dicesValues[1] == dicesValues[2]) && (dicesValues[0] == dicesValues[2]))){
            if(dicesValues[0] == 1){
                return true;
            }
        }
        return false;
    }
    public boolean checkForAnyTriple2s(int[] dicesValues){
        if(((dicesValues[0] == dicesValues[1]) && (dicesValues[1] == dicesValues[2]) && (dicesValues[0] == dicesValues[2]))){
            if(dicesValues[0] == 2){
                return true;
            }
        }
        return false;
    }
    public boolean checkForAnyTriple3s(int[] dicesValues){
        if(((dicesValues[0] == dicesValues[1]) && (dicesValues[1] == dicesValues[2]) && (dicesValues[0] == dicesValues[2]))){
            if(dicesValues[0] == 3){
                return true;
            }
        }
        return false;
    }
    public boolean checkForAnyTriple4s(int[] dicesValues){
        if(((dicesValues[0] == dicesValues[1]) && (dicesValues[1] == dicesValues[2]) && (dicesValues[0] == dicesValues[2]))){
            if(dicesValues[0] == 4){
                return true;
            }
        }
        return false;
    }
    public boolean checkForAnyTriple5s(int[] dicesValues){
        if(((dicesValues[0] == dicesValues[1]) && (dicesValues[1] == dicesValues[2]) && (dicesValues[0] == dicesValues[2]))){
            if(dicesValues[0] == 5){
                return true;
            }
        }
        return false;
    }
    public boolean checkForAnyTriple6s(int[] dicesValues){
        if(((dicesValues[0] == dicesValues[1]) && (dicesValues[1] == dicesValues[2]) && (dicesValues[0] == dicesValues[2]))){
            if(dicesValues[0] == 6){
                return true;
            }
        }
        return false;
    }

}

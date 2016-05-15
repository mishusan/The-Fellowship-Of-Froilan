package io.FoF;

/**
 * Created by minlee on 5/15/16.
 */
public class RouletteResultsChecker {

    public boolean checkSpecificNumber(RouletteWheel rouletteWheel, int specificValue) {
        if(rouletteWheel.rouletteValue() == specificValue){
            return true;
        }
        return false;
    }
}

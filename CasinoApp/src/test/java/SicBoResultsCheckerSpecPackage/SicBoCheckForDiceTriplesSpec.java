package io.FoF.SicBoResultsCheckerSpecPackage;

import io.FoF.SicBoResultsChecker.SicBoCheckForDiceTriples;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForDiceTriplesSpec {

    SicBoCheckForDiceTriples sicBoCheckForDiceTriples;
    int[] dices = new int[3];

    @Before
    public void initialize(){
        sicBoCheckForDiceTriples = new SicBoCheckForDiceTriples();
    }
    @Test
    public void checkForAnyTripleTest(){
        dices[0] = 1;
        dices[1] = 1;
        dices[2] = 1;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceTriples.checkForAnyTriple(dices);
        Assert.assertEquals(expectedResult,actualResult);
        dices[0] = 2;
        expectedResult = false;
        actualResult = sicBoCheckForDiceTriples.checkForAnyTriple(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForAnySpecificTriplesTest(){
        dices[0] = 1;
        dices[1] = 1;
        dices[2] = 1;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceTriples.checkForAnyTriple(dices , 1);
        Assert.assertEquals(expectedResult,actualResult);
        dices[0] = 2;
        dices[1] = 2;
        dices[2] = 2;
        expectedResult = false;
        actualResult = sicBoCheckForDiceTriples.checkForAnyTriple(dices, 1);
        Assert.assertEquals(expectedResult,actualResult);
    }
   
}

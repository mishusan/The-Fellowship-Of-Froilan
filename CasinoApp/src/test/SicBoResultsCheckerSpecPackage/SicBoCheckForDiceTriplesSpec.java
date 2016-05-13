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
    public void checkForAnyTriple1sTest(){
        dices[0] = 1;
        dices[1] = 1;
        dices[2] = 1;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceTriples.checkForAnyTriple1s(dices);
        Assert.assertEquals(expectedResult,actualResult);
        dices[0] = 2;
        dices[1] = 2;
        dices[2] = 2;
        expectedResult = false;
        actualResult = sicBoCheckForDiceTriples.checkForAnyTriple1s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForAnyTriple2sTest(){
        dices[0] = 2;
        dices[1] = 2;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceTriples.checkForAnyTriple2s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForAnyTriple3sTest(){
        dices[0] = 3;
        dices[1] = 3;
        dices[2] = 3;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceTriples.checkForAnyTriple3s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForAnyTriple4sTest(){
        dices[0] = 4;
        dices[1] = 4;
        dices[2] = 4;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceTriples.checkForAnyTriple4s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForAnyTriple5sTest(){
        dices[0] = 5;
        dices[1] = 5;
        dices[2] = 5;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceTriples.checkForAnyTriple5s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForAnyTriple6sTest(){
        dices[0] = 6;
        dices[1] = 6;
        dices[2] = 6;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceTriples.checkForAnyTriple6s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
}

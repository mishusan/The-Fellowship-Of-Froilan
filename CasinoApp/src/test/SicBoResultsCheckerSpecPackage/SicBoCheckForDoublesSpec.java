package io.FoF.SicBoResultsCheckerSpecPackage;

import io.FoF.SicBoResultsChecker.SicBoCheckForDiceDoubles;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForDoublesSpec {

    SicBoCheckForDiceDoubles sicBoCheckForDiceDoubles;
    int[] dices = new int[3];

    @Before
    public void initialize(){
        sicBoCheckForDiceDoubles = new SicBoCheckForDiceDoubles();
    }
    @Test
    public void checkForDouble1sTest(){
        dices[0] = 1;
        dices[1] = 1;
        dices[2] = 1;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceDoubles.checkForDouble1s(dices);
        Assert.assertEquals(expectedResult,actualResult);
        dices[0] = 2;
        expectedResult = true;
        actualResult = sicBoCheckForDiceDoubles.checkForDouble1s(dices);
        Assert.assertEquals(expectedResult,actualResult);
        dices[1] = 2;
        expectedResult = false;
        actualResult = sicBoCheckForDiceDoubles.checkForDouble1s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForDouble2sTest(){
        dices[0] = 1;
        dices[1] = 2;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceDoubles.checkForDouble2s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForDouble3sTest(){
        dices[0] = 4;
        dices[1] = 3;
        dices[2] = 3;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceDoubles.checkForDouble3s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForDouble4sTest(){
        dices[0] = 4;
        dices[1] = 4;
        dices[2] = 3;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceDoubles.checkForDouble4s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForDouble5sTest(){
        dices[0] = 4;
        dices[1] = 5;
        dices[2] = 5;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceDoubles.checkForDouble5s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForDouble6sTest(){
        dices[0] = 6;
        dices[1] = 6;
        dices[2] = 5;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceDoubles.checkForDouble6s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }

}

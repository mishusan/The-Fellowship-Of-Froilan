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
        boolean actualResult = sicBoCheckForDiceDoubles.checkForDoubles(dices,1);
        Assert.assertEquals(expectedResult,actualResult);
        dices[0] = 2;
        expectedResult = true;
        actualResult = sicBoCheckForDiceDoubles.checkForDoubles(dices,1);
        Assert.assertEquals(expectedResult,actualResult);
        dices[1] = 2;
        expectedResult = false;
        actualResult = sicBoCheckForDiceDoubles.checkForDoubles(dices,1);
        Assert.assertEquals(expectedResult,actualResult);
    }

}

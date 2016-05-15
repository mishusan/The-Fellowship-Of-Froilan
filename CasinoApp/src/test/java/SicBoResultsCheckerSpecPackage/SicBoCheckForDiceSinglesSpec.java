package io.FoF.SicBoResultsCheckerSpecPackage;

import io.FoF.SicBoResultsChecker.SicBoCheckForDiceSingles;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForDiceSinglesSpec {

    SicBoCheckForDiceSingles sicBoCheckForDiceSingles;
    int[] dices = new int[3];

    @Before
    public void initialize(){
        sicBoCheckForDiceSingles = new SicBoCheckForDiceSingles();
    }
    @Test
    public void checkForSinglesTest(){
        dices[0] = 1;
        dices[1] = 1;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceSingles.checkForSingles(dices,1);
        Assert.assertEquals(expectedResult,actualResult);
        dices[0] = 1;
        dices[1] = 2;
        dices[2] = 2;
        expectedResult = true;
        actualResult = sicBoCheckForDiceSingles.checkForSingles(dices,1);
        Assert.assertEquals(expectedResult,actualResult);
        dices[0] = 2;
        dices[1] = 2;
        dices[2] = 2;
        expectedResult = false;
        actualResult = sicBoCheckForDiceSingles.checkForSingles(dices,1);
        Assert.assertEquals(expectedResult,actualResult);
    }
}

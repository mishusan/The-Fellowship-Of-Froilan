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
    public void checkForSingle1sTest(){
        dices[0] = 1;
        dices[1] = 2;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceSingles.checkForSingle1s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForSingle2sTest(){
        dices[0] = 1;
        dices[1] = 3;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceSingles.checkForSingle2s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForSingle3sTest(){
        dices[0] = 1;
        dices[1] = 3;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceSingles.checkForSingle3s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForSingle4sTest(){
        dices[0] = 1;
        dices[1] = 4;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceSingles.checkForSingle4s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForSingle5sTest(){
        dices[0] = 1;
        dices[1] = 5;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceSingles.checkForSingle5s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForSingle6sTest(){
        dices[0] = 6;
        dices[1] = 2;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForDiceSingles.checkForSingle6s(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
}

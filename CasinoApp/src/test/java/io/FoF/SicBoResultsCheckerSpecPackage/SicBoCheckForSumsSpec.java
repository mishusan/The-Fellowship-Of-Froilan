package io.FoF.SicBoResultsCheckerSpecPackage;

import io.FoF.SicBoResultsChecker.SicBoCheckForSums;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForSumsSpec {

    SicBoCheckForSums sicBoCheckForSums;
    int[] dices = new int[3];

    @Before
    public void initialize(){
        sicBoCheckForSums = new SicBoCheckForSums();
    }

    @Test
    public void checkSumForSmallTest(){
        dices[0] = 1;
        dices[1] = 1;
        dices[2] = 1;
        boolean expectedResult = false;
        boolean actualResult = sicBoCheckForSums.checkSumForSmall(dices);
        Assert.assertEquals(expectedResult,actualResult);
        dices[0] = 2;
        expectedResult = true;
        actualResult = sicBoCheckForSums.checkSumForSmall(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumForBigTest(){
        dices[0] = 5;
        dices[1] = 5;
        dices[2] = 5;
        boolean expectedResult = false;
        boolean actualResult = sicBoCheckForSums.checkSumForBig(dices);
        Assert.assertEquals(expectedResult,actualResult);
        dices[0] = 2;
        expectedResult = true;
        actualResult = sicBoCheckForSums.checkSumForBig(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumFor4Test(){
        dices[0] = 1;
        dices[1] = 2;
        dices[2] = 1;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSums.checkSumFor4(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumFor5Test(){
        dices[0] = 1;
        dices[1] = 3;
        dices[2] = 1;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSums.checkSumFor5(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumFor6Test(){
        dices[0] = 1;
        dices[1] = 4;
        dices[2] = 1;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSums.checkSumFor6(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumFor7Test(){
        dices[0] = 1;
        dices[1] = 5;
        dices[2] = 1;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSums.checkSumFor7(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumFor8Test(){
        dices[0] = 1;
        dices[1] = 6;
        dices[2] = 1;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSums.checkSumFor8(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumFor9Test(){
        dices[0] = 2;
        dices[1] = 6;
        dices[2] = 1;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSums.checkSumFor9(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumFor10Test(){
        dices[0] = 3;
        dices[1] = 6;
        dices[2] = 1;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSums.checkSumFor10(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumFor11Test(){
        dices[0] = 4;
        dices[1] = 6;
        dices[2] = 1;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSums.checkSumFor11(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumFor12Test(){
        dices[0] = 5;
        dices[1] = 6;
        dices[2] = 1;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSums.checkSumFor12(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumFor13Test(){
        dices[0] = 5;
        dices[1] = 6;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSums.checkSumFor13(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumFor14Test(){
        dices[0] = 5;
        dices[1] = 6;
        dices[2] = 3;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSums.checkSumFor14(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumFor15Test(){
        dices[0] = 5;
        dices[1] = 6;
        dices[2] = 4;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSums.checkSumFor15(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumFor16Test(){
        dices[0] = 5;
        dices[1] = 6;
        dices[2] = 5;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSums.checkSumFor16(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkSumFor17Test(){
        dices[0] = 6;
        dices[1] = 6;
        dices[2] = 5;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSums.checkSumFor17(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
}

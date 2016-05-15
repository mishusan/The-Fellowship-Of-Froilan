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
        Assert.assertFalse(sicBoCheckForSums.checkSumForSmall(dices));
        dices[0] = 2;
        Assert.assertTrue(sicBoCheckForSums.checkSumForSmall(dices));
    }
    @Test
    public void checkSumForBigTest(){
        dices[0] = 5;
        dices[1] = 5;
        dices[2] = 5;
        Assert.assertFalse(sicBoCheckForSums.checkSumForBig(dices));
        dices[0] = 2;
        Assert.assertTrue(sicBoCheckForSums.checkSumForBig(dices));
    }
    @Test
    public void checkSumTest(){
        dices[0] = 1;
        dices[1] = 2;
        dices[2] = 1;
        Assert.assertTrue(sicBoCheckForSums.checkSum(dices, 4));
    }
}

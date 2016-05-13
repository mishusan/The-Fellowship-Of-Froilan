package io.FoF.SicBoResultsCheckerSpecPackage;

import io.FoF.SicBoResultsChecker.SicBoCheckForSpecific2Die;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoCheckForSpecific2DieSpec {

    SicBoCheckForSpecific2Die sicBoCheckForSpecific2Die;
    int[] dices = new int[3];

    @Before
    public void initialize(){
        sicBoCheckForSpecific2Die = new SicBoCheckForSpecific2Die();
    }
    @Test
    public void checkForA1and2Test(){
        dices[0] = 1;
        dices[1] = 2;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA1and2(dices);
        Assert.assertEquals(expectedResult,actualResult);
        dices[0] = 2;
        dices[1] = 1;
        dices[2] = 2;
        expectedResult = true;
        actualResult = sicBoCheckForSpecific2Die.checkForA1and2(dices);
        Assert.assertEquals(expectedResult,actualResult);
        dices[0] = 1;
        dices[1] = 1;
        dices[2] = 1;
        expectedResult = false;
        actualResult = sicBoCheckForSpecific2Die.checkForA1and2(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForA1and3Test(){
        dices[0] = 3;
        dices[1] = 1;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA1and3(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForA1and4Test(){
        dices[0] = 4;
        dices[1] = 1;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA1and4(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForA1and5Test(){
        dices[0] = 5;
        dices[1] = 1;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA1and5(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForA1and6Test(){
        dices[0] = 6;
        dices[1] = 1;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA1and6(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForA2and3Test(){
        dices[0] = 3;
        dices[1] = 1;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA2and3(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForA2and4Test(){
        dices[0] = 4;
        dices[1] = 1;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA2and4(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForA2and5Test(){
        dices[0] = 5;
        dices[1] = 1;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA2and5(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForA2and6Test(){
        dices[0] = 3;
        dices[1] = 6;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA2and6(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForA3and4Test(){
        dices[0] = 3;
        dices[1] = 4;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA3and4(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForA3and5Test(){
        dices[0] = 3;
        dices[1] = 5;
        dices[2] = 2;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA3and5(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForA3and6Test(){
        dices[0] = 3;
        dices[1] = 4;
        dices[2] = 6;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA3and6(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForA4and5Test(){
        dices[0] = 5;
        dices[1] = 4;
        dices[2] = 6;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA4and5(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForA4and6Test(){
        dices[0] = 3;
        dices[1] = 4;
        dices[2] = 6;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA4and6(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForA5and6Test(){
        dices[0] = 5;
        dices[1] = 4;
        dices[2] = 6;
        boolean expectedResult = true;
        boolean actualResult = sicBoCheckForSpecific2Die.checkForA5and6(dices);
        Assert.assertEquals(expectedResult,actualResult);
    }













}

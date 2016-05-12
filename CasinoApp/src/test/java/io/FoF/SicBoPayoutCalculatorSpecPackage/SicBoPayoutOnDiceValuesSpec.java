package io.FoF.SicBoPayoutCalculatorSpecPackage;

import io.FoF.SicBoPayoutCalculatorPackage.SicBoPayoutOnDiceValuesCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoPayoutOnDiceValuesSpec {

    SicBoPayoutOnDiceValuesCalculator sicBoPayoutOnDiceValuesCalculator;
    @Before
    public void initialize(){
        sicBoPayoutOnDiceValuesCalculator = new SicBoPayoutOnDiceValuesCalculator();
    }

    @Test
    public void calculateAnyTripleWinningsTest(){
        int bet = 10;
        int expectedValue = 310;
        int actualValue = sicBoPayoutOnDiceValuesCalculator.calculateAnyTripleWinnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void calculateSpecificTripleWinningsTest(){
        int bet = 10;
        int expectedValue = 1810;
        int actualValue = sicBoPayoutOnDiceValuesCalculator.calculateSpecificTripleWinnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void calculateSpecificDoubleWinningsTest(){
        int bet = 10;
        int expectedValue = 120;
        int actualValue = sicBoPayoutOnDiceValuesCalculator.calculateSpecificDoubleWinnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void calculateAnySingleDieWinning(){
        int bet = 10;
        int numOfOccurrences = 1;
        int expectedValue = 20;
        int actualValue = sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(bet,numOfOccurrences);
        Assert.assertEquals(expectedValue,actualValue);
        numOfOccurrences = 2;
        expectedValue = 30;
        actualValue = sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(bet,numOfOccurrences);
        Assert.assertEquals(expectedValue,actualValue);
        numOfOccurrences = 3;
        expectedValue = 40;
        actualValue = sicBoPayoutOnDiceValuesCalculator.calculateAnySingleDieWinning(bet,numOfOccurrences);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void calculateAnySpecific2DiceRoll(){
        int bet = 10;
        int expectedValue = 70;
        int actualValue = sicBoPayoutOnDiceValuesCalculator.calculateAnySpecific2DiceRoll(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }

}

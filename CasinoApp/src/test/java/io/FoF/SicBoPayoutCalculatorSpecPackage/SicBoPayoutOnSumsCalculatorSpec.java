package io.FoF.SicBoPayoutCalculatorSpecPackage;

import io.FoF.SicBoPayoutCalculatorPackage.SicBoPayoutOnSumsCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by minlee on 5/12/16.
 */
public class SicBoPayoutOnSumsCalculatorSpec{

    SicBoPayoutOnSumsCalculator sicBoPayoutOnSumsCalculator;
    @Before
    public void initialize(){
        sicBoPayoutOnSumsCalculator = new SicBoPayoutOnSumsCalculator();
    }

    @Test
    public void calculateBigWinningsTest(){
        int bigBet = 10;
        int expectedValue = 20;
        int actualValue = sicBoPayoutOnSumsCalculator.calculateBigWinnings(bigBet);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void calculateSmallWinningsTest(){
        int smallBet = 10;
        int expectedValue = 20;
        int actualValue = sicBoPayoutOnSumsCalculator.calculateSmallWinnings(smallBet);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void calculateSumOf4and17WinningsTest(){
        int bet = 1;
        int expectedValue = 61;
        int actualValue = sicBoPayoutOnSumsCalculator.calculateSumOf4and17Winnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void calculateSumOf5and16WinningsTest(){
        int bet = 1;
        int expectedValue = 21;
        int actualValue = sicBoPayoutOnSumsCalculator.calculateSumOf5and16Winnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void calculateSumOf6and15WinningsTest(){
        int bet = 1;
        int expectedValue = 19;
        int actualValue = sicBoPayoutOnSumsCalculator.calculateSumOf6and15Winnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void calculateSumOf7and14WinningsTest(){
        int bet = 1;
        int expectedValue = 13;
        int actualValue = sicBoPayoutOnSumsCalculator.calculateSumOf7and14Winnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }@Test
    public void calculateSumOf8and13WinningsTest(){
        int bet = 1;
        int expectedValue = 9;
        int actualValue = sicBoPayoutOnSumsCalculator.calculateSumOf8and13Winnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }@Test
    public void calculateSumOf9and10and11and12WinningsTest(){
        int bet = 1;
        int expectedValue = 7;
        int actualValue = sicBoPayoutOnSumsCalculator.calculateSumOf9and10and11and12Winnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }
}

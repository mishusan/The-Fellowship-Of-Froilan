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
    public void checkForSpecific2DieTest(){
        dices[0] = 1;
        dices[1] = 2;
        dices[2] = 2;
        Assert.assertTrue(sicBoCheckForSpecific2Die.check2Die(dices, 1 , 2));
    }

}

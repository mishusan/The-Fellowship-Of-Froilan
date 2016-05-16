import io.FoF.RoulettePayoutCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by minlee on 5/15/16.
 */
public class RoulettePayoutCalculatorTest {

    RoulettePayoutCalculator roulettePayoutCalculator;
    int bet;

    @Before
    public void initialize(){
        roulettePayoutCalculator = new RoulettePayoutCalculator();
        bet = 1;
    }
    @Test
    public void calculateSpecificNumberWinningsTest(){
        int expectedValue = 36;
        int actualValue = roulettePayoutCalculator.calculateSpecificNumberWinnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void calculateColorWinningsTest(){
        int expectedValue = 2;
        int actualValue = roulettePayoutCalculator.calculateColorWinnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void calculateHighLowWinningsTest(){
        int expectedValue = 2;
        int actualValue = roulettePayoutCalculator.calculateHighLowWinnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void calculateEvenOddWinningsTest(){
        int expectedValue = 2;
        int actualValue = roulettePayoutCalculator.calculateEvenOddWinnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void calculateRowWinningsTest(){
        int expectedValue = 3;
        int actualValue = roulettePayoutCalculator.calculateRowWinnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void calculateColumnWinningsTest(){
        int expectedValue = 12;
        int actualValue = roulettePayoutCalculator.calculateColumnWinnings(bet);
        Assert.assertEquals(expectedValue,actualValue);
    }

}

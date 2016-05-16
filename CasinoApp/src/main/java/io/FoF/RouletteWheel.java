package io.FoF;

import java.util.Random;

/**
 * Created by minlee on 5/14/16.
 */
public class RouletteWheel {

    private int rouletteValue;
    RouletteColor rouletteColor;

    /**
     * This enum if just a list of color options of the roulette wheel
     */
    public enum RouletteColor{
        RED,BLACK
    }


    private String diceASCII;


    /**
     * Creates a new instance of roulette wheels and spins for a result
     */
    public RouletteWheel() {
        roll();
    }

    public int rouletteValue() {
        return rouletteValue;
    }
    public RouletteColor rouletteColor() {
        return rouletteColor;
    }

    /**
     * Creates the result of the wheel and assign correct color
     */
    public void roll() {
        Random random = new Random();
        rouletteValue = random.nextInt(38) ;

        if((rouletteValue == 1) ||
                (rouletteValue == 3) ||
                (rouletteValue == 5) ||
                (rouletteValue == 9) ||
                (rouletteValue == 12) ||
                (rouletteValue == 14) ||
                (rouletteValue == 16) ||
                (rouletteValue == 18) ||
                (rouletteValue == 19) ||
                (rouletteValue == 21) ||
                (rouletteValue == 23) ||
                (rouletteValue == 25) ||
                (rouletteValue == 27) ||
                (rouletteValue == 30) ||
                (rouletteValue == 32) ||
                (rouletteValue == 34) ||
                (rouletteValue == 36)){
            rouletteColor = RouletteColor.RED;
        }
        else{
            rouletteColor = RouletteColor.RED;
        }
    }

}

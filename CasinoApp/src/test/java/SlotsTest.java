package io.FoF;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by matthewb on 5/11/16.
 */
public class SlotsTest {

    private Slots slot;
    private Player player;
    @Before public void initialize(){
        slot = new Slots();
        player = new Player();
    }

    @Test
    public void stopGameTest(){
        Boolean actualValue = slot.stopGame("yes");
        assertTrue("stop Game should return false if input is yes",actualValue);
    }

    @Test
    public void shuffleTumblerTest(){

        Tumbler tum1 = new Tumbler();
        Tumbler tum2 = new Tumbler();
        Tumbler tum3 = new Tumbler();

        slot.allTumblers.add(tum1);
        slot.allTumblers.add(tum2);
        slot.allTumblers.add(tum3);

        slot.shuffle();

        int actualValue1 = slot.allTumblers.get(0).tumbler1;
        int actualValue2 = slot.allTumblers.get(0).tumbler2;
        int actualValue3 = slot.allTumblers.get(0).tumbler3;
        int actualValue4 = slot.allTumblers.get(0).tumbler4;
        int actualValue5 = slot.allTumblers.get(0).tumbler5;

        int actualValue6 = slot.allTumblers.get(1).tumbler1;
        int actualValue7 = slot.allTumblers.get(1).tumbler2;
        int actualValue8 = slot.allTumblers.get(1).tumbler3;
        int actualValue9 = slot.allTumblers.get(1).tumbler4;
        int actualValue10 = slot.allTumblers.get(1).tumbler5;

        int actualValue11 = slot.allTumblers.get(2).tumbler1;
        int actualValue12 = slot.allTumblers.get(2).tumbler2;
        int actualValue13 = slot.allTumblers.get(2).tumbler3;
        int actualValue14 = slot.allTumblers.get(2).tumbler4;
        int actualValue15 = slot.allTumblers.get(2).tumbler5;

        int expectedValue1 = 4;
        int expectedValue2 = 0;




        assertTrue("Tumbler random number between 0-3",actualValue1 < expectedValue1);
        assertTrue("Tumbler random number between 0-3",actualValue2 < expectedValue1);
        assertTrue("Tumbler random number between 0-3",actualValue3 < expectedValue1);
        assertTrue("Tumbler random number between 0-3",actualValue4 < expectedValue1);
        assertTrue("Tumbler random number between 0-3",actualValue5 < expectedValue1);

        assertTrue("Tumbler random number between 0-3",actualValue1 >= expectedValue2);
        assertTrue("Tumbler random number between 0-3",actualValue2 >= expectedValue2);
        assertTrue("Tumbler random number between 0-3",actualValue3 >= expectedValue2);
        assertTrue("Tumbler random number between 0-3",actualValue4 >= expectedValue2);
        assertTrue("Tumbler random number between 0-3",actualValue5 >= expectedValue2);

        assertTrue("Tumbler random number between 0-3",actualValue6 < expectedValue1);
        assertTrue("Tumbler random number between 0-3",actualValue7 < expectedValue1);
        assertTrue("Tumbler random number between 0-3",actualValue8 < expectedValue1);
        assertTrue("Tumbler random number between 0-3",actualValue9 < expectedValue1);
        assertTrue("Tumbler random number between 0-3",actualValue10 < expectedValue1);

        assertTrue("Tumbler random number between 0-3",actualValue6 >= expectedValue2);
        assertTrue("Tumbler random number between 0-3",actualValue7 >= expectedValue2);
        assertTrue("Tumbler random number between 0-3",actualValue8 >= expectedValue2);
        assertTrue("Tumbler random number between 0-3",actualValue9 >= expectedValue2);
        assertTrue("Tumbler random number between 0-3",actualValue10 >= expectedValue2);

        assertTrue("Tumbler random number between 0-3",actualValue11 < expectedValue1);
        assertTrue("Tumbler random number between 0-3",actualValue12 < expectedValue1);
        assertTrue("Tumbler random number between 0-3",actualValue13 < expectedValue1);
        assertTrue("Tumbler random number between 0-3",actualValue14 < expectedValue1);
        assertTrue("Tumbler random number between 0-3",actualValue15 < expectedValue1);

        assertTrue("Tumbler random number between 0-3",actualValue11 >= expectedValue2);
        assertTrue("Tumbler random number between 0-3",actualValue12 >= expectedValue2);
        assertTrue("Tumbler random number between 0-3",actualValue13 >= expectedValue2);
        assertTrue("Tumbler random number between 0-3",actualValue14 >= expectedValue2);
        assertTrue("Tumbler random number between 0-3",actualValue15 >= expectedValue2);
    }

    @Test
    public void placeBetTest(){

        double beforeActualValue = slot.getPot();
        slot.placeBet(player,50.0);
        double afterActualValue = slot.getPot();
        double expectedValue = 50.0;

        assertEquals("place bet should raise pot by given amount",0,beforeActualValue,0.01);
        assertEquals("place bet should raise pot by given amount",expectedValue,afterActualValue,0.01);

    }

    @Test
    public void checkIfTumblerRowIsAllTheSameTest(){


        Tumbler tum1 = new Tumbler();
        Tumbler tum2 = new Tumbler();
        Tumbler tum3 = new Tumbler();

        slot.allTumblers.add(tum1);
        slot.allTumblers.add(tum2);
        slot.allTumblers.add(tum3);

        assertTrue("all rows are the same before shuffle",slot.checkIfTumblerRowIsAllTheSame(tum1));
        assertTrue("all rows are the same before shuffle",slot.checkIfTumblerRowIsAllTheSame(tum2));
        assertTrue("all rows are the same before shuffle",slot.checkIfTumblerRowIsAllTheSame(tum3));

    }

    @Test
    public void checkPaylineFour(){

        Tumbler tum1 = new Tumbler();
        Tumbler tum2 = new Tumbler();
        Tumbler tum3 = new Tumbler();

        tum1.setTumbler1(2);
        tum2.setTumbler2(2);
        tum3.setTumbler3(2);
        tum2.setTumbler4(2);
        tum1.setTumbler5(2);

        slot.allTumblers.add(tum1);
        slot.allTumblers.add(tum2);
        slot.allTumblers.add(tum3);

        assertTrue("all rows are the same before shuffle",slot.checkForPaylineFour(tum1,tum2,tum3));
    }

    @Test
    public void checkPaylineFive(){

        Tumbler tum1 = new Tumbler();
        Tumbler tum2 = new Tumbler();
        Tumbler tum3 = new Tumbler();

        tum3.setTumbler1(2);
        tum2.setTumbler2(2);
        tum1.setTumbler3(2);
        tum2.setTumbler4(2);
        tum3.setTumbler5(2);

        slot.allTumblers.add(tum1);
        slot.allTumblers.add(tum2);
        slot.allTumblers.add(tum3);

        assertTrue("all rows are the same before shuffle",slot.checkForPaylineFive(tum1,tum2,tum3));
    }


}

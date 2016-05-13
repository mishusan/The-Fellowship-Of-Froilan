package io.FoF;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by manjushadas on 5/11/16.
 */
public class PlayerTest {

    @Test
        public void getAgeTest(){
        Player player = new Player();
        int expectedAge =10;
        int actualAge = player.getAge();
        assertEquals("The expected value should be 10",expectedAge,actualAge);
    }

    @Test
        public void setAgeTest(){
        Player player = new Player();
        int expectedSetAge =20;
        player.setAge(25);
        int actualSetAge = player.getAge();
        assertEquals("The expected value should be 20",expectedSetAge,actualSetAge);
    }
    @Test
        public void getNameTest(){
        Player player = new Player();
        String expectedName ="Joy";
        String actualName = player.getName();
        assertEquals("The expected value should be Joy",expectedName,actualName);
    }

    @Test
        public void setNameTest(){
        Player player = new Player();
        String expectedSetName ="Boy";
        player.setName("Joy");
        String actualSetName = player.getName();
        assertEquals("The expected value should be Joy",expectedSetName,actualSetName);
    }
    @Test
        public void getPurseTest(){
        Player player = new Player();
        double expectedPurse =10.0;
        double actualPurse = player.getPurse();
        assertEquals("The expected value should be 10.0",expectedPurse,actualPurse,0);
    }

    @Test
        public void setPurseTest(){
        Player player = new Player();
        double expectedSetPurse =10.0;
        player.setPurse(11);
        double actualSetPurse = player.getPurse();
        assertEquals("The expected value should be 10.0",expectedSetPurse,actualSetPurse,0);
    }

    @Test
        public void removeMoneyTest(){
        Player player = new Player();
        double expectedDollar =11.0;
        player.removeMoneyFromPurse(10.0);
        double actualDollar = player.getPurse();
        assertEquals("The expected value should be 10.0",expectedDollar,actualDollar,0);
    }

    @Test
    public void addMoneyTest(){
        Player player = new Player();
        double expectedDollar =11.0;
        player.addMoneyToPurse(10.0);
        double actualDollar = player.getPurse();
        assertEquals("The expected value should be 10.0",expectedDollar,actualDollar,0);
    }

}

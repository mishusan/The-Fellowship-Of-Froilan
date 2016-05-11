package io.FoF;

<<<<<<< HEAD

public class Display {

    public static void main(String[] args) {
        Deck decker = new Deck();

        System.out.println(decker.dealNextCard().toString());
    }
=======
import org.omg.CORBA.Object;
import java.util.Scanner;
/**
 * Created by matthewb on 5/11/16.
 */
public class Display {
    /*Used to display common variables*/


    static void welcome(String name){
        System.out.println("Hello "+name+" and WELCOME to the FoF casino.\n We thank you for all your donations to the Fellowship.");
    }


    static void displayPurse(double purse){
        System.out.println("Your purse is : "+purse);
    }

    static void displayPot(double pot){
        System.out.println("The current pot is : "+pot);
    }

    static void displayBet(double bet){
        System.out.println("The bet is : "+bet);
    }

    /*Used to display the objects e.g Card ascii art or image(GUI)*/

    static void showCard(Object card){
        System.out.println(card.image);
    }

    static void showDie(Object die){
        System.out.println(die.face);
    }

    static void showTable(Object table){
        System.out.println(table.top);
    }

    static void showSlot(Object slot){
        System.out.println(slot.front);
    }

    /*Used to output any non variable Strings/Integers/Doubles*/
    static void showMessage(String message){
        System.out.println(message);
    }

    static void showMessage(int message){
        System.out.println(message);
    }

    static void showMessage(double message){
        System.out.println(message);
    }

    /*++++++++++++++++++++++++++++++++++++++++++++++++++INPUT FROM USER+++++++++++++++++++++++++++++++++++++++++++++++*/
    /*This creates the scanner object and takes in the input of all  data types to be expected*/
    static  Scanner input = new Scanner(System.in);
    static void printMessage(String msg){
        System.out.print(msg);
    }

    static int getIntPrompt(String promptMsg){
        printMessage(promptMsg);
        int userInput = 0;
        try {
            userInput = input.nextInt();
        }
        catch (IllegalArgumentException e){
            System.out.println("I need an integer please");
        }
            if(input.hasNextLine()){
            input.nextLine();
        }
        return userInput;
    }

    static String getStringPrompt(String promptMsg){
        printMessage(promptMsg);
        String userInput = "";
        try {
            userInput = input.nextLine();
        }
        catch (IllegalArgumentException e){
            System.out.println("I need an string please");
        }
        return userInput;
    }

    static double getDoublePrompt(String promptMsg){
        printMessage(promptMsg);
        double userInput = 0.0;
        try {
            userInput = input.nextDouble();
        }
        catch (IllegalArgumentException e){
            System.out.println("I need an double please");
        }
        if(input.hasNextLine()){
            input.nextLine();
        }
        return userInput;
    }


>>>>>>> Display
}

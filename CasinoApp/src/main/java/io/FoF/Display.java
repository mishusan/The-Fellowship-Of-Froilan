package io.FoF;

import org.omg.CORBA.Object;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Display {
    /*Used to display common variables*/


    static void welcome(String name) {
        System.out.println("Hello, " + name + " and WELCOME to the FoF casino.\nWe thank you for all your donations to the Fellowship.");
    }


    static void displayPurse(double purse) {
        System.out.println("Your purse is : " + purse);
    }

    static void displayPot(double pot) {
        System.out.println("The current pot is : " + pot);
    }

    static void displayBet(double bet) {
        System.out.println("The bet is : " + bet);
    }

    /*Used to display the objects e.g Card ascii art or image(GUI)*/
    /*
    static void showCard(Card card){
        System.out.println(card.image);
    }

    static void showDie(Dice die){
        System.out.println(die.face);
    }


    static void showTable(Object table){
        System.out.println(table.top);
    }


    static void showSlot(Object slot){
        System.out.println(slot.front);
    }

    /*Used to output any non variable Strings/Integers/Doubles*/
    static void showMessage(String message) {
        System.out.println(message);
    }

    static void showMessage(int message) {
        System.out.println(message);
    }

    static void showMessage(double message) {
        System.out.println(message);
    }

    /*++++++++++++++++++++++++++++++++++++++++++++++++++INPUT FROM USER+++++++++++++++++++++++++++++++++++++++++++++++*/
    /*This creates the scanner object and takes in the input of all  data types to be expected*/
    static Scanner input = new Scanner(System.in);

    static void printMessage(String msg) {
        System.out.print(msg);
    }

    static int getIntPrompt(String promptMsg) {
        int userInput = 0;
        while (true) {
            printMessage(promptMsg);
            try {
                userInput = input.nextInt();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("I need an integer please");
            }catch(InputMismatchException e){
                System.out.println("I need an integer please");
            }catch(IndexOutOfBoundsException e){
                System.out.println("Illegal Option");
            }
            if (input.hasNextLine()) {
                input.nextLine();
            }
        }
        return userInput;
    }

    static String getStringPrompt(String promptMsg) {
        printMessage(promptMsg);
        String userInput = "";
        while (true) {
            try {
                userInput = input.next();
                if (input.hasNextLine()) {
                    input.nextLine();
                }
                return userInput;

            } catch (IllegalArgumentException e) {
                System.out.println("I need an string please");
            }
        }
        //return userInput;
    }

    static double getDoublePrompt(String promptMsg) {
        printMessage(promptMsg);
        double userInput = 0.0;
        while (true) {
            try {
                userInput = input.nextDouble();
                if (input.hasNextLine()) {
                    input.nextLine();
                }
                return userInput;
            } catch (IllegalArgumentException e) {
                System.out.println("I need an double please");
            }catch (InputMismatchException e){
                System.out.println("I need an double please");
            }


        }
        //return userInput;
    }

}
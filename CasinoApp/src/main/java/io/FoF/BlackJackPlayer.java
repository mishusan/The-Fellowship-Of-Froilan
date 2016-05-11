package io.FoF;


import java.util.ArrayList;
import java.util.HashMap;
import static javax.swing.UIManager.put;

public class BlackjackPlayer {

    private String name;
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int numberOfCardsInHand = 0;

    public BlackjackPlayer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCardToHand(Card newCard){
        hand.add(newCard);
        this.numberOfCardsInHand++;
    }

    public void printHand(boolean showCard){

        System.out.printf("%s's cards:\n", this.name);
        for(int i = 0; i < numberOfCardsInHand; i++) {
            if(i ==0 && !showCard){
                System.out.println("[Hidden]");
            }else {
                System.out.println(Deck.faceValueToString(this.hand.get(i).getCardRank()) + " of " + this.hand.get(i).getCardSuit()+ "\n");
            }
        }
    }


    public int getHandSum(){
        int handSum = 0;
        int numOfAces = 0;
        for(int i = 0; i < this.hand.size(); i++){
            int rank = this.hand.get(i).getCardRank();
            if(rank == 14){
                numOfAces++;
                handSum+= 11;
            }
            if(rank >10 && rank < 14) {
                handSum += 10;
            }if(rank < 10){
                handSum += rank;
            }

            if(handSum > 21 && numOfAces >0){
                handSum -= 10;
                numOfAces--;
            }
        }

        return handSum;
    }
}

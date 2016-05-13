package io.FoF;

import java.util.ArrayList;


public class BlackjackPlayer extends Player {

    private String name;
    double amountPlayerBet;
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int numberOfCardsInHand = 0;

    public BlackjackPlayer(Player player) {
        name = player.getName();

    }

    public BlackjackPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCardToHand(Card newCard) {
        hand.add(newCard);
        this.numberOfCardsInHand++;
    }

    public String printHand(boolean showCard) {
        String cardInHand = "";
        //Display show message below
        System.out.printf("%s's cards:\n", this.name);
        for (int i = 0; i < numberOfCardsInHand; i++) {
            if (i == 0 && !showCard) {
                cardInHand += "[Hidden]\n";
            } else {
                cardInHand += Deck.faceValueToString(this.hand.get(i).getCardRank()) + " of " + this.hand.get(i).getCardSuit() + "\n";
            }
        }
        return cardInHand;
    }


    public int getHandTotalValue() {
        int handTotal = 0;
        int numberOfAces = 0;
        for (int i = 0; i < this.hand.size(); i++) {
            int rank = this.hand.get(i).getCardRank();
            if (rank == 14) {
                numberOfAces++;
                handTotal += 11;
            }
            if (rank > 10 && rank < 14) {
                handTotal += 10;
            }
            if (rank < 10) {
                handTotal += rank;
            }
            if (handTotal > 21 && numberOfAces > 0) {
                handTotal -= 10;
                numberOfAces--;
            }
        }
        return handTotal;
    }
}

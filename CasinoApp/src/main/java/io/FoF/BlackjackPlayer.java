package io.FoF;

import java.util.ArrayList;


public class BlackjackPlayer{


    private String name;
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int numberOfCardsInHand = 0;

    /**
     * Creates a new instance of blackjack player based on the player of casino
     * @param player
     */
    public BlackjackPlayer(Player player) {
        name = player.getName();
    }

    /**
     * Creates a new instance of blackjack player based on name only
     * @param name
     */
    public BlackjackPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Adds a new card to the players hand
     * @param newCard
     */
    public void addCardToHand(Card newCard) {
        hand.add(newCard);
        this.numberOfCardsInHand++;
    }

    /**
     * Prints out the value and ascii art of the cards in the hand, hides the first card if it is dealer's initial hand
     * @param showCard
     * @return
     */
    public String printHand(boolean showCard) {
        String cardInHand = "";
        System.out.printf("%s's cards:\n", this.name);
        for (int i = 0; i < numberOfCardsInHand; i++) {
            if (i == 0 && !showCard) {
                cardInHand += "[Hidden]\n";
            } else {
                cardInHand += Deck.faceValueToString(this.hand.get(i).getCardRank()) + " of " + this.hand.get(i).getCardSuit()+"\n" + this.hand.get(i).getAsciiCard() + "\n";
            }
        }
        return cardInHand;
    }

    /**
     * Returns the value of the total values of a player's hand, it counts Aces being 1 or 11
     * @return
     */
    public int getHandTotalValue() {
        int handTotal = 0;
        int numberOfAces = 0;
        for (int i = 0; i < this.hand.size(); i++) {
            int rank = this.hand.get(i).getCardRank();
            if (rank == 14) {
                numberOfAces++;
                handTotal += 11;
            }
            if (rank >= 10 && rank < 14) {
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

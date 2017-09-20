package com.pokerevaluator.deck;

import java.util.Arrays;

public class Hand {
    private Card[] hand;
    private boolean isSorted;

    public Hand(Card[] hand) {
        this.hand = hand.clone();
        isSorted = false;
    }

    public Card[] getHand() {
        return hand;
    }

    public void sortHand() {
        Arrays.sort(hand);
        isSorted = true;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "hand=" + Arrays.toString(hand) +
                '}';
    }
}

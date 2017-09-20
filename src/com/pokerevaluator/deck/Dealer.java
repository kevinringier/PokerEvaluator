package com.pokerevaluator.deck;

public class Dealer {
    Deck deck;

    public Dealer() {
        deck = new Deck();
        deck.shuffleDeck();
    }

    public Card[] deal(int numCards) {
        return deck.dealCards(numCards);
    }

    public void reshuffle() {
        deck.shuffleDeck();
    }
}

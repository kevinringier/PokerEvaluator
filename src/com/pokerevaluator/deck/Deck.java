package com.pokerevaluator.deck;

import java.util.Arrays;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Deck {
    private Card[] orderedDeck;
    private final int numCardsInSuit;
    private final int numSuits;
    private final int numCardsInDeck;
    private boolean isShuffled;
    private LinkedList<Card> shuffledDeck;


    Deck() {
        numCardsInSuit = 13;
        numSuits = 4;
        numCardsInDeck = numCardsInSuit * numSuits;
        this.orderedDeck = generateDeck();
        isShuffled = false;

    }

    private Card[] generateDeck() {
        Card[] cards = new Card[52];

        for (int i = 0; i < numSuits; i++) {
            for (int j = 0; j < 13; j++) {
                if (i == 0) cards[i * numCardsInSuit + j] = new Card(Suit.CLUBS, j + 2);
                if (i == 1) cards[i * numCardsInSuit + j] = new Card(Suit.DIAMONDS, j + 2);
                if (i == 2) cards[i * numCardsInSuit + j] = new Card(Suit.SPADES, j + 2);
                if (i == 3) cards[i * numCardsInSuit + j] = new Card(Suit.HEARTS, j + 2);
            }
        }
        return cards;
    }

    public Card[] getDeck() {
        return orderedDeck;
    }

    public boolean isShuffled() {
        return isShuffled;
    }

    public void shuffleDeck() {

        Random random = new Random();
        Card[] shuffledDeck = orderedDeck.clone();
        Card cardSwap;
        int randomIndex;

        for (int i = 1; i < numCardsInDeck; i++) {
            randomIndex = random.nextInt(i);
            cardSwap = shuffledDeck[i];
            shuffledDeck[i] = shuffledDeck[randomIndex];
            shuffledDeck[randomIndex] = cardSwap;
        }

        isShuffled = true;
        this.shuffledDeck = new LinkedList<Card>(Arrays.asList(shuffledDeck));

    }

    public Card[] dealCards(int numCards) {

        if (!isShuffled) throw new IllegalStateException("Deck is not shuffled, no cards to be dealt");

        if (numCards < 1 || numCards > shuffledDeck.size()) throw new IllegalArgumentException();

        Card[] cards = new Card[numCards];

        for (int i = 0; i < numCards; i++) {
            cards[i] = shuffledDeck.pop();
        }
        return cards;
    }



    public static void main(String[] args) {

    }
}

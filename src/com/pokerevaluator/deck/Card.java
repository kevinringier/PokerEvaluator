package com.pokerevaluator.deck;

public class Card implements Comparable<Card> {

    private final Suit suit;
    private final int value;
    private boolean isAvailable;



    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
        this.isAvailable = true;

    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (value != card.value) return false;
        return suit == card.suit;
    }

    @Override
    public int hashCode() {
        int result = suit != null ? suit.hashCode() : 0;
        result = 31 * result + value;
        return result;
    }

    @Override
    public int compareTo(Card that) {
        return this.value - that.value;
    }
}

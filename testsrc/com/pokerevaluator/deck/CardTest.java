package com.pokerevaluator.deck;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    Card card = new Card(Suit.SPADES, 2);
    @Test
    public void getSuit() throws Exception {

        assertEquals(Suit.SPADES, card.getSuit());

    }

    @Test
    public void getValue() throws Exception {
        assertEquals(2, card.getValue());
    }



}
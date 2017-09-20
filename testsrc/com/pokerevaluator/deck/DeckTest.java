package com.pokerevaluator.deck;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    private Deck deck = new Deck();

    @Test
    public void getDeck() throws Exception {

        Card[] expectedDeck = new Card[52];

        expectedDeck[0] = new Card(Suit.CLUBS, 2);
        expectedDeck[1] = new Card(Suit.CLUBS, 3);
        expectedDeck[2] = new Card(Suit.CLUBS, 4);
        expectedDeck[3] = new Card(Suit.CLUBS, 5);
        expectedDeck[4] = new Card(Suit.CLUBS, 6);
        expectedDeck[5] = new Card(Suit.CLUBS, 7);
        expectedDeck[6] = new Card(Suit.CLUBS, 8);
        expectedDeck[7] = new Card(Suit.CLUBS, 9);
        expectedDeck[8] = new Card(Suit.CLUBS, 10);
        expectedDeck[9] = new Card(Suit.CLUBS, 11);
        expectedDeck[10] = new Card(Suit.CLUBS, 12);
        expectedDeck[11] = new Card(Suit.CLUBS, 13);
        expectedDeck[12] = new Card(Suit.CLUBS, 14);
        expectedDeck[13] = new Card(Suit.DIAMONDS, 2);
        expectedDeck[14] = new Card(Suit.DIAMONDS, 3);
        expectedDeck[15] = new Card(Suit.DIAMONDS, 4);
        expectedDeck[16] = new Card(Suit.DIAMONDS, 5);
        expectedDeck[17] = new Card(Suit.DIAMONDS, 6);
        expectedDeck[18] = new Card(Suit.DIAMONDS, 7);
        expectedDeck[19] = new Card(Suit.DIAMONDS, 8);
        expectedDeck[20] = new Card(Suit.DIAMONDS, 9);
        expectedDeck[21] = new Card(Suit.DIAMONDS, 10);
        expectedDeck[22] = new Card(Suit.DIAMONDS, 11);
        expectedDeck[23] = new Card(Suit.DIAMONDS, 12);
        expectedDeck[24] = new Card(Suit.DIAMONDS, 13);
        expectedDeck[25] = new Card(Suit.DIAMONDS, 14);
        expectedDeck[26] = new Card(Suit.SPADES, 2);
        expectedDeck[27] = new Card(Suit.SPADES, 3);
        expectedDeck[28] = new Card(Suit.SPADES, 4);
        expectedDeck[29] = new Card(Suit.SPADES, 5);
        expectedDeck[30] = new Card(Suit.SPADES, 6);
        expectedDeck[31] = new Card(Suit.SPADES, 7);
        expectedDeck[32] = new Card(Suit.SPADES, 8);
        expectedDeck[33] = new Card(Suit.SPADES, 9);
        expectedDeck[34] = new Card(Suit.SPADES, 10);
        expectedDeck[35] = new Card(Suit.SPADES, 11);
        expectedDeck[36] = new Card(Suit.SPADES, 12);
        expectedDeck[37] = new Card(Suit.SPADES, 13);
        expectedDeck[38] = new Card(Suit.SPADES, 14);
        expectedDeck[39] = new Card(Suit.HEARTS, 2);
        expectedDeck[40] = new Card(Suit.HEARTS, 3);
        expectedDeck[41] = new Card(Suit.HEARTS, 4);
        expectedDeck[42] = new Card(Suit.HEARTS, 5);
        expectedDeck[43] = new Card(Suit.HEARTS, 6);
        expectedDeck[44] = new Card(Suit.HEARTS, 7);
        expectedDeck[45] = new Card(Suit.HEARTS, 8);
        expectedDeck[46] = new Card(Suit.HEARTS, 9);
        expectedDeck[47] = new Card(Suit.HEARTS, 10);
        expectedDeck[48] = new Card(Suit.HEARTS, 11);
        expectedDeck[49] = new Card(Suit.HEARTS, 12);
        expectedDeck[50] = new Card(Suit.HEARTS, 13);
        expectedDeck[51] = new Card(Suit.HEARTS, 14);

        assertArrayEquals(expectedDeck, deck.getDeck());
    }

    @Test
    public void isDeckShuffled() throws Exception {
        deck.shuffleDeck();

        assertEquals(true, deck.isShuffled());
    }

}
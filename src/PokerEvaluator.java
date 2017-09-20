import com.pokerevaluator.deck.Card;
import com.pokerevaluator.deck.Dealer;
import com.pokerevaluator.deck.Hand;
import com.pokerevaluator.deck.Suit;


public class PokerEvaluator {
    Hand hand;

    PokerEvaluator(Hand hand) {
        if (hand == null) throw new IllegalArgumentException("Not a valid Hand");

        this.hand = new Hand(hand.getHand());
        this.hand.sortHand();
    }

    public Card[] getHand() {
        return hand.getHand();
    }

    public String evaluateHand(Card[] hand) {
        if (isRoyalFlush(hand))  return "Royal Flush";
        if (isStraightFlush(hand)) return "Straight FLush";
        if (isFourOfAKind(hand)) return "Four Of A Kind";
        if (isFullHouse(hand)) return "FullHouse";
        if (isFlush(hand)) return "Flush";
        if (isStraight(hand)) return "Straight";
        if (isThreeOfAKind(hand)) return "Three Of A Kind";
        if (isTwoPair(hand)) return "Two Pair";
        if (isPair(hand)) return "Pair";
        else return "High Card";
    }

    private boolean isRoyalFlush(Card[] hand) {
        if (hand[0].getValue() != 10) return false;

        for (int i = 0; i < hand.length; i++) {
            for (int j = i + 1; j < hand.length; j++) {
                if (hand[i].getSuit() != hand[j].getSuit() || hand[i].getValue() == hand[j].getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isStraightFlush(Card[] hand) {

        if (hand[4].getValue() == 14 && hand[0].getValue() == 2) {
            if (hand[0].getValue() + 3 != hand[hand.length - 2].getValue()) {
                return false;
            }
            for (int i = 0; i < hand.length; i++) {
                for (int j = i + 1; j < hand.length; j++) {
                    if (hand[i].getSuit() != hand[j].getSuit() || hand[i].getValue() == hand[j].getValue()) {
                        return false;
                    }
                }
            }
        }

        if (hand[0].getValue() + 4 != hand[hand.length - 1].getValue()) {
            return false;
        }

        for (int i = 0; i < hand.length; i++) {
            for (int j = i + 1; j < hand.length; j++) {
                if (hand[i].getSuit() != hand[j].getSuit() || hand[i].getValue() == hand[j].getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isFourOfAKind(Card[] hand) {
        if (hand[0].getValue() == hand[3].getValue()) return true;
        if (hand[1].getValue() == hand[4].getValue()) return true;
        return false;
    }

    private boolean isFullHouse(Card[] hand) {
        if (hand[0].getValue() == hand[2].getValue() && hand[3].getValue() == hand[4].getValue()) {
            return true;
        }
        if (hand[0].getValue() == hand[1].getValue() && hand[2].getValue() == hand[4].getValue()) {
            return true;
        }
        return false;
    }

    private boolean isFlush(Card[] hand) {
        for (int i = 1; i < hand.length; i++) {
            if (hand[0].getSuit() != hand[i].getSuit()) return false;
        }
        return true;
    }

    private boolean isStraight(Card[] hand) {
        if (hand[4].getValue() == 14 && hand[0].getValue() == 2) {
            if (hand[0].getValue() + 3 != hand[hand.length - 2].getValue()) {
                return false;
            }
            for (int i = 0; i < hand.length; i++) {
                for (int j = i + 1; j < hand.length; j++) {
                    if (hand[i].getValue() == hand[j].getValue()) {
                        return false;
                    }
                }
            }
        }

        if (hand[0].getValue() + 4 != hand[hand.length - 1].getValue()) {
            return false;
        }

        for (int i = 0; i < hand.length; i++) {
            for (int j = i + 1; j < hand.length; j++) {
                if (hand[i].getValue() == hand[j].getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isThreeOfAKind(Card[] hand) {
        if (hand[0].getValue() == hand[2].getValue()) return true;
        if (hand[1].getValue() == hand[3].getValue()) return true;
        if (hand[2].getValue() == hand[4].getValue()) return true;
        return false;
    }

    private boolean isTwoPair(Card[] hand) {
        if (hand[0].getValue() == hand[1].getValue()) {
            if (hand[2].getValue() == hand[3].getValue() || hand[3].getValue() == hand[4].getValue()) {
                return true;
            }
        }
        if (hand[1].getValue() == hand[2].getValue()) {
            if (hand[3].getValue() == hand[4].getValue()) {
                return true;
            }
        }
        return false;
    }

    private boolean isPair(Card[] hand) {
        for (int i = 0; i < hand.length - 1; i++) {
            if (hand[i].getValue() == hand[i + 1].getValue()) return true;
        }
        return false;
    }

    private boolean isHighCard(Card[] hand) {
        return true;
    }



    public static void main(String[] args) {


    }
}

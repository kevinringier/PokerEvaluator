import com.pokerevaluator.deck.Dealer;
import com.pokerevaluator.deck.Hand;

public class PokerStats {

    private int royalFlushCount = 0;
    private int straightFlushCount = 0;
    private int fourOfAKindCount = 0;
    private int fullHouseCount = 0;
    private int flushCount = 0;
    private int straightCount = 0;
    private int threeOfAKindCount = 0;
    private int twoPairCount = 0;
    private int pairCount = 0;
    private int highCardCount = 0;
    private int numSimulations;

    public PokerStats(int numSimulations) {
        Dealer dealer = new Dealer();
        Hand hand;

        this.numSimulations = numSimulations;


        for (int i = 0; i < numSimulations; i++) {

            hand = new Hand(dealer.deal(5));
            PokerEvaluator pokerEvaluator = new PokerEvaluator(hand);

            handCount(pokerEvaluator.evaluateHand(pokerEvaluator.getHand()));
            dealer.reshuffle();

        }

    }

    private void handCount(String hand) {
        if (hand.equals("Royal Flush")) {
            royalFlushCount++;
            return;
        }
        if (hand.equals("Straight FLush")) {
            straightFlushCount++;
            return;
        }
        if (hand.equals("Four Of A Kind")) {
            fourOfAKindCount++;
            return;
        }
        if (hand.equals("FullHouse")) {
            fullHouseCount++;
            return;
        }
        if (hand.equals("Flush")) {
            flushCount++;
            return;
        }
        if (hand.equals("Straight")) {
            straightCount++;
            return;
        }
        if (hand.equals("Three Of A Kind")) {
            threeOfAKindCount++;
            return;
        }
        if (hand.equals("Two Pair")) {
            twoPairCount++;
            return;
        }
        if (hand.equals("Pair")) {
            pairCount++;
            return;
        } else {
            highCardCount++;
        }
    }

    private double percentage(int handCount) {
        return handCount;
    }

    @Override
    public String toString() {
        return "PokerStats: \n" +
                "royalFlushCount: " + percentage(royalFlushCount) + "\n" +
                "straightFlushCount: " + percentage(straightFlushCount) + "\n" +
                "fourOfAKindCount: " + percentage(fourOfAKindCount) + "\n" +
                "fullHouseCount: " + percentage(fullHouseCount) + "\n" +
                "flushCount: " + percentage(flushCount) + "\n" +
                "straightCount: " + percentage(straightCount) + "\n" +
                "threeOfAKindCount: " + percentage(threeOfAKindCount) + "\n" +
                "twoPairCount: " + percentage(twoPairCount) + "\n" +
                "pairCount: " + percentage(pairCount) + "\n" +
                "highCardCount: " + percentage(highCardCount);
    }

    public static void main(String[] args) {
        PokerStats pokerSimulation = new PokerStats(10000000);
        System.out.print(pokerSimulation.toString());

    }
}

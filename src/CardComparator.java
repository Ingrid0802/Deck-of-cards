import java.util.Comparator;

public class CardComparator implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
        int val;
        val = card1.getSuit().compareTo(card2.getSuit());
        if(val == 0){
            val = card1.getRank().compareTo(card2.getRank());
        }
        return val;
    }
}

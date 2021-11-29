public class Main {

    public static void main(String[] args) {

        Card card1 = new Card(Rank.ACE,Suit.DIAMONDS);
        Card card2 = new Card(Rank.ACE, Suit.CLUBS);
        Card card3 = new Card(Rank.JACK, Suit.HEARTS);
        Card card4 = new Card(Rank.SEVEN, Suit.HEARTS);
   //   Card card5 = new Card(Rank.SEVEN, Suit.HEARTS);
        Card card6 = new Card(Rank.NINE, Suit.DIAMONDS);
        Card card7 = new Card(Rank.KING, Suit.SPADES);

        Hand hand = new Hand();
        hand.addCard(card1);
        hand.addCard(card2);
        hand.addCard(card3);
        hand.addCard(card4);
        hand.addCard(card6);
        hand.addCard(card7);
    //  hand.addCard(card5);

        hand.display();
        System.out.println("***************");
        try {
            hand.sort();
        } catch (InvalidCardException e){
            e.printStackTrace();
        }

        System.out.println("*****************");
        hand.display();

        hand.storable("hand.txt");
    }
}

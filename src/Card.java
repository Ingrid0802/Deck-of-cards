import java.io.Serializable;

public class Card implements Serializable {

    Suit suit;
    Rank rank;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank(){
        return this.rank;
    }

    public Suit getSuit(){
        return this.suit;
    }
    

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Card)){
            return false;
        }
        Card card = (Card) obj;
        if((this.suit == card.suit) && (this.rank == card.rank)){
            return true;
        }

        return false;
    }

    public String toString(){
        return "Rank: " + this.rank + " Suit: " + this.suit;
    }
}

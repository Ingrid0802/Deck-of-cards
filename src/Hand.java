import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Storable, Serializable {
    private List<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public void addCard(Card c){
        cards.add(c);
    }

    public void deleteCard(Rank rank,Suit suit){
        Card card = new Card(rank,suit);
        if(this.cards.contains(card)){
            cards.remove(card);
        } else {
            System.out.println("You don't have that card.");
        }
    }


    public void sort() throws InvalidCardException {
        Collections.sort(cards, new CardComparator());

        // throw custom error if duplicates are in the list
        for(int i = 0; i < cards.size(); i++){
            for (int j = i+1; j < cards.size(); j++){
                if(cards.get(i).equals(cards.get(j))){
                    throw new InvalidCardException("You cannot have duplicates!");
                }
            }
        }

    }

    public void display(){
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Override
    public void storable(String file) {
           try(FileOutputStream fs = new FileOutputStream(file)){

               ObjectOutputStream os = new ObjectOutputStream(fs);

               os.writeObject(this);
               os.close();

           } catch (FileNotFoundException e){
               e.printStackTrace();
           } catch (IOException e){
               e.printStackTrace();
           }

    }
}

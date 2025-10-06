
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        for (Suit suit : Suit.values()) {
            for (Type type : Type.values()) {
                cards.add(new Card(suit, type));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void deal(int count) {
        if (cards.isEmpty()) {
            return null;
        }

       
        for(int i = 0; i < count; i++){
            Hand.cards.add(cards[i]);
        }

        
    }

    public int size() {
        return cards.size();
    }


    
}

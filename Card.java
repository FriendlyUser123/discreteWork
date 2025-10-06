
public class Card {
    private final Suit suit;
    private final Type type;

    public Card(Suit suit, Type type) {
        this.suit = suit;
        this.type = type;
    }

    public Suit getSuit() {
        return suit;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " of " + suit;
    }
}

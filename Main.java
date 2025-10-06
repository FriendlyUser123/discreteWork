
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("Dealing 5 cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.deal());
        }
    }
}

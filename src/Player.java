package src;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Card> hands = new ArrayList<>();
    int score;
    String name;


    public Player(List<Card> hands, int score, String name) {
        this.hands = hands;
        this.score = score;
        this.name = name;
    }

    public void describe() {
        for ( Card card : this.hands) {
            System.out.println(card.getValue() + " of " + card.getName());
        }
    }

    public Card flip () {
//        step one: remove the top card of deck
        Card card = hands.remove(0);

//        step two: show the value of the card that was removed
        return card;
    }

    public void draw (Deck deckOfCards) {
        Card cardDrew = deckOfCards.draw();
        //TODO Check if it should be hands.add or this.hands.add
        this.hands.add(cardDrew);
    }

    public void incrementScore () {
        //TODO Reseach keyword this.XXX
        score = score + 1;
    }
}

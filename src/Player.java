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

    public Card draw () {
        Card card = this.hands.remove(0);
        return card;
    }

    public void incrementScore () {
        score = score + 1;
    }
//    this will keep incrementing the score by one when a player wins

    public int getScore() {
        return score;
    }
}

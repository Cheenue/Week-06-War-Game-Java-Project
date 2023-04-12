package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> listOfCards = new ArrayList<>();
    Deck() {
        String[] names = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14"};

        for (String name : names) {
            int count = 2;
            for (String value : values) {
                Card card = new Card(value, name);
                this.listOfCards.add(card);
                count++;
            }

        }


    }
    public void shuffle() {
        Collections.shuffle(this.listOfCards);
    }

    public Card draw () {
        Card card = this.listOfCards.remove(0);
        return card;
    }
}

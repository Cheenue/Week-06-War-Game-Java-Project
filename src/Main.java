package src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {


        Player

//        Deck deck = new Deck();
//        deck.shuffle();
//        deck.listOfCards.get(1).describe();


        List<Card> listOfCards = new ArrayList<>();
        Player cheenue = new Player(listOfCards, 2, "Cheenue");
        Player cheenue1 = new Player(listOfCards, 3, "Cheenue1");

        cheenue.incrementScore();
        System.out.println(cheenue.score);
        cheenue1.incrementScore();
        System.out.println(cheenue1.score);
    }
}

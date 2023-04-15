package src;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
//        We created a new deck, shuffled it, and then created two hands from the new deck.

        for( int i = 0; i < 52; i++){
            if ( i % 2 == 0) {
                hand1.add(deck.draw());
            } else {
                hand2.add(deck.draw());
            }
        }

        Player player1 = new Player(hand1, 0, "Cheenue");
        Player player2 = new Player(hand2, 0, "Kong");

        for ( int j = 0; j < 26; j++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            if (player1Card.getValue() > player2Card.getValue()) {
                System.out.println("Player 1 wins the round!");
                player1.incrementScore();
            } else if (player2Card.getValue() > player1Card.getValue()){
                System.out.println("Player 2 wins the round!");
                player2.incrementScore();
            } else {
                System.out.println("You both tied!");
            }
        }

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins the game!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Player 2 wins the game!");
        } else {
            System.out.println("The game is tied and you both win!");
        }

    }
}

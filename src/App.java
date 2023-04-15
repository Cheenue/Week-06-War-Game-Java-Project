package src;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
//        I created a new deck, shuffled it, and then created two hands from the new deck.

        for( int i = 0; i < 52; i++){
            if ( i % 2 == 0) {
                hand1.add(deck.draw());
            } else {
                hand2.add(deck.draw());
            }
        }
//        In this for loop, I am interating through the 52 cards and I am giving every even card to hand1 and every odd card to hand2

        Player player1 = new Player(hand1, 0, "Cheenue");
        Player player2 = new Player(hand2, 0, "Kong");

//        Here, I made two players by calling the Player class into the App class called player1 and player2

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

//        I made a for loop to flip the first card of each player's hands and then if player1's hand had a higher value than player2,
//        player1 would win, but if not, player 2 would win, or they could tie if both values were the same.

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins the game!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Player 2 wins the game!");
        } else {
            System.out.println("The game is tied and you both win!");
        }

//        At the very end of the game, if player1's score of having more cards than player2 then player1 would win, same thing would
//        happen if player2 won, otherwise they both would tie at the end.

    }
}

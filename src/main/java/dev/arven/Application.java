package dev.arven;

import dev.arven.Entity.CardDeck;

public class Application {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        cardDeck.createCardDeck();
        cardDeck.printCardDeck();
        cardDeck.shuffle();
        cardDeck.printShuffledCardDeck();
    }
}

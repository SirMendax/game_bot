package dev.arven.Entity;

import java.util.*;

final public class CardDeck {
    private static final int RANK = 13;
    public ArrayList<Card> cardDeck = new ArrayList<>();
    public Stack<Card> shuffledCardDeck = new Stack<>();

    public void createCardDeck()
    {
        for(int i = 0; i < RANK; i++){
            for(Suit suit : Suit.values()){
                cardDeck.add(new Card(suit, i));
            }
        }
    }

    public void printCardDeck()
    {
        for(Card card : cardDeck){
            System.out.println("Suit: " + card.getSuit() + ", rank: " + card.getRank());
        }
    }

    public void shuffle()
    {
        Collections.shuffle(cardDeck);
        for(Card card : cardDeck){
            shuffledCardDeck.push(card);
        }
    }

    public void printShuffledCardDeck()
    {
        for(Card card : shuffledCardDeck){
            System.out.println("Suit: " + card.getSuit() + ", rank: " + card.getRank());
        }
    }
}

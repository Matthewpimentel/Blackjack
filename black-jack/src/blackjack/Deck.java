/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matt
 */
public class Deck {
    private List<Card> deck = new ArrayList<Card>();
    private final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }
    
    public void generateDeck(){
        for(int i = 2; i < 14; i++){
            Card c = new Card();
            c.setSuit(SUITS[0]);
            c.setValue(i);
            deck.add(c);
        }
        
        for(int i = 2; i < 14; i++){
            Card c = new Card();
            c.setSuit(SUITS[1]);
            c.setValue(i);
            deck.add(c);
        }
        
        for(int i = 2; i < 14; i++){
            Card c = new Card();
            c.setSuit(SUITS[2]);
            c.setValue(i);
            deck.add(c);
        }
        
        for(int i = 2; i < 14; i++){
            Card c = new Card();
            c.setSuit(SUITS[3]);
            c.setValue(i);
            deck.add(c);
        }
    }
    
    public Card getCardFromDeck(int i){
        return deck.get(i);
    }

    @Override
    public String toString() {
        return "Deck{" + "deck=" + deck + ", SUITS=" + SUITS + '}';
    }
    
    
    
}

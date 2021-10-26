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
public class Player {
    private List<Card> hand = new ArrayList<Card>();
    private String name;
    private int chips = 200;
    
    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }
    
    
        
    public void addCardToHand(Card card){
        hand.add(card);
    }
    
    public void clearHand(){
        hand.clear();
    }
    
    
    
}

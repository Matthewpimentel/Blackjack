/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Matt
 */
public class Dealer {

    private List<Card> hand = new ArrayList<Card>();

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public void shuffle(List deck) {
        Collections.shuffle(deck);
    }

    public void dealToPlayer(Deck deck, int i, Player player) {
        player.addCardToHand(deck.getDeck().get(i));
    }

    public void dealToDealer(Card card) {
        hand.add(card);
    }

    public int calculatePoints(Player player) {
        int points = 0;

        for (int i = 0; i < player.getHand().size(); i++) {
            if (player.getHand().get(i).toString().contains("2") && !player.getHand().get(i).toString().contains("1")) {
                points += 2;
            } else if (player.getHand().get(i).toString().contains("3") && !player.getHand().get(i).toString().contains("1")) {
                points += 3;
            } else if (player.getHand().get(i).toString().contains("4")) {
                points += 4;
            } else if (player.getHand().get(i).toString().contains("5")) {
                points += 5;
            } else if (player.getHand().get(i).toString().contains("6")) {
                points += 6;
            } else if (player.getHand().get(i).toString().contains("7")) {
                points += 7;
            } else if (player.getHand().get(i).toString().contains("8")) {
                points += 8;
            } else if (player.getHand().get(i).toString().contains("9")) {
                points += 9;
            } else if (player.getHand().get(i).toString().contains("10")) {
                points += 10;
            } else if (player.getHand().get(i).toString().contains("11")) {
                points += 10;
            } else if (player.getHand().get(i).toString().contains("12")) {
                points += 10;
            } else if (player.getHand().get(i).toString().contains("13")) {
                points += 10;
            } else {

            }
        }
        return points;
    }

    public int calculateDealerPoints(Dealer dealer) {
        int points = 0;

        for (int i = 0; i < dealer.getHand().size(); i++) {
            if (dealer.getHand().get(i).toString().contains("2") && !dealer.getHand().get(i).toString().contains("1")) {
                points += 2;
            } else if (dealer.getHand().get(i).toString().contains("3") && !dealer.getHand().get(i).toString().contains("1")) {
                points += 3;
            } else if (dealer.getHand().get(i).toString().contains("4")) {
                points += 4;
            } else if (dealer.getHand().get(i).toString().contains("5")) {
                points += 5;
            } else if (dealer.getHand().get(i).toString().contains("6")) {
                points += 6;
            } else if (dealer.getHand().get(i).toString().contains("7")) {
                points += 7;
            } else if (dealer.getHand().get(i).toString().contains("8")) {
                points += 8;
            } else if (dealer.getHand().get(i).toString().contains("9")) {
                points += 9;
            } else if (dealer.getHand().get(i).toString().contains("10")) {
                points += 10;
            } else if (dealer.getHand().get(i).toString().contains("11")) {
                points += 10;
            } else if (dealer.getHand().get(i).toString().contains("12")) {
                points += 10;
            } else if (dealer.getHand().get(i).toString().contains("13")) {
                points += 10;
            } else {

            }
        }
        return points;
    }

    public void winOrLose(Dealer dealer, Player player, int bet) {
        int winnings = bet;
        int loss = bet;
        int chips = player.getChips();
        if (dealer.calculatePoints(player) > dealer.calculateDealerPoints(dealer) && dealer.calculateDealerPoints(dealer) <= 21) {
            chips += winnings;
            System.out.println("you win: " + winnings +"\nCurrent balance: " + chips);
            player.setChips(chips);
        } else if (dealer.calculateDealerPoints(dealer) > 21 && dealer.calculatePoints(player) <= 21) {
            chips += winnings;
            System.out.println("you win: " + winnings +"\nCurrent balance: " + chips);
            player.setChips(chips);
        } else if (dealer.calculateDealerPoints(dealer) == dealer.calculatePoints(player)) {
            chips += winnings;
            System.out.println("you win: " + winnings +"\nCurrent balance: " + chips);
            player.setChips(chips);
        } else if(dealer.calculatePoints(player) > 21){
            chips -= loss;
            System.out.println("you lose!" + "\nCurrent balance: " + chips);
            player.setChips(chips);
        } else {
            chips -= loss;
            System.out.println("you lose!" + "\nCurrent balance: " + chips);
            player.setChips(chips);
        }
    }
    
    public void clearHand(){
        hand.clear();
    }
}

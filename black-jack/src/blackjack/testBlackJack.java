/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class testBlackJack {
    
    public static void main(String[] args) {
        boolean flag = true;
        boolean replay = true;
        int bet = 0;
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();
        Player player = new Player();
        Dealer dealer = new Dealer();
        
        System.out.println("Please enter your name");
        String name = input.next();
        player.setName(name);
        
        System.out.println("Would you like to play BlackJack?\nY for yes and N for no");
        String play = input.next();
        
        if (play.contains("n") || play.contains("N")) {
            System.exit(0);
        }
        while (replay == true) {
            player.clearHand();
            dealer.clearHand();
            deck.generateDeck();
            dealer.shuffle(deck.getDeck());
            
            System.out.println("Current chip amount: " + player.getChips());
            
            while (flag == true) {
                System.out.println("please enter a bet: ");
                bet = input.nextInt();
                if (bet > player.getChips() || bet < 0) {
                    System.out.println("Invalid bet!");
                } else if (player.getChips() == 0) {
                    System.out.println("You are out of chips thanks for playing!");
                    System.exit(0);
                } else {
                    System.out.println("Bet accepted");
                    flag = false;
                }
            }
            
            flag = true;
            
            System.out.println("Bets are in! \nDealing cards");
            
            dealer.dealToPlayer(deck, 0, player);
            dealer.dealToDealer(deck.getDeck().get(1));
            dealer.dealToPlayer(deck, 2, player);
            dealer.dealToDealer(deck.getDeck().get(3));
            
            System.out.println(player.getHand() + " is dealt to you\n" + dealer.getHand() + " is dealt to the dealer");
            System.out.println("Your points: " + dealer.calculatePoints(player));
            System.out.println("Dealers points: " + dealer.calculateDealerPoints(dealer));
            dealer.dealToDealer(deck.getDeck().get(4));
            
            System.out.println("Dealer has another face down card! \nwould you like to hit or stay? \n1 for hit and 2 for stay");
            int hitOrStay = input.nextInt();
            
            if (hitOrStay == 1) {
                dealer.dealToPlayer(deck, 5, player);
                System.out.println("The dealer deals your card and your current hand is " + player.getHand());
                System.out.println("Your current points: " + dealer.calculatePoints(player));
                
            } else {
                
            }
            
            System.out.println("Dealer reveals his card and his full hand is: " + dealer.getHand());
            System.out.println("Dealers points: " + dealer.calculateDealerPoints(dealer));
            System.out.println("Your points: " + dealer.calculatePoints(player));
            
            dealer.winOrLose(dealer, player, bet);
            
            System.out.println("Would you like to play again?" + "\nY for yes and Q to quit");
            String replayChar = input.next();
            if (replayChar.equals("Q") || replayChar.equals("q")) {
                replay = false;
            }
        }
        input.close();
        
    }
}

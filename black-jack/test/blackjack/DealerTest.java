/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class DealerTest {
    
    public DealerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHand method, of class Dealer.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Dealer instance = new Dealer();
        List<Card> expResult = null;
        List<Card> result = instance.getHand();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHand method, of class Dealer.
     */
    @Test
    public void testSetHand() {
        System.out.println("setHand");
        List<Card> hand = null;
        Dealer instance = new Dealer();
        instance.setHand(hand);
    }

    /**
     * Test of shuffle method, of class Dealer.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        List deck = null;
        Dealer instance = new Dealer();
        instance.shuffle(deck);
    }

    /**
     * Test of dealToPlayer method, of class Dealer.
     */
    @Test
    public void testDealToPlayer() {
        System.out.println("dealToPlayer");
        Deck deck = null;
        int i = 0;
        Player player = null;
        Dealer instance = new Dealer();
        instance.dealToPlayer(deck, i, player);
    }

    /**
     * Test of dealToDealer method, of class Dealer.
     */
    @Test
    public void testDealToDealer() {
        System.out.println("dealToDealer");
        Card card = null;
        Dealer instance = new Dealer();
        instance.dealToDealer(card);
    }

    /**
     * Test of calculatePoints method, of class Dealer.
     */
    @Test
    public void testCalculatePoints() {
        System.out.println("calculatePoints");
        Player player = null;
        Dealer instance = new Dealer();
        int expResult = 0;
        int result = instance.calculatePoints(player);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateDealerPoints method, of class Dealer.
     */
    @Test
    public void testCalculateDealerPoints() {
        System.out.println("calculateDealerPoints");
        Dealer dealer = null;
        Dealer instance = new Dealer();
        int expResult = 0;
        int result = instance.calculateDealerPoints(dealer);
        assertEquals(expResult, result);
    }

    /**
     * Test of winOrLose method, of class Dealer.
     */
    @Test
    public void testWinOrLose() {
        System.out.println("winOrLose");
        Dealer dealer = null;
        Player player = null;
        int bet = 0;
        Dealer instance = new Dealer();
        instance.winOrLose(dealer, player, bet);
    }

    /**
     * Test of clearHand method, of class Dealer.
     */
    @Test
    public void testClearHand() {
        System.out.println("clearHand");
        Dealer instance = new Dealer();
        instance.clearHand();;
    }
    
}

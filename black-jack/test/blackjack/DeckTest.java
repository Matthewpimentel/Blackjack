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
public class DeckTest {
    
    public DeckTest() {
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
     * Test of getDeck method, of class Deck.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        Deck instance = new Deck();
        List<Card> expResult = instance.getDeck();
        List<Card> result = instance.getDeck();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDeck method, of class Deck.
     */
    @Test
    public void testSetDeck() {
        System.out.println("setDeck");
        List<Card> deck = null;
        Deck instance = new Deck();
        instance.setDeck(deck);
    }

    /**
     * Test of generateDeck method, of class Deck.
     */
    @Test
    public void testGenerateDeck() {
        System.out.println("generateDeck");
        Deck instance = new Deck();
        instance.generateDeck();
    }

    /**
     * Test of getCardFromDeck method, of class Deck.
     */
    @Test
    public void testGetCardFromDeck() {
        System.out.println("getCardFromDeck");
        int i = 0;
        Deck instance = new Deck();
        Card expResult = null;
        Card result = instance.getCardFromDeck(i);
        assertEquals(expResult, result);
    }

    
}

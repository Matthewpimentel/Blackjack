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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Player instance = new Player();
        List<Card> expResult = instance.getHand();
        List<Card> result = instance.getHand();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHand method, of class Player.
     */
    @Test
    public void testSetHand() {
        System.out.println("setHand");
        List<Card> hand = null;
        Player instance = new Player();
        instance.setHand(hand);
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = new Player();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Player instance = new Player();
        instance.setName(name);
    }

    /**
     * Test of getChips method, of class Player.
     */
    @Test
    public void testGetChips() {
        System.out.println("getChips");
        Player instance = new Player();
        int expResult = 200;
        int result = instance.getChips();
        assertEquals(expResult, result);
    }

    /**
     * Test of setChips method, of class Player.
     */
    @Test
    public void testSetChips() {
        System.out.println("setChips");
        int chips = 0;
        Player instance = new Player();
        instance.setChips(chips);
    }

    /**
     * Test of addCardToHand method, of class Player.
     */
    @Test
    public void testAddCardToHand() {
        System.out.println("addCardToHand");
        Card card = null;
        Player instance = new Player();
        instance.addCardToHand(card);
    }

    /**
     * Test of clearHand method, of class Player.
     */
    @Test
    public void testClearHand() {
        System.out.println("clearHand");
        Player instance = new Player();
        instance.clearHand();
    }
    
}

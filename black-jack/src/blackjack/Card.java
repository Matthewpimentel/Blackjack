
package blackjack;


public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13
    /**
     * @return the suit
     */
   
   
  
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
   @Override
    public String toString(){
        return value + " " + suit;
    }
}

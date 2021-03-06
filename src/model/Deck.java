package model;

import utility.DiceRNG;
import model.Interfaces.PlayerInterface;
import java.io.Serializable;
import java.util.ArrayList;
public class Deck implements Serializable
{
	  private ArrayList<Card> cards;

	    /**
	     * this is the constructor
	     */
	    public Deck()
	    {
	        initDeck();
	    }
	    
	    private void initDeck()
	    {
	        this.cards = new ArrayList<>();
	        this.cards.add(new Card("T1",1));
	        this.cards.add(new Card("T2",5));
	        this.cards.add(new Card("T3",10));
	        this.cards.add(new Card("T4",1));
	        this.cards.add(new Card("T5",5));
	        this.cards.add(new Card("T6",10));
	        this.cards.add(new Card("T7",1));
	        this.cards.add(new Card("T8",5));
	        this.cards.add(new Card("T9",10));
	        this.cards.add(new Card("T10",1));
	        this.cards.add(new Card("T11",1));
	        this.cards.add(new Card("T12",5));
	        this.cards.add(new Card("T13",10));
	        this.cards.add(new Card("T14",1));
	        this.cards.add(new Card("T15",5));
	        this.cards.add(new Card("T16",10));
	        this.cards.add(new Card("T17",1));
	        this.cards.add(new Card("T18",5));
	        this.cards.add(new Card("T19",10));
	        this.cards.add(new Card("T20",1));
	        this.cards.add(new Card("T21",1));
	        this.cards.add(new Card("T22",5));
	        this.cards.add(new Card("T23",10));
	        this.cards.add(new Card("T24",1));
	        this.cards.add(new Card("T25",5));
	        this.cards.add(new Card("T26",10));
	        this.cards.add(new Card("T27",1));
	        this.cards.add(new Card("T28",5));
	        this.cards.add(new Card("T29",10));
	        this.cards.add(new Card("T30",1));
	        this.cards.add(new Card("T31",1));
	        this.cards.add(new Card("T32",5));
	        this.cards.add(new Card("T33",10));
	        this.cards.add(new Card("T34",1));
	        this.cards.add(new Card("T35",5));
	        this.cards.add(new Card("T36",10));
	        this.cards.add(new Card("T37",1));
	        this.cards.add(new Card("T38",5));
	        this.cards.add(new Card("T39",10));
	        this.cards.add(new Card("T40",1));
	        this.cards.add(new Card("T41",10));
	        this.cards.add(new Card("T42",5));
	    }
	    /**
	     * pick a card from a deck of cards
	     * @return card
	     */
	    private Card pickCard()
	    {
	        int cardIndex = DiceRNG.getRandomInt(this.cards.size()-1, 0);
	        return this.cards.get(cardIndex);
	    }
	    
	    /**
	     * grants a card to a player
	     * @param p receiver
	     * @return given card
	     */
	    public Card grantCard(PlayerInterface p)
	    {
	        Card result = this.pickCard();
	        p.addCard(result);
	        return result;
	    }
	    
	    /**
	     * return card into the deck
	     * @param c card to be returned
	     */
	    public void returnCard(Card c)
	    {
	        this.cards.add(c);
	    }
}

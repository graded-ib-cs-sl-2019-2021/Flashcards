/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashcards;

import java.lang.reflect.Array;

/**
 *
 * @author novac
 */
public class Deck {
    private Card[] cards;
    private int topCard = 0;
    private int numCards;
    private final int maxCards = 100;
    
    public Deck() {
        cards = new Card[maxCards];
        numCards = 0;
    }
    
    public void addCard(Card c) {
        if (numCards >= maxCards) {
            System.out.println("no more space");
        }else {
            cards[numCards] = c;
            ++numCards;
        } 
    }
    
    public void next() {
        if (topCard >= numCards - 1) {
            topCard = 0;
        }else {
            ++topCard;
        }
    }
    
    public void prev() {
        if (topCard <= 0) {
            topCard = numCards - 1;
        }else {
            --topCard;
        }
    }
    
    public Card getTopCard() {
        return cards[topCard];
    }

    void shuffle() {
      
        for (int i = 0; i < numCards; i++) {
            int randomNumber = (int) (Math.random() * (numCards));
            Card temp = cards[randomNumber];
            cards[randomNumber]= cards[i];
            cards[i] = temp;
        }
    }

    void goToRandom() {
        topCard = (int)(Math.random() * numCards);      
    }
}

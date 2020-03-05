/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashcards;

/**
 *
 * @author novac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Build our deck
        Deck d = new Deck();
        d.addCard(new Card("hardware",
            "The physical parts of a computer."));
        d.addCard(new Card("software",
            "The set of commands and rules that make a computer do anything."));
        //add more cards
        FlashcardView view = new FlashcardView();
        view.setVisible(true);
    
    }
    
}

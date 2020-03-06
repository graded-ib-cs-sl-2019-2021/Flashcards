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
    private static Deck d;
    private static FlashcardView view;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Build our deck
        d = new Deck();
        d.addCard(new Card("hardware",
            "The physical parts of a computer."));
        d.addCard(new Card("software",
            "The set of commands and rules that make a computer do anything."));
        d.addCard(new Card("abstraction",
                "simplifying to an idea so we can ignore the implementation."));
        //add more cards
        view = new FlashcardView();
        view.setVisible(true);
        view.changeCardText(d.getTopCard().toString());
    }
    
    public static void flipButtonPressed() {
        // update the model 
        Card c = d.getTopCard();
        c.flip();
        // read necessary changes
        String textToShow = c.toString();
        // update the view
        view.changeCardText(textToShow);
    }

    static void prevButtonPressed() {
        // update the model 
        d.prev();
        Card c = d.getTopCard();
        // read necessary changes
        String textToShow = c.toString();
        // update the view
        view.changeCardText(textToShow);
    }

    static void nextButtonPressed() {
         // update the model 
        d.next();
        Card c = d.getTopCard();
        // read necessary changes
        String textToShow = c.toString();
        // update the view
        view.changeCardText(textToShow);
    }
}

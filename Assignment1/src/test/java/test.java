/**
 * Created by nic on 1/20/16.
 */

import models.Card;
import models.Deck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class test {
    @Test
    public void testDeckExists() {
        Deck deck = new Deck();

        assertNotNull(deck);
    }

    @Test
    public void testDeckSize() {
        Deck deck = new Deck();

        assertEquals(52, deck.getCardsRemaining());
    }

    @Test
    public void testDeckCardsCorrect() {
        Deck deck = new Deck();

        for (int i = 0; i < 52; i++) {
            Card card = deck.drawCard();
            System.out.print(card.getRank() + " " + card.getSuit() + " " + card.getColor() + "\n");
        }

        //something something
    }
}
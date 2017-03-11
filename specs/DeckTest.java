import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;

public class DeckTest {

  Suit suit;
  CardNumber cardnumber;
  Card card;
  Deck deck;

  @Before
  public void before(){  
    card = new Card(Suit.values()[0], CardNumber.values()[0]);
    deck = new Deck( CardNumber.values(), Suit.values() );
  }

  @Test
  public void canCreateNewFullDeck(){
    assertEquals(CardNumber.values().length * Suit.values().length, deck.cardCount());
  }

  @Test 
  public void newDeckIsFullOfCards(){
    for (int i=0; i< deck.cardCount(); i++){
      // System.out.println("" + deck.getCardByIndex(i).getSuit() + deck.getCardByIndex(i).getCardNumber());
      assertEquals( deck.getCardByIndex(i).getClass(), Card.class );
    }
  }

  @Test
  public void canShuffleDeck(){
    String signature1 = "";
    String signature2 = "";
    for (int i=0; i< deck.cardCount(); i++) {
      signature1 += deck.getCardByIndex(i).toString();
    }
    deck.shuffle();
    for (int i=0; i< deck.cardCount(); i++) {
      signature2 += deck.getCardByIndex(i).toString();
    }
    assertEquals(false, signature2 == signature1);
  }

}
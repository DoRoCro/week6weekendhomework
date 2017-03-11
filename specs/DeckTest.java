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
    card = new Card(Suit.HEARTS, CardNumber.ACE );
    deck = new Deck( CardNumber.values(), Suit.values() );
  }

  @Test
  public void canCreateNewFullDeck(){
    assertEquals(CardNumber.values().length * Suit.values().length, deck.cardCount());
  }

  // @Test 
  // public void newDeckIsFullOfCards(){
  //   for (i=1; i<= deck.cardCount(); i++)
  //     assertEquals(deck[i].class, Card);
  // }
}
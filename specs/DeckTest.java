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
  }

  @Test
  public void canCreateNewFullDeck(){
    deck = new Deck( CardNumber.values() ,  Suit.values() );
    assertEquals(52, deck.CardCount());
  }
}
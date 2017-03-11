import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;

public class CardTest {

  Card card;
  Suit suit;
  CardNumber cardnumber;

  @Before
  public void before(){  
    card = new Card(Suit.HEARTS, CardNumber.ACE );
  }

  @Test
  public void cardHasSuitAndNumber() {
    assertEquals( Suit.HEARTS ,card.getSuit());
    assertEquals( CardNumber.ACE, card.getCardNumber());

  }

  @Test
  public void cardHasNumberAndSuit() {
    // test for lazy card creation where parameter order doesn't matter
    card = new Card( CardNumber.ACE, Suit.HEARTS );
    assertEquals( Suit.HEARTS ,card.getSuit());
    assertEquals( CardNumber.ACE, card.getCardNumber());
  }

  @Test
  public void cardCanBeDuplicated() {
    card = new Card( CardNumber.ACE, Suit.HEARTS );
    Card card2 = new Card( CardNumber.ACE, Suit.HEARTS );
    assertEquals(true, card2.equals(card));
  }

  @Test
  public void cardHasColour() {
    assertEquals(SuitColour.RED, card.getSuitColour());
  }

  @Test 
  public void cardCanSayName(){
    assertEquals("ACE of HEARTS", card.toString());
  }

}

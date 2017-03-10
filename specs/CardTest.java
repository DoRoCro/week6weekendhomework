import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;

public class CardTest {

  Card card;
  Suit suit;
  CardNumber cardnumber;

  @Before
  // suit = Suit.HEARTS;
  // cardnumber = CardNumber.ACE;

  @Test
  public void cardHasNumberAndSuit() {
    card = new Card(Suit.HEARTS, CardNumber.ACE );
    assertEquals( Suit.HEARTS ,card.getSuit());
    assertEquals( CardNumber.ACE, card.getCardNumber());

  }

  public void cardHasSuitAndNumber() {
    // test for lazy card creation where parameter order doesn't matter
    card = new Card( CardNumber.ACE, Suit.HEARTS );
    assertEquals( Suit.HEARTS ,card.getSuit());
    assertEquals( CardNumber.ACE, card.getCardNumber());

  }

}

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
    assertEquals( CardNumber.ACE, card.getCardnumber());

  }

}

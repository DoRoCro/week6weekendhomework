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
    // creates a string listing  of the deck contents before and after shuffle and compares 
    //  This test is passed with a bad shuffle - e.g. swap two cards only.
    String signature1 = "";
    String signature2 = "";
    for (int i=0; i< deck.cardCount(); i++) {
      signature1 += deck.getCardByIndex(i).toString();
    }
    deck.shuffle();
    for (int i=0; i< deck.cardCount(); i++) {
      signature2 += deck.getCardByIndex(i).toString();
    }
    //
    // Not 100% guaranteed but shuffle matching initial 
    // list very low likelihood for more than a few cards
    // (52 cards would be 1 in 52!  (approx 10^66)),
    // assuming Collections.shuffle() is genuinely random...
    assertEquals(false, signature2 == signature1);
    // System.out.println(signature1);
    // System.out.println(signature2);
  }

  @Test
  public void canDealACard(){
    int cardsBefore = deck.cardCount();
    Card lastcard = deck.getCardByIndex(cardsBefore - 1);
    Card dealt = deck.dealCard();
    int cardsAfter = deck.cardCount();
    // assertEquals("ACE of SPADES" , dealt.toString());  // initial version, generalised in line below
    assertEquals(CardNumber.values()[CardNumber.values().length -1] + " of " + Suit.values()[Suit.values().length - 1] , dealt.toString());      // last card in unshuffled deck has been dealt
    assertEquals(cardsBefore , cardsAfter + 1 );          // deck has lost a card
    assertEquals(lastcard, dealt);                        // need to understand hashCode to see if this works as intended
  }

}
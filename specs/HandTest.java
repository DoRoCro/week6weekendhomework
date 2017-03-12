import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;

public class HandTest {
  Player player1;
  Player player2;
  Hand hand1;
  Hand hand2;
  Card card1;

  @Before
  public void before(){
    player1 = new Player("Lister");
    player2 = new Player("Rimmer");
    hand1 = new Hand(player1);
    hand2 = new Hand(player2);
    card1 = new Card(Suit.HEARTS, CardNumber.QUEEN);
  }

  @Test
  public void handHasNameFromPlayer() {
    assertEquals("Lister", hand1.getName());
    assertEquals("Rimmer", hand2.getName());
  }

  @Test
  public void handReceivesCardFaceDown(){
    hand1.receiveCard(card1);
    assertEquals("QUEEN of HEARTS", hand1.showCardByIndex(0));
  }

  @Test 
  public void canListOutHand(){
    hand1.receiveCard(card1);
    assertEquals("Shown cards: \nHidden cards: QUEEN of HEARTS", hand1.toString());
  }

  @Test
  public void canListOutHandAfterShowing(){
    hand1.receiveCard(card1);
    hand1.showCardByIndex(0);
    assertEquals("Shown cards: QUEEN of HEARTS\nHidden cards: ", hand1.toString());
    
  }

}
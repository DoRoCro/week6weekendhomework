import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;

public class TurnLogTest{
  Player player1;
  Player player2;
  // Game game;
  String player1name = "Zaphod";
  String player2name = "Zarquon";
  String[] players;
  TurnLog logmesg ;
  Card card1;
  Hand hand1;

  @Before
  public void before(){
    player1 = new Player(player1name);
    player2 = new Player(player2name);
    card1 = new Card(Suit.HEARTS, CardNumber.THREE);
    hand1 = new Hand(player1);
  }

  @Test
  public void canAddTurnLog(){
    logmesg = new TurnLog(player1, hand1);
    assertEquals(hand1.getName(), logmesg.getHand(player1).getName() );
  }


}
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
  Card card2;
  Hand hand1;
  Hand hand2;

  @Before
  public void before(){
    player1 = new Player(player1name);
    player2 = new Player(player2name);
    card1 = new Card(Suit.HEARTS, CardNumber.THREE);
    card2 = new Card(Suit.HEARTS, CardNumber.FOUR);
    hand1 = new Hand(player1);
    hand2 = new Hand(player2);
    hand1.receiveCard(card1);
    hand2.receiveCard(card2);
  }

  @Test
  public void canAddTurnLog(){
    logmesg = new TurnLog(player1, hand1);
    assertEquals(hand1.getName(), logmesg.getHand(player1).getName() );
  }

  // @Test public void canGetPlayerFromTurnLog() {
  //   logmesg = new TurnLog(player1, hand1);
  //   assertEquals(player1.getName(), logmesg.getPlayer().getName())


  // }
  // @Test
  // public void canGetTurnLogBack() {
  //   logmesg = new TurnLog(player1, hand1);
  //   logmesg.addToLog();
  //   logmesg = new TurnLog(player2, hand2);
  //   logmesg.addToLog();
  //   TurnLog retrieved = TurnLog.getLastLog();
  //   assertEquals(logmesg.getHand(player2).getName(), retrieved.getHand(player2).getName());

  // }

}
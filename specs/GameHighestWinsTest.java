import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;
import org.mockito.*;
import static org.mockito.Mockito.*;


public class GameHighestWinsTest {
  Deck deck;
  Player player1;
  Player player2;
  Hand hand1;
  Hand hand2;
  GameHighestWins game;
  String player1name = "Zaphod";
  String player2name = "Zarquon";
  String[] players;
  TurnLog turnlog;
  TurnLog mockLog;
  Viewer viewer;
  Viewer mockViewer;   


  @Before
  public void before(){  
    Viewer mockViewer = mock(Viewer.class);
    TurnLog mockLog = mock(TurnLog.class);
    players = new String[2];
    players[0] = player1name;
    players[1] = player2name;
    turnlog = new TurnLog();
  }

  @Test
  public void checkGameHas2Players(){
    game = new GameHighestWins( turnlog, mockViewer );
    assertEquals(2, game.players.length);
  }

  @Test
  public void checkGamePlayer1GetsName(){
    game = new GameHighestWins( mockLog, mockViewer );
    game.setup();
    // Mockito.when(spyDice.roll()).thenReturn(3);
    // Mockito.when(mockViewer.getPlayerName()).thenReturn("mocked");
    
    // System.out.println(game.players[0].getName());
    // System.out.println(game.players[1].getName());
    assertEquals("StringFromSetup", game.players[0].getName());
  }

  @Test
  public void checkTurnGetsCard(){
    // works as long as deck has not been shuffled
    game = new GameHighestWins( mockLog, mockViewer );
    game.setup();
    game.round();
    // System.out.println(game.hands[0].toString());
    assertEquals( "Shown cards: ACE of SPADES\nHidden cards: " , game.hands[0].toString());
    assertEquals( "Shown cards: KING of SPADES\nHidden cards: " , game.hands[1].toString());
  }

  @Test
  public void checkTurnGetsDifferentCardAfterShuffle(){
    // works 51/52 times? 
    game = new GameHighestWins( mockLog, mockViewer );
    game.setup();
    game.shuffleDeck();
    game.round();
    // System.out.println(game.hands[0].toString());
    assertNotEquals( "Shown cards: ACE of SPADES\nHidden cards: " , game.hands[0].toString());
    assertNotEquals( "Shown cards: KING of SPADES\nHidden cards: " , game.hands[1].toString());
  }  

  @Test
  public void checkScoresEndRound(){
    game = new GameHighestWins( mockLog, mockViewer );
    game.setup();
    // game.shuffleDeck();
    game.round();
  }


}

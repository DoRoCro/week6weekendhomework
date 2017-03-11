import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;

public class HandTest {
  Player player1;
  Player player2;
  Hand hand1;
  Hand hand2;

  @Before
  public void before(){
    player1 = new Player("Lister");
    player2 = new Player("Rimmer");
    hand1 = new Hand(player1);
    hand2 = new Hand(player2);
  }

  @Test
  public void handHasNameFromPlayer() {
    assertEquals("Lister", hand1.getName());
  }
}
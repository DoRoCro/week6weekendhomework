import static org.junit.Assert.*;
import org.junit.*;
import cardgame.*;

public class PlayerTest {
  Player player1;
  Player player2;

  @Before
  public void before(){
    player1 = new Player("Lister");
    player2 = new Player("Rimmer");
  }

  @Test
  public void playerHasName() {
    assertEquals("Lister", player1.getName());
  }



}



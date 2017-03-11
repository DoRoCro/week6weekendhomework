package cardgame;
import java.util.ArrayList;
import java.util.*;

public class Hand implements PlayerAttribs {

  // Hand represents a player's card holding
  // cards which can be shown or hidden
  private ArrayList<Card> hand;
  private Player player;

  public Hand(Player player){
    this.player = player;
    hand = new ArrayList<Card>();
  }

  public String getName() {
    return this.player.getName();
  }
}
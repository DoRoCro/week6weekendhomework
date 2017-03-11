package cardgame;
import java.util.ArrayList;
import java.util.*;

public class Hand implements PlayerAttribs {

  // Hand represents a player's card holding
  // cards which can be shown or hidden
  // cards are received and held FACEDOWN (i.e. hidden) by default
  // A hand therefore consists of two lists, visible and hidden cards.

  private ArrayList<Card> faceups;
  private ArrayList<Card> facedowns;
  private Player player;

  public Hand(Player player){
    this.player = player;
    this.faceups = new ArrayList<Card>();
    this.facedowns = new ArrayList<Card>();
  }

  public String getName() {
    return this.player.getName();
  }

  public void receiveCard( Card card ){
    this.facedowns.add(card);
  }

  public String showCardByIndex(int index){
    // move card from facedowns to end of faceups
    // and return card face details
    this.faceups.add( this.facedowns.remove(index) );
    return this.faceups.get(this.faceups.size() - 1 ).toString();
  }
}
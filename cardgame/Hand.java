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

  public String toString(){
    // return string listing contents of hand
    String holding = "Shown cards:";
    for ( Card faceup: faceups){
      holding += " " + faceup.toString();
    }
    holding += "\nHidden cards:";
    for ( Card facedown: facedowns){
      holding += " " + facedown.toString();
    }
    // System.out.println(holding);    // debug line
    return holding;
  }

  public Card topShownCard(){
    return this.faceups.get(faceups.size() - 1);
  }

  public Boolean equals(Hand handtocompare ){
      System.out.println("got here");
      System.out.println("Object" + this );
      System.out.println("param" + handtocompare );
    if (this.player == handtocompare.player &&
        this.faceups == handtocompare.faceups &&
        this.facedowns == handtocompare.faceups){
      return true;
    }
    else{
      return false;
    }
  }
}
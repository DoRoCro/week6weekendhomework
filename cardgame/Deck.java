package cardgame;
import java.util.ArrayList;

public class Deck{

  private ArrayList<Card> deck;

  public Deck(CardNumber[] faces, Suit[] suits){
    deck = new ArrayList<Card>();

  }


  public int cardCount(){
    return 52;
  }  
}
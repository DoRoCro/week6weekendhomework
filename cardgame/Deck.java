package cardgame;
import java.util.ArrayList;
import java.util.*;

public class Deck{
  // Description
  // Container for Cards addressable by index.  Created by passing 
  //  in enums of CardNumber and Suit to generate all combinations and store in ArrayList
  // Uses  1-based indexing to leave deck[0] for temporary use, e.g. card swaps.

  private ArrayList<Card> deck;

  public Deck(CardNumber[] faces, Suit[] suits){
    deck = new ArrayList<Card>();
    for (Suit suit : suits) {
      for ( CardNumber face : faces){
        deck.add( new Card(suit, face)) ;
      }
    }
  }

  public int cardCount(){
    return deck.size();
  }

  public Card getCardByIndex(int index){
    return deck.get(index);
  }  

  public void shuffle(){
    Collections.shuffle(this.deck);
  }

}
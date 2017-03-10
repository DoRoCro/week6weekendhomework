package cardgame;

import java.util.ArrayList; 

public class Card {

  private Suit suit;
  private CardNumber cardnumber;

  public Card(Suit suit, CardNumber cardnumber) {
    this.suit = suit;
    this.cardnumber = cardnumber;
  }

  public Suit getSuit(){
    return this.suit;
  }
  public CardNumber getCardnumber(){
    return this.cardnumber;
  }

}
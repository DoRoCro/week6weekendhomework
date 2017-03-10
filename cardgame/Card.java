package cardgame;

import java.util.ArrayList; 

public class Card {

  private Suit suit;
  private CardNumber cardnumber;

  public Card(Suit suit, CardNumber cardnumber) {
    this.suit = suit;
    this.cardnumber = cardnumber;
  }

  public Card( CardNumber cardnumber, Suit suit) {
    this(suit, cardnumber);
  }

  public Suit getSuit(){
    return this.suit;
  }
  public CardNumber getCardNumber(){
    return this.cardnumber;
  }

}
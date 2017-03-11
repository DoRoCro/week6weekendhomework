package cardgame;

import java.util.ArrayList; 

public class Card {
  //  Description
  //  Representation of a playing card with two basic characteristics,
  //  such as suit and card number (or rank, sequence etc)
  // including (and originally designed to cover) standard deck of playing cards
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

  public SuitColour getSuitColour(){
    return this.suit.colour();
  }

  // @Override
  public Boolean equals(Card card){
    if (card instanceof Card) 
      return (this.suit == card.getSuit() && this.cardnumber == card.getCardNumber()); 
    else 
      return false;
  }
  // @Override
  // public int hashCode();{
  //   return hash(this.suit, this.cardnumber);
  // }

  public String toString(){
    return "" + this.cardnumber + " of " + this.suit;
  }

}
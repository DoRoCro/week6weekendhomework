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


}
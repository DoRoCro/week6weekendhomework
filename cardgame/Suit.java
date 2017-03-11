package cardgame;

public enum Suit {
  DIAMONDS (SuitColour.RED),
  CLUBS    (SuitColour.BLACK),
  HEARTS   (SuitColour.RED),
  SPADES   (SuitColour.BLACK);

  private final SuitColour colour;

  Suit(SuitColour colour){
      this.colour = colour;
  }

  public SuitColour colour(Suit suit){
    return suit.colour;
  }

  public SuitColour colour(){
    return this.colour;
  }
}
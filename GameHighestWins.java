package cardgame;
public class GameHighestWins implements GameController {
    public Player[] players;
    Deck[] decks;

  public Game(int numdecks, String[] playernames){
    this.decks = new Deck[numdecks];
    int i = 0;
    for (Deck deck : this.decks){
      this.decks[i] = new Deck(CardNumber.values(), Suit.values());
    }
    this.players = new Player[playernames.length];
    i = 0;
    for(String name : playernames ){
      this.players[i] = new Player( playernames[i] );
      i++;
    }
  }

  
  // public void turn(TurnLog turnlog);   // each player gets a turn in a round
  // public void round();  // in a round, each player has a turn in order
  // public Boolean isWon();  // winning condition
  // public Boolean isOver(); // non-winning end condition
  // public void viewer();    // MVC viewer
  // public void turnLog();   // something for the viewer to show...

  public void run(){};
}


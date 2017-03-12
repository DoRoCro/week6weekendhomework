package cardgame;
public class GameHighestWins implements GameController {
    public Player[] players;
    Deck deck;
    public Hand[] hands;
    public TurnLog turnlog;
    public Viewer viewer;

  public GameHighestWins(TurnLog turnlog, Viewer viewer){
    // uses single deck
    this.deck = new Deck(CardNumber.values(), Suit.values());
    // has 2 players
    this.players = new Player[2];
    // each player has a Hand
    this.hands = new Hand[2];
    this.turnlog = turnlog;
    this.viewer = viewer;
  }
  
  public void setup(){
    // create two players and two hands.  
    // not very OOP at the moment, hand and player only related by index in Array
    for (int i=0; i < this.players.length; i++ ){
      System.out.println("player " + i);
      System.out.println("players.length " + players.length);
      // this.players[i] = new Player(viewer.getPlayerName());
      this.players[i] = new Player("StringFromSetup");
      this.hands[i] = new Hand(this.players[i]);
      System.out.println("player" + this.players[i].getName());
    }
  }

  public void round(){
    // each player takes a turn
    for (Player player : players){
      this.turn(player);
    }
    // any end round logic
  }
  
  public void turn(Player player){
    // player.hand().receiveCard(deck.dealCard());
  }


  public Boolean isWon(){
    return false;
  }

  public Boolean isOver(){
    return false;
  }


  // public Boolean isWon();  // winning condition
  // public Boolean isOver(); // non-winning end condition
  // public void viewer();    // MVC viewer
  // public void turnLog();   // something for the viewer to show...

  public void run(){
    this.deck.shuffle();
    while (! this.isOver() && ! this.isWon() ){
      this.round();

    }
  };
}

// public static void main(String[] args) {
//   TurnLog turnlog = new TurnLog();
//   GameHigheseWins game = new GameHighestWins();
//   game.setup();
//   game.run(); 
// }

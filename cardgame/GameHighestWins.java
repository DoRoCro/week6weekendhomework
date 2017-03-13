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
      // System.out.println("player " + i);
      // System.out.println("players.length " + players.length);
      // this.players[i] = new Player(viewer.getPlayerName());
      this.players[i] = new Player("StringFromSetup");  // debug due to problems with viewer... 
      this.hands[i] = new Hand(this.players[i]);
      // System.out.println("player" + this.players[i].getName());
    }
  }

  public void shuffleDeck(){
    this.deck.shuffle();
  }


  public void round(){
    // each player takes a turn
    // for (Player player : players){  // wanted to use this, but ran out of time to refactor to make it work
    for (int i=0; i < this.players.length; i++ ){
      this.turn(players[i], hands[i]);
    }
    // any end round logic
    // player show cards, work out who wins round
    Integer[] scores = new Integer[2];
    for (int i=0; i < this.players.length; i++ ){
      scores[i] = determineScore(hands[i]);
    }
    if (scores[0] == scores[1]){
      // drawn round
      // do nothing
    } 
    else if (scores[0] > scores[1]) {
      // player1 wins round
      players[0].setScore(players[0].getScore() + 1);
    }
    else {
      // player2 wins round
      players[1].setScore(players[1].getScore() + 1);

    }
  }
    
  private int determineScore(Hand hand){
    int result;
    Card card = hand.topShownCard();
    result = card.getCardNumber().score();
    return result;
  }
  
  public void turn(Player player, Hand hand){
    // player receives card from deck, and shows it
    hand.receiveCard(deck.dealCard());
    hand.showCardByIndex(0);
    // update turnlog here when working
  }


  public Boolean isWon(){
    return false;
  }

  public Boolean isOver(){
    if (deck.cardCount() < 2){
      return true;
    }
    return false;
  }


  // public Boolean isWon();  // winning condition
  // public Boolean isOver(); // non-winning end condition
  // public void viewer();    // MVC viewer
  // public void turnLog();   // something for the viewer to show...

  public void run(){
    this.deck.shuffle();
    int i = 0;
    while (! this.isOver() && ! this.isWon() ){
      i++;
      this.round();
      System.out.println("Round: " + i);
      System.out.println("Player 1 Hand " + hands[0].toString());
      System.out.println("Player 2 Hand " + hands[1].toString());
      System.out.println("Scores: Player 1=" + players[0].getScore() + "  Player 2="+ players[1].getScore());

    }
    System.out.println("Final Scores: Player1 =" + players[0].getScore() + " Player2 ="+ players[1].getScore());
  }

}


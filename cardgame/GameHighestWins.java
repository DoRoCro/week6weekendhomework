// package cardgame;
// public class GameHighestWins implements GameController {
//     public Player[] players;
//     Deck deck;

//   public GameHighestWins(TurnLog turnlog){
//     this.deck = new Deck(CardNumber.values(), Suit.values());
//     this.players = new Player[2];
//     }
//   }

//   public void round(){
//     for (Player player : players){
//       this.turn(player);
//     }
//     // any end round logic
//   }
  
//   public void turn(Player player){
//     player.hand.receiveCard(deck.deal);
//     player.setScore(hand);
//   }


//   public Boolean isWon(){


//   }

//   public Boolean isOver(){


//   }


//   // public Boolean isWon();  // winning condition
//   // public Boolean isOver(); // non-winning end condition
//   // public void viewer();    // MVC viewer
//   // public void turnLog();   // something for the viewer to show...

//   public void run(){
//     game.deck.shuffle();
//     while (! game.isOver() && ! game.isWon() ){
//       this.round()

//     }
//   };
// }

// public static void main(String[] args) {
//   turnlog = new TurnLog();
//   game = new GameHighestWins();
//   game.run(); 
// }

package cardgame;
class GameA{
  public static void main(String[] args) {
    TurnLog turnlog = new TurnLog();
    Viewer viewer = new Viewer();
    GameHighestWins game = new GameHighestWins(turnlog, viewer);
    game.setup();
    game.run(); 
  }
}
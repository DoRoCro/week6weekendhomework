package cardgame;

public class Player implements PlayerAttribs {

  private String name;
  private int score;

  public Player(String name){
    this.name = name;
    this.score = 0;
  }

  public String getName(){
    return this.name;
  }

  public int getScore(){
    return this.score;
  }

  // public Hand getHand(){
  //   return ;
  // }

}
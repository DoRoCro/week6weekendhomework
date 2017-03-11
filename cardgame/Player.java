package cardgame;

public class Player implements PlayerAttribs {

  private String name;

  public Player(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

}
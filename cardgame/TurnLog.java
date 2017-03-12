package cardgame;
import java.util.ArrayList;
import java.util.*;

public class TurnLog{

  public static ArrayList<HashMap> log;
  public HashMap<Player, Hand> logentry;

  public TurnLog(Player player, Hand hand){
    this.logentry = new HashMap<Player, Hand>();
    this.logentry.put(player, hand);
  }

  public Hand getHand(Player player1){
    return new Hand(player1);
  }

  public void updateLogHistory(HashMap entry){
    log.add(entry);
  }



}
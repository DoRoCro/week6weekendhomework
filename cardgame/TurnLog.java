package cardgame;
import java.util.ArrayList;
import java.util.*;

public class TurnLog{

  public static ArrayList<HashMap> log;
  public HashMap<Player, Hand> logentry;

  public static void TurnLog(){
    log = new ArrayList<HashMap>();
  }

  public void newLogEntry(Player player, Hand hand){
    logentry = new HashMap<Player, Hand>();
    logentry.put(player, hand);
    this.log.add(logentry);
  }

  public Hand getHand(Player player1){
    return new Hand(player1);
  }

  // public Player getPlayer(){
  //   return this.logentry.keySet().toArray()[0];
  // }

  public void addToLog(){
    log.add(this.logentry);
  }

  // public static TurnLog getLastLog(){
  //   HashMap<Player,Hand> lastlog = log.get(log.size()-1);
  //   return new TurnLog( lastlog.keySet().toArray()[0], lastlog.values().toArray()[0]);
  // }



}
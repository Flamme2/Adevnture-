package UI;
import java.util.*;
public class GameData {
  public Hashtable<Character, String> setDirection(){
    Hashtable<Character, String>cmd = new Hashtable<Character, String>();
    cmd.put('n',"north");
    cmd.put('s',"south");
    cmd.put('w',"west");
    cmd.put('e',"east");

    return cmd;
  }


  public String getGameInfo() {
    String text = "You can go in Four direction:"+
        "North, South, West, East";
    return text;
  }
}

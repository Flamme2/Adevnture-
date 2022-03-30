package RoomCreation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Room {
  private String name;
  private String description;
  public List<Room> _directions;

  public Room north;
  public Room south;
  public Room west;
  public Room east;


  public Room() {
    super();
  }
  public Room(String _name, String _description){
    this.name = _name;
    this.description = _description;
  }
  public Room(String _name, String _description, List<Room> directions)
  {
    this.name = _name;
    this.description = _description;
    this._directions = directions;
    directions = new ArrayList<Room>();

  }


  public String getName(){
    return name;
  }

  public String getDescription(){
    return description;
  }


  @Override
  public String toString() {
    return this.name;
  }

  public void getMap() {
    System.out.println("MAP LAYOUT:");
    System.out.println();

    MapData ContextMap = new MapData();

    Room[][] map = new Room[3][3];
    List<Room> labyrinth = ContextMap.GetRoomLst();

    Iterator<Room> iterator = null;
    iterator = labyrinth.listIterator();

    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map.length; j++){
        map[i][j] = iterator.next();
      }
    }
    for (Room[] ints : map) {
      System.out.println(Arrays.toString(ints));
    }
    System.out.println();
  }

  public Room setWest(Room val) {
    return this.west = val;
  }
  public Room getNorth(){
    return this.north;
  }

  public Room setNorth(Room val) {
    return this.north = val;
  }

  public Room setEast(Room val) {
    return this.east = val;
  }

  public Room setSouth(Room val) {
    return this.south = val;
  }
  public Room getSouth(){
    return this.south;
  }
}




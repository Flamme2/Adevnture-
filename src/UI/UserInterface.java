
package UI;

//import UserInterface.*;
import RoomCreation.MapData;
import RoomCreation.Room;

import java.util.*;

public class UserInterface {

  GameData data;
  Room currentRoom;
  Hashtable<Character, String> dataValue;
  GameOption option;
  MapData directions ;

  List<Room> roomLst;
  boolean connected;
  boolean roomIsEmpty;
  Scanner sc = new Scanner(System.in);

  public UserInterface() {
    super();
    data = new GameData();
    currentRoom = new Room();
    dataValue = data.setDirection();
    directions = new MapData();
    roomLst = directions.GetRoomLst();
    connected = false;
    roomIsEmpty = true;


  }



  public void getDirection(){
    currentRoom = roomLst.get(0);
    //populate the data with direction mapping to n,s,w,e
    System.out.println("You start in Room 1 ");

    System.out.print("Choose between {exit,help,look}");
    String val = sc.nextLine();
    getCommand(val);
    System.out.println();
    while (!Objects.equals(currentRoom.getName(), "room5")){
      System.out.print("ENTER your new Direction: ");
      String dirValue = sc.nextLine();
      Character input = dirValue.charAt(0);
      if (dataValue.containsKey(input)){
        String retVal = dataValue.get(input);
        System.out.println("going "+retVal );
        IsConnected(input);
        System.out.println();

        /*
        switch (retVal) {
          case "north" -> currentRoom.north = currentRoom = roomLst.get(0);
          case "east" -> currentRoom.east = currentRoom = roomLst.get(1);
        }

         */
      }





    }




  }
  private void getCommand(String val) {
    switch(val){
      case "exit":
        System.out.println("afbryde spillet helt, og afslutte programmet");
        break;
      case "help":
        System.out.println("få en instruktion og oversigt over mulige kommandoer");
        break;
      case "look":
        System.out.println("looking around ...");
        System.out.println("you are inside: "+ currentRoom.getName());
        System.out.println(currentRoom.getDescription());
        break;
    }
  }



  private boolean IsConnected(Character val){
    String tempVal = dataValue.get(val);
    switch (tempVal){
      case "north":
        boolean Northconnected = isNorthDirClosed(currentRoom);
        return Northconnected;
      case "south":
        boolean Southconnected = isSouthDirClosed(currentRoom);
        return  Southconnected;
      case "east":
        boolean Eastconnected = isEastDirClosed(currentRoom);
        return Eastconnected;
      case "west":
        boolean Westconnected = isWestDirClosed(currentRoom);
        return Westconnected;
    }
    return true;
  }

  private boolean isNorthDirClosed(Room input) {
    if (roomLst.contains(input)) {
      if (input.north == null) {
        System.out.println("north of " + input.getName() + " is closed!");
        roomIsEmpty = true;
      } else {
        System.out.println("north of " + input.getName() + " is Open!");
        roomIsEmpty = false;
      }
    }
    return roomIsEmpty;
  }

  private boolean isSouthDirClosed(Room input) {
    if (roomLst.contains(input)) {
      if (input.south == null) {
        System.out.println("south of " + input.getName() + " is closed!");
        roomIsEmpty = true;
      } else {
        System.out.println("south of " + input.getName() + " is Open!");
        roomIsEmpty = false;
      }
    }
    return roomIsEmpty;
  }

  private boolean isEastDirClosed(Room input) {
    if (roomLst.contains(input)) {
      if (input.east == null) {
        System.out.println("east of " + input.getName() + " is closed!");
        roomIsEmpty = true;
      } else {
        System.out.println("east of " + input.getName() + " is Open!");

        currentRoom = roomLst.get(1);
        System.out.println("You are now in " + currentRoom);

        roomIsEmpty = false;
      }
    }
    return roomIsEmpty;
  }

  private boolean isWestDirClosed(Room input) {
    if (roomLst.contains(input)) {
      if (input.west == null) {
        System.out.println("west of " + input.getName() + " is closed!");
        roomIsEmpty = true;
      } else {
        System.out.println("west of " + input.getName() + " is Open!");
        roomIsEmpty = false;
      }
    }
    return roomIsEmpty;
  }


}






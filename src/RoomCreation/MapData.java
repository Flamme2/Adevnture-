package RoomCreation;

import java.util.*;

  //GRASP .
  public class MapData {

    private Room startRoom;


    Room room1 = new Room("room1", "You are now in a place full of bat");
    Room room2 = new Room("room2", "you are now in a place full of sand" );
    Room room3 = new Room("room3", "make sure you dont drown");
    Room room4 =new Room("room4", "its sticky and dark");
    Room room5 =new Room("room5","this rooom is fuul of life, so much that you are scared");
    Room room6 =new Room("room6","fell like you are passing through a dark hole");
    Room room7 =new Room("room7","can you hear that , you can hear them but not see them");
    Room room8 =new Room("room8","this room is full of life");
    Room room9 =new Room("room9","still you need light to see");

    Room getStartRoom() {
      return startRoom;
    }
    public List<Room> GetRoomLst(){
      List<Room> tempLst = new ArrayList<>();
      getRoomConnections();
      tempLst.add(room1);
      tempLst.add(room2);
      tempLst.add(room3);
      tempLst.add(room4);
      tempLst.add(room5);
      tempLst.add(room6);
      tempLst.add(room7);
      tempLst.add(room8);
      tempLst.add(room9);

      return tempLst;
    }
    public void getRoomConnections(){
      // connection room1
      //List<Room> room1Connect = new ArrayList<>();
      room1.setNorth (null);
      room1.setEast (room2);
      room1.setSouth (room4);
      room1.setWest (null);

      // connection room2
      //List<Room> room2Connect = new ArrayList<>();
      room2.setNorth (null);
      room2.setEast (null);
      room2.setSouth (room1);
      room2.setWest (room3);

//connection room3
      //List<Room> room3Connect = new ArrayList<>();
      room3.setNorth (null);
      room3.setEast (null);
      room3.setSouth (room2);
      room3.setWest (room6);

      //connection room4
      //List<Room> room4Connect = new ArrayList<>();
      room4.setNorth (null);
      room4.setEast (null);
      room4.setSouth (room1);
      room4.setWest (room7);

      //connection room5
      //List<Room> room5Connect = new ArrayList<>();
      room5.setNorth (null);
      room5.setEast (null);
      room5.setSouth (null);
      room5.setWest (room8);

      //connection room6
      //List<Room> room6Connect = new ArrayList<>();
      room6.setNorth (null);
      room6.setEast (null);
      room6.setSouth (room3);
      room6.setWest (room9);

//connection room7
      //List<Room> room7Connect = new ArrayList<>();
      room7.setNorth (null);
      room7.setEast (null);
      room7.setSouth (room4);
      room7.setWest (room8);

      //connection room8
      //List<Room> room8Connect = new ArrayList<>();
      room8.setNorth (null);
      room8.setEast (room7);
      room8.setSouth (room5);
      room8.setWest (room9);

      //connection room9
      //List<Room> room9Connect = new ArrayList<>();
      room9.setNorth (null);
      room9.setEast (null);
      room9.setSouth (room8);
      room9.setWest (room6);
      
    }
  }


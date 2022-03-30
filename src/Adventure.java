import RoomCreation.*;

import UI.*;

public class Adventure
{
  public static void main(String[] args)
  {
    Room currentRoom = new Room();
    Room map = new Room();
    initialize();

    // draw map
    map.getMap();

    // START THE GAME
    startGame();
    System.out.println();
  }


  private static void initialize() {
    System.out.println("                  _                          ");
    System.out.println(" ___ ___ ___    _| |_ _ ___ ___ ___ ___ ___  ");
    System.out.println("|  _| . | . |  | . | | |   | . | -_| . |   | ");
    System.out.println("|_| |  _|_  |  |___|___|_|_|_  |___|___|_|_| ");
    System.out.println("    |_| |___|              |___|             ");
    System.out.println("		     Made with ♥ by, Flavie Mahilyves");
    System.out.println();
    System.out.println("WELCOME PLAYER !");
    System.out.println();
    System.out.println("STORY:");
    System.out.println("The legend has it that there exist a TREASURE");
    System.out.println(", inside the center of this labyranth. Thus  ");
    System.out.println("No one has ever reached it!! Some say it lures");
    System.out.println("with terifying Monsters.                     ");
    System.out.println();
    System.out.println("do you Think YOU GOT what it takes??          ");
    System.out.println("If yes, then PLAY!");
    System.out.println();
    System.out.println();
    System.out.println("BEGIN !!!");

  }

  private static void startGame(){
    UserInterface Input = new UserInterface();
    Input.getDirection();
  }


}
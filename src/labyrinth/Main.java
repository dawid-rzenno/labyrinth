package labyrinth;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    Map map = new Map();

    map.print();

    while (true) {
      System.out.println("Current player position: " + map.player.x + ", " + map.player.y + ".");

      switch(System.in.read()) {
        case 'w':
          map.movePlayerUp();
          break;
        case 's':
          map.movePlayerDown();
          break;
        case 'a':
          map.movePlayerLeft();
          break;
        case 'd':
          map.movePlayerRight();
          break;
        default:
          return;
      }

      map.print();
    }
  }
}

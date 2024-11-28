package labyrinth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Map {

  private final int xSize = 32;
  private final int ySize = 32;

  private final char[][] map = new char[xSize][ySize];
  final Player player = new Player(1, 1);

  public Map() {
    try {
      File mapFile = new File("map.txt");
      Scanner scanner = new Scanner(mapFile);

      int i = 0;
      while (scanner.hasNextLine()) {
        map[i] = scanner.nextLine().toCharArray();
        i++;
      }

      scanner.close();

    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
    }
  }

  private boolean isEmptyOnXY(int x, int y) {
    return map[y][x] == ' ';
  }

  public void movePlayerUp() {
    int newYPosition = this.player.y - 1;

    if (newYPosition >= 0 && newYPosition <= ySize && this.isEmptyOnXY(this.player.x, newYPosition)) {
      this.player.goUp();
    }
  }

  public void movePlayerDown() {
    int newYPosition = this.player.y + 1;

    if (newYPosition >= 0 && newYPosition <= ySize && this.isEmptyOnXY(this.player.x, newYPosition)) {
      this.player.goDown();
    }
  }

  public void movePlayerLeft() {
    int newXPosition = this.player.x - 1;

    if (newXPosition >= 0 && newXPosition <= xSize && this.isEmptyOnXY(newXPosition, this.player.y)) {
      this.player.goLeft();
    }
  }

  public void movePlayerRight() {
    int newXPosition = this.player.x + 1;

    if (newXPosition >= 0 && newXPosition <= xSize && this.isEmptyOnXY(newXPosition, this.player.y)) {
      this.player.goRight();
    }
  }

  public void print() {

    for (int mapY = 0; mapY < map.length; mapY++) {

      if (mapY == player.y) {
        map[mapY][player.x] = Player.Symbol;

        System.out.println(map[mapY]);
      } else {
        System.out.println(map[mapY]);
      }
    }
  }
}
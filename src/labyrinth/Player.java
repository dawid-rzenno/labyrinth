package labyrinth;

public class Player {
  int x;
  int y;

  static final char Symbol = '&';

  public Player(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void goUp() {
    y--;
  }

  public void goDown() {
    y++;
  }

  public void goLeft() {
    x--;
  }

  public void goRight() {
    x++;
  }
}

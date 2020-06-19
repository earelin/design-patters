package org.earelin.design.patterns.commons;

import static org.earelin.design.patterns.commons.Direction.EAST;
import static org.earelin.design.patterns.commons.Direction.NORTH;
import static org.earelin.design.patterns.commons.Direction.SOUTH;
import static org.earelin.design.patterns.commons.Direction.WEST;

public final class MazeGame {
  public static Maze createMaze() {
    Maze maze = new Maze();
    Room r1 = new Room(1);
    Room r2 = new Room(2);
    Door theDoor = new Door(r1, r2);

    maze.addRoom(r1);
    maze.addRoom(r2);

    r1.setSide(NORTH, new Wall());
    r1.setSide(EAST, theDoor);
    r1.setSide(SOUTH, new Wall());
    r1.setSide(WEST, new Wall());

    r2.setSide(NORTH, new Wall());
    r2.setSide(EAST, new Wall());
    r2.setSide(SOUTH, new Wall());
    r2.setSide(WEST, theDoor);

    return maze;
  }

  private MazeGame() {}
}

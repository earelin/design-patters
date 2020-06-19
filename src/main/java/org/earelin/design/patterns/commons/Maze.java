package org.earelin.design.patterns.commons;

import java.util.HashMap;
import java.util.Map;

public class Maze {
  private Map<Integer, Room> rooms = new HashMap<>();

  public void addRoom(Room room) {
    rooms.put(room.getId(), room);
  }

  public Room getRoomById(int id) {
    return rooms.get(id);
  }
}

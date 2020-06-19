package org.earelin.design.patterns.commons;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

public class Room implements MapSite {

  @Getter
  private final int id;
  private Map<Direction, MapSite> sides = new HashMap<>();

  public Room(int id) {
    this.id = id;
  }

  public MapSite getSide(Direction direction) {
    return sides.get(direction);
  }

  public void setSide(Direction direction, MapSite site) {
    sides.put(direction, site);
  }

  @Override
  public void enter() {

  }
}

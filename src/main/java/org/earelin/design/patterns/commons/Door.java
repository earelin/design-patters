package org.earelin.design.patterns.commons;

public class Door implements MapSite {

  private final Room roomDoorIn;
  private final Room roomDoorOut;
  private boolean open = false;

  protected Door(Room roomDoorIn, Room roomDoorOut) {
    this.roomDoorIn = roomDoorIn;
    this.roomDoorOut = roomDoorOut;
  }

  public Room otherSideFrom(Room room) {
    if (roomDoorIn.equals(room)) {
      return roomDoorOut;
    }
    if (roomDoorOut.equals(room)) {
      return roomDoorIn;
    }
    return null;
  }

  @Override
  public void enter() {

  }
}

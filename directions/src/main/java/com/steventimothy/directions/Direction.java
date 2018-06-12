package com.steventimothy.directions;

public enum Direction {
  NORTH("North"),
  EAST("East"),
  SOUTH("South"),
  WEST("West");

  private String direction;

  Direction(String direction) {
    this.direction = direction;
  }

  public String getDirection() {
    return direction;
  }
}

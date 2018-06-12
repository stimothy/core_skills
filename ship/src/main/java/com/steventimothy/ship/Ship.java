package com.steventimothy.ship;

public class Ship {
  private String name;
  private double length;
  private int capacity;
  private ShipType type;

  public Ship() {
    this("", 0.0, 0, ShipType.NONE);
  }

  public Ship(String name) {
    this(name, 0.0, 0, ShipType.NONE);
  }

  public Ship(String name, double length) {
    this(name, length, 0, ShipType.NONE);
  }

  public Ship(String name, double length, int capacity) {
    this(name, length, capacity, ShipType.NONE);
  }

  public Ship(String name, double length, int capacity, ShipType type) {
    this.name = name;
    this.length = length;
    this.capacity = capacity;
    this.type = type;
  }
}

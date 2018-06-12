package com.steventimothy.ship;

public enum ShipType {
  NONE("None"),
  BATTLESHIP("Battleship");

  private String shipType;

  ShipType(String shipType) {
    this.shipType = shipType;
  }

  public String getShipType() {
    return this.shipType;
  }
}

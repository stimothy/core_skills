package com.steventimothy.geometry.goodencapsulation;

public class Position {
  private double posX;
  private double posY;

  public Position() {
    this(0, 0);
  }

  public Position(double posX, double posY) {
    this.setPosx(posX);
    this.setPosy(posY);
  }

  public double getPosx() {
    return posX;
  }

  public void setPosx(double posX) {
    this.posX = posX;
  }

  public double getPosy() {
    return posY;
  }

  public void setPosy(double posY) {
    this.posY = posY;
  }
}

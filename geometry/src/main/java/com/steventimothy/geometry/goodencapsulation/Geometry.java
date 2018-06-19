package com.steventimothy.geometry.goodencapsulation;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Geometry implements GeometricFunctions{

  protected final Logger logger = LoggerFactory.getLogger("app.logger");
  protected final Logger logger2 = LoggerFactory.getLogger(Geometry.class);

  private String name;
  private Position position;

  public Geometry() {
    this("NONE", new Position());
  }

  public Geometry(String name, double posX, double posY) {
    this(name, new Position(posX, posY));
  }

  public Geometry(String name, Position position) {
    this.setName(name);
    this.setPosition(position);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Position getPosition() {
    return this.position;
  }

  public void setPosition(double posX, double posY) {
    setPosition(new Position(posX, posY));
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public String printMe() {
    return "Geometry: " + name;
  }
}

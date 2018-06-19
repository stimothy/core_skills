package com.steventimothy.geometry.goodencapsulation;

public class Circle extends Geometry {

  private static final double PI = Math.PI;
  private double radius;

  public Circle() {
    this("", new Position(), 0);
  }

  public Circle(String name, double posX, double posY) {
    this(name, new Position(posX, posY), 0);
  }

  public Circle(String name, Position position) {
    this(name, position, 0);
  }

  public Circle(String name, double posX, double posY, double radius) {
    this(name, new Position(posX, posY), radius);
  }

  public Circle(String name, Position position, double radius) {
    super(name, position);
    this.setRadius(radius);
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    if (radius >= 0) {
      this.radius = radius;
    }
    else {
      logger2.warn("Trying to set negative radius: " + radius + ", defaulting to 0.");
      this.radius = 0;
    }
  }

  @Override
  public double computeArea() {
    return computeArea(radius);
  }

  public static double computeArea(double radius) {
    return PI * Math.pow(radius, 2);
  }

  public double computeCircumference() {
    return computeCircumference(radius);
  }

  public static double computeCircumference(double radius) {
    return 2 * PI * radius;
  }

  @Override
  public String printMe() {
    return "Circle: \n" + super.printMe();
  }
}

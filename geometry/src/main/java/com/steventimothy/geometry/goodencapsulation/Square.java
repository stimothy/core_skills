package com.steventimothy.geometry.goodencapsulation;

public class Square extends Geometry {
  private double width;
  private double height;

  public Square() {
    this("", new Position(), 0, 0);
  }

  public Square(String name, double posX, double posY) {
    this(name, new Position(posX, posY), 0, 0);
  }

  public Square(String name, Position position) {
    this(name, position, 0, 0);
  }

  public Square(String name, double posX, double posY, double width, double height) {
    this(name, new Position(posX, posY), width, height);
  }

  public Square(String name, Position position, double width, double height) {
    super(name, position);
    this.setWidth(width);
    this.setHeight(height);
  }

  public double getWidth() {
    return this.width;
  }

  public void setWidth(double width) {
    if (width >= 0) {
      this.width = width;
    }
    else {
      logger.warn("Trying to set negative width, defaulting to 0.");
      this.width = 0;
    }
  }

  public double getHeight() {
    return this.height;
  }

  public void setHeight(double height) {
    if (height >= 0) {
      this.height = height;
    }
    else {
      logger.warn("Trying to set negative height, defaulting to 0.");
      this.height = 0;
    }
  }

  @Override
  public double computeArea() {
    return computeArea(width, height);
  }

  public static double computeArea(double width, double height) {
    return width * height;
  }

  public double computePerimeter() {
    return computePerimeter(width, height);
  }

  public static double computePerimeter(double width, double height) {
    return (2 * width) + (2 * height);
  }

  @Override
  public String printMe() {
    return "Square: \n" + super.printMe();
  }
}

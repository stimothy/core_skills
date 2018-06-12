package com.steventimothy.geometry.badencapsulation;

public class Square {
  public double width;
  public double height;
  public double posx;
  public double posy;
  public String name;

  public Square() {
    this(0, 0, 0, 0, "");
  }

  public Square(double width, double height, double posx, double posy, String name) {
    this.width = width;
    this.height = height;
    this.posx = posx;
    this.posy = posy;
    this.name = name;
  }

  public double computeArea() {
    return width * height;
  }

  public double computeParemeter() {
    return (2 * width) + (2 * height);
  }
}

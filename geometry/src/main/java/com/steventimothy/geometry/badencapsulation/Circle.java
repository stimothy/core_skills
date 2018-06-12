package com.steventimothy.geometry.badencapsulation;

public class Circle {
  public double radius;
  public double posx;
  public double posy;
  public String name;

  public Circle() {
    this(0, 0, 0, "");
  }

  public Circle(double radus, double posx, double posy, String name) {
    this.radius = radus;
    this.posx = posx;
    this.posy = posy;
    this.name = name;
  }

  public double computeArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  public double computeParemeter() {
    return 2 * Math.PI * radius;
  }
}

package com.steventimothy.geometry;

import java.util.ArrayList;
import java.util.List;

import com.steventimothy.geometry.goodencapsulation.Circle;
import com.steventimothy.geometry.goodencapsulation.Geometry;
import com.steventimothy.geometry.goodencapsulation.Square;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    Geometry geo = new Square();
    Geometry geo2 = new Circle();

    List<Geometry> geos = new ArrayList<>();
    geos.add(geo);
    geos.add(geo2);

    for (Geometry object : geos) {
      if (object instanceof Square) {
        System.out.println(((Square) object).computePerimeter());
      }
      else if (object instanceof Circle) {
        System.out.println(((Circle) object).computeCircumference());
      }
    }
  }
}

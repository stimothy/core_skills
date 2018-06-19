package com.steventimothy.geometry;

import java.util.ArrayList;
import java.util.List;

import com.steventimothy.geometry.goodencapsulation.Circle;
import com.steventimothy.geometry.goodencapsulation.Geometry;
import com.steventimothy.geometry.goodencapsulation.Square;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
  private static final Logger logger = LoggerFactory.getLogger("app.logger");
  private static final Logger logger2 = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    logger.info("Creating objects....");
    Geometry geo = new Square("Square 1", 0, 0, -5, 5);
    Geometry geo2 = new Circle("Circle 1", 5, 5, 3);
    Geometry geo3 = null;

    try {
      double x = ((Square) geo).getHeight() / ((Square) geo3).getHeight();
      System.out.println(x);
    }
    catch (NullPointerException ex) {
      logger2.error(ex.getMessage());
    }

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

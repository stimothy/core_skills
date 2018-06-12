package com.steventimothy.errorhandling;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    int x = 5;
    int y = 5;

    try {
      x /= 0;
    }
    catch (ArithmeticException ex) {
      System.out.println("Error... You divided by 0.");
       x = 0;
    }

    y /= 0;
  }
}

package com.steventimothy.total_characters;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder();
    for (Integer i = 0; i < Integer.MAX_VALUE; ++i) {
      try {
        str.append(i);
      }
      catch (OutOfMemoryError error) {
        System.out.println("This is how many characters a string can hold: " + i);
        break;
      }
    }
  }
}

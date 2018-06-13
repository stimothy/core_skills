package com.steventimothy.refprim;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    int x = 5;
    Num x2 = new Num(5);
    Num x3 = new Num(5);

    System.out.println(x);
    System.out.println(x2.x);
    System.out.println(x3.x);

    changeValues(x, x2, x3);

    System.out.println();

    System.out.println(x);
    System.out.println(x2.x);
    System.out.println(x3.x);
  }

  private static void changeValues(int x, Num x2, final Num x3) {
    x = 1;
    x2.x = 1;
    //you cant change finals.
    //x3.x = 1.
  }
}

class Num {
  public int x;

  public Num(int x) {
    this.x = x;
  }
}
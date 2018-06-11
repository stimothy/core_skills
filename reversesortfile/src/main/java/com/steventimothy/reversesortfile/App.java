package com.steventimothy.reversesortfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(new File("resources/unsorted.txt"))) {
      ArrayList<String> content = new ArrayList<>();

      while (scanner.hasNextLine()) {
        content.add(scanner.nextLine() + '\n');
      }

      Collections.sort(content);
      Collections.reverse(content);

      try (PrintWriter outputFile = new PrintWriter(new FileWriter("resources/sorted.txt"))) {
        for (String str : content) {
          outputFile.print(str);
        }
      }
      catch (IOException ex) {
        System.out.println(ex.getMessage());
      }

      System.out.println("Done.");
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found.");
    }
  }
}

package com.steventimothy.inheritance.utils;

import java.lang.reflect.Type;

import com.google.gson.Gson;

public class JsonSerializer {
  private static Gson gson = new Gson();

  private JsonSerializer() {
  }

  public static String encode(Object src, Type typeOfSrc) {
    return gson.toJson(src, typeOfSrc);
  }

  public static Object decode(String data, Type typeOfSrc) {
    return gson.fromJson(data, typeOfSrc);
  }
}
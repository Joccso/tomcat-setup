package com.interswitch.json;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayFromCollection {
  public static void createJsonArrayFromCollection() {
    System.out.println("Create JSONArray from a Collection or an Array");
    List<String> list = new ArrayList<>();
    list.add("California");
    list.add("Bayelsa");
    list.add("Delta");
    list.add("Edo");
    JSONArray ja = new JSONArray(list);
    System.out.println(ja);
  }
}

package com.interswitch.json;

import org.json.JSONArray;

public class ArrayFromString {
  public static void createJsonArrayFromJsonString() {
    System.out.println("Create JSONArray from JSON String");
    JSONArray ja = new JSONArray("[true, \"Hello\", 215]");
    System.out.println(ja);
  }
}

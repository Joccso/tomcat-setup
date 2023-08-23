package com.interswitch.json;

import org.json.JSONObject;

public class ObjectFromString {
  public static void createJsonObjectFromJsonString() {
    System.out.println("Creating JSONObject from JSON String");
    JSONObject jo = new JSONObject("{\"name\":\"Jon Doe\",\"city\":\"Chicago\",\"age\":\"22\"}");
    jo = new JSONObject("{name:Jon Doe,city:Chicago,age:22}");
    System.out.println(jo);
  }
}

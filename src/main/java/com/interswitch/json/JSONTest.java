package com.interswitch.json;

import org.json.JSONObject;

public class JSONTest {
  public static void main (String[] args) {
    JSONObject jo = new JSONObject();
    jo.put("name", "Jon Doe");
    jo.put("age", 22);
    jo.put("city", "Chicago");
    System.out.println(jo);
  }
}

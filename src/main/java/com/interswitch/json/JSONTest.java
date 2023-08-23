package com.interswitch.json;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JSONTest {
  public static void main (String[] args) {
    JSONObject jo = new JSONObject();
    jo.put("name", "Jon Doe");
    jo.put("age", 22);
    jo.put("city", "Chicago");
    System.out.println(jo);
    /* Mapping with Json */
    System.out.println("Mapping with Json");
    Map<String, String> map = new HashMap<>();
    map.put("name", "Jon Doe");
    map.put("age", "22");
    map.put("city", "Chicago");
    System.out.println(map);
    JSONObject jo1 = new JSONObject(map);
    System.out.println(jo1);

  }
}

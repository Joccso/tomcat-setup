package com.interswitch.json;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JSONMapping {
  public static void jsonMapping() {
    System.out.println("Mapping with Json");
    Map<String, String> map = new HashMap<>();
    map.put("name", "Jon Doe");
    map.put("age", "22");
    map.put("city", "Chicago");
    System.out.println(map);
    JSONObject jo = new JSONObject(map);
    System.out.println(jo);
  }
}

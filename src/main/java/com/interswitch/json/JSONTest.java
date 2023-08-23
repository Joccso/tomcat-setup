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
    jo = new JSONObject(map);
    System.out.println(jo);
    /* Creating JSONObject from JSON String */
    System.out.println("Creating JSONObject from JSON String");
    jo = new JSONObject("{\"name\":\"Jon Doe\",\"city\":\"Chicago\",\"age\":\"22\"}");
    jo = new JSONObject("{name:Jon Doe,city:Chicago,age:22}");
    System.out.println(jo);
    /* Serialize Java Object to JSON */
    System.out.println("Serialize Java Object to JSON");
    Demo demo = new Demo();
    demo.setId(1);
    demo.setName("Tamara");
    demo.setActive(true);
    jo = new JSONObject(demo);
    System.out.println(jo);
  }
}

package com.interswitch.json;

import org.json.JSONObject;

public class ObjectToJson {
  public static void serializeJavaObjectToJson() {
    System.out.println("Serialize Java Object to JSON");
    Demo demo = new Demo();
    demo.setId(1);
    demo.setName("Tamara");
    demo.setActive(true);
    JSONObject jo = new JSONObject(demo);
    System.out.println(jo);
  }
}

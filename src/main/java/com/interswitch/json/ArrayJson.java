package com.interswitch.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class ArrayJson {
  public static void createJsonArray() {
    System.out.println("Create JSONArray");
    JSONArray ja = new JSONArray();
    ja.put(Boolean.TRUE);
    ja.put("Let's go");
    /* Object 1 */
    JSONObject jo = new JSONObject();
    jo.put("name", "Jon Doe");
    jo.put("age", 22);
    jo.put("city", "Chicago");
    ja.put(jo);
    /* Object 2 */
    jo = new JSONObject();
    jo.put("name", "Samuel Egho");
    jo.put("age", 23);
    jo.put("city", "Edo");
    ja.put(jo);
    /* Object 3 */
    jo = new JSONObject();
    jo.put("name", "Egho Goodnews");
    jo.put("age", 21);
    jo.put("city", "Lagos");
    System.out.println(ja.put(jo));
  }
}

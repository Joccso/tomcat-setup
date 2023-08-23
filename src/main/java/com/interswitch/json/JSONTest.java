package com.interswitch.json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONTest {
  public static void main (String[] args) {
    JSONObject jo = new JSONObject();
    jo.put("name", "Jon Doe");
    jo.put("age", 22);
    jo.put("city", "Chicago");
    System.out.println(jo);
    /* Mapping with Json */
    JSONMapping.jsonMapping();
    /* Creating JSONObject from JSON String */
    ObjectFromString.createJsonObjectFromJsonString();
    /* Serialize Java Object to JSON */
    ObjectToJson.serializeJavaObjectToJson();
    /* Create JSONArray */
    ArrayJson.createJsonArray();
    /* Create JSONArray from JSON String */
    ArrayFromString.createJsonArrayFromJsonString();
    /* Create JSONArray from a Collection or an Array */
    ArrayFromCollection.createJsonArrayFromCollection();
  }
}

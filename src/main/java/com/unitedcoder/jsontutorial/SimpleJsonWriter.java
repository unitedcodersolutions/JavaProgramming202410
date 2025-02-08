package com.unitedcoder.jsontutorial;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

    public class SimpleJsonWriter {
        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
            JSONObject obj = new JSONObject();
            obj.put("firstname", "Pankaj");
            obj.put("age", 32);
            obj.put("lastname","Kumar");
            JSONArray cities = new JSONArray();
            cities.add("New York");
            cities.add("Bangalore");
            cities.add("San Francisco");
            obj.put("cities", cities);
            try {

                FileWriter file = new FileWriter("doc/userdata.json");
                file.write(obj.toJSONString());
                file.flush();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.print(obj.toJSONString());

        }
    }



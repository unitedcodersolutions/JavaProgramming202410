package com.unitedcoder.datastructure;

import java.util.*;

public class MapDemo1 {
    //design an application that store web brand name and URL
    public static void main(String[] args) {
        //Google (key) , value: https://www.google.com
        //Yahoo (key), value: https://www.yahoo.com
        //YouTube(key), value: https://www.youtube.com
        //CNN (key), value: https://www.cnn.com
        Map<String,String> websites=new HashMap<>();
        websites.put("Google","https://www.google.com");
        websites.put("Yahoo","https://www.yahoo.com");
        websites.put("YouTube","https://www.youtube.com");
        websites.put("CNN","https://www.cnn.com");
        websites.put("CNN","https://www.cnn.com"); //the duplicate key is automatically removed
        //count total items
        int totalWebsites= websites.size();
        System.out.println("Total website: "+totalWebsites);
        //get a value from a key
        System.out.println(websites.get("Google"));
        //verify if key exist
        System.out.println("is Shopify exist" +websites.containsKey("Shopify"));
        System.out.println("is CNN exist " +websites.containsKey("CNN"));
        //verify value if exist
        System.out.println(websites.containsValue("https://www.yahoo.com"));
        System.out.println(websites.containsValue("https://yahoo.com"));
        //Get all keys as keySet
        Set<String> webNames=  websites.keySet();
        for(String name: webNames)
        {
            System.out.println(name+ " "+websites.get(name));
        }
        //using iterator to get keys and corresponding values
        Iterator<String> keys=websites.keySet().iterator();
        while ((keys.hasNext()))
        {
            websites.get(keys.next());
        }
        //for each loop using Map
        for(String website: websites.keySet())
        {
            System.out.println(websites.get(website));
        }
        //remove an item using key
        websites.remove("Google");
        System.out.println("After removing Google");
        for(String website: websites.keySet())
        {
            System.out.println(websites.get(website));
        }

    }
}

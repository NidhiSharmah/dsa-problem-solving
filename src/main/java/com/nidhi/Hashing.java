package com.nidhi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String args[]){
        // Country(key), Population(Value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion operation
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        //Output
        //{China=150, US=30, India=120}
        // HashMap are unordered map

        map.put("China", 180);
        System.out.println(map);

        //Output
        // {China=180, US=30, India=120}
        //Updated the new value

        // Insert in HashMap
        // map.put()
        // case 1 = if key already exists than new value will be updated
        // case 2 = if key is not existed in that case new air is inserted

        // Search or Lookup
        if (map.containsKey("India")){
            System.out.println("Key is present in the map.");
        } else {
            System.out.println("Key is not present in the map.");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("UK")); // Output will be null

        // Output
        // Key is present in the map.
        // 180
        // null
        // Search in Hashmap
        // .get = Case 1 = key exists = value will show
        // case 2 =Key does not exists = null will come in output

        // .containsKey = case 1 = key exists = true else false

        // Iteration in Hashmap

        //for(int val : arr)
        // entry set
        for ( Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // One more way with the help of key set
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        // remove pair
        map.remove("China");
        System.out.println(map);

    }
}

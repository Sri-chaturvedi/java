package Hashing.HashMap;

import java.util.*;

public class HM {
    public static void main(String[] args) {
        // ------------------- CREATE HASHMAP -------------------
        // HashMap stores data in key-value pairs (unordered)
        // Example: Country (Key) -> Population in Crores (Value)
        HashMap<String, Integer> map = new HashMap<>();

        // ------------------- INSERTION -------------------
        // Add some countries with their population
        map.put("India", 120);   // India -> 120 Cr
        map.put("U.S.", 30);     // U.S. -> 30 Cr
        map.put("China", 150);   // China -> 150 Cr

        System.out.println(map); // Print complete HashMap (order not guaranteed)

        // If key already exists, its value is updated (not duplicated)
        map.put("China", 180);   // Updates China's population from 150 -> 180
        System.out.println(map);

        // ------------------- SEARCH -------------------
        // Check if a key exists in the map
        if (map.containsKey("Indonesia")) {
            System.out.println("Key Present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        // Get values from keys
        System.out.println(map.get("China"));      // Exists -> prints 180
        System.out.println(map.get("Indonesia"));  // Doesn't exist -> prints null

        // ------------------- SIMPLE ARRAY EXAMPLE -------------------
        // Just to show how normal arrays can be iterated with for-each
        int arr[] = {12, 15, 18};
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        // ------------------- ITERATION IN HASHMAP -------------------

        // 1st Way: Using entrySet() → gives both key and value together
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("Country: " + e.getKey());
            System.out.println("Population: " + e.getValue());
        }

        // 2nd Way: Using keySet() → gives all keys, then fetch value using get()
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // ------------------- REMOVE -------------------
        // Removes a key and its value from the HashMap
        map.remove("China");     // Deletes the entry for China
        System.out.println(map); // Now China is no longer present
    }
}

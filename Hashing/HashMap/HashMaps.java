/*
=====================================================================================
📘 PROGRAM NAME  : HashMap Operations in Java
📂 PACKAGE       : Hashing.HashMap
💡 TOPIC         : Java Collection Framework | HashMap | Key-Value Mapping
📅 DESCRIPTION   :
   This program demonstrates the use of `HashMap` in Java, covering
   insertion, updating values, searching for keys, retrieving values,
   iteration over entries, and deletion of keys.

=====================================================================================
🎯 OBJECTIVE:
Learn how to use Java’s `HashMap` to store key-value pairs efficiently 
and perform basic CRUD (Create, Read, Update, Delete) operations.

Example Data:
- Key   → Country Name (String)
- Value → Population (Integer)

=====================================================================================
⚙️ KEY POINTS:

1️⃣ `HashMap` stores data as **key-value pairs**.  
2️⃣ Keys are **unique** — inserting a duplicate key updates the value.  
3️⃣ HashMap is **unordered** — it does not maintain insertion order.  
4️⃣ Allows **one null key** and multiple **null values**.  
5️⃣ Provides **O(1)** average time for insertion, lookup, and deletion.

=====================================================================================
📊 TIME COMPLEXITY  :
   - Insertion   → O(1)
   - Lookup      → O(1)
   - Deletion    → O(1)
   - Iteration   → O(n)

📊 SPACE COMPLEXITY : O(n)
=====================================================================================
*/

package Hashing.HashMap;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {

        // 🔹 Creating a HashMap (Key → Country, Value → Population)
        HashMap<String, Integer> map = new HashMap<>();

        // 🔹 Insertion
        map.put("India", 120);
        map.put("U.S.", 30);
        map.put("China", 150);

        // 🔹 Updating an existing key (Overwrites old value)
        map.put("China", 180);

        System.out.println("🌍 Country-Population Map: " + map);

        // 🔹 Searching for keys
        if (map.containsKey("China")) {
            System.out.println("✅ Key 'China' is present in the map");
        } else {
            System.out.println("❌ Key 'China' is not present in the map");
        }

        if (map.containsKey("Indonesia")) {
            System.out.println("✅ Key 'Indonesia' is present in the map");
        } else {
            System.out.println("❌ Key 'Indonesia' is not present in the map");
        }

        // 🔹 Accessing values
        System.out.println("\n📈 Population of China: " + map.get("China"));         // key exists
        System.out.println("📉 Population of Indonesia: " + map.get("Indonesia"));   // key not exists (null)

        // 🔹 Iteration - Using entrySet()
        System.out.println("\n🔁 Iterating using entrySet():");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println("➡️ " + e.getKey() + " → " + e.getValue());
        }

        // 🔹 Iteration - Using keySet()
        System.out.println("\n🔁 Iterating using keySet():");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println("🌐 " + key + " → " + map.get(key));
        }

        // 🔹 Deleting a key-value pair
        map.remove("China");
        System.out.println("\n🗑️ After removing 'China': " + map);
    }
}

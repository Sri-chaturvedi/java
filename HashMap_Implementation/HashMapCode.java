/*
=====================================================================================
📘 PROGRAM NAME  : Custom HashMap Implementation in Java
📂 PACKAGE       : HashMap_Implementation
💡 TOPIC         : Data Structures | Hashing | Generics | Custom HashMap
📅 DESCRIPTION   :
   This program demonstrates how to manually implement a simplified version
   of Java’s `HashMap` using an array of LinkedLists for handling collisions
   (separate chaining method).

=====================================================================================
🎯 OBJECTIVE:
Implement a generic `HashMap<K, V>` that supports:
   - put(key, value)
   - get(key)
   - remove(key)
   - contains(key)
   - keySet()
   - isEmpty()
   - Rehashing when load factor exceeds threshold.

=====================================================================================
⚙️ CONCEPTS USED:

1️⃣ **Hash Function** → Converts a key into an index using `hashCode() % N`.
2️⃣ **Collision Handling** → Implemented via *Separate Chaining* using LinkedLists.
3️⃣ **Rehashing** → Automatically doubles the bucket array size when load factor 
   (`n / N`) exceeds the threshold (2.0 here).
4️⃣ **Generics** → Works for any key and value data type.

=====================================================================================
📊 TIME COMPLEXITY:
   - put()      → O(1) average
   - get()      → O(1) average
   - remove()   → O(1) average
   - contains() → O(1) average
   - keySet()   → O(n)
   - rehash()   → O(n)

📊 SPACE COMPLEXITY : O(n)
=====================================================================================
*/

package HashMap_Implementation;

import java.util.*;

public class HashMapCode {

    // 🔹 Inner Custom HashMap Class
    private class HashMap<K, V> {

        // 🔹 Node Structure for Each (Key, Value) Pair
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        // 🧱 Data Members
        private int n;                  // Number of key-value pairs
        private int N;                  // Number of buckets
        private LinkedList<Node>[] buckets;  // Array of LinkedLists

        // 🔹 Constructor (Initial Capacity = 4)
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // 🧮 Hash Function → Returns Bucket Index
        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        // 🔍 Searches for a Key in a Specific LinkedList
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) { // ✅ Use equals(), not ==
                    return i;
                }
            }
            return -1;
        }

        // 🔁 Rehashing → Doubles the Bucket Array Size
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0; // Reset count before re-inserting
            for (int i = 0; i < oldBuckets.length; i++) {
                for (Node node : oldBuckets[i]) {
                    put(node.key, node.value);
                }
            }
        }

        // 🟢 Insert or Update Key-Value Pair
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = buckets[bi].get(di);
                node.value = value; // Update existing value
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        // 🔍 Check if Key Exists
        public boolean contains(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1;
        }

        // 🧾 Retrieve Value by Key
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) return null;
            return buckets[bi].get(di).value;
        }

        // 🗑️ Remove a Key-Value Pair
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) return null;

            Node node = buckets[bi].remove(di);
            n--;
            return node.value;
        }

        // 🔑 Return All Keys in the HashMap
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (LinkedList<Node> ll : buckets) {
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }

            return keys;
        }

        // 🧩 Check if HashMap is Empty
        public boolean isEmpty() {
            return n == 0;
        }
    }

    // 🔹 MAIN METHOD (Driver Code)
    public static void main(String[] args) {
        HashMapCode outer = new HashMapCode();
        HashMap<String, Integer> map = outer.new HashMap<>();

        // Inserting key-value pairs
        map.put("India", 120);
        map.put("China", 200);
        map.put("US", 50);

        // Printing all key-value pairs
        ArrayList<String> keys = map.keySet();
        System.out.println("🌍 Country → Population:");
        for (String key : keys) {
            System.out.println("➡️ " + key + " → " + map.get(key));
        }

        // Removing an entry
        System.out.println("\n🗑️ Removing 'China'...");
        map.remove("China");

        // Checking after removal
        System.out.println("📉 China Population (after removal): " + map.get("China"));
    }
}

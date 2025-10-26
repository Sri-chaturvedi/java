/*
=====================================================================================
📘 PROGRAM NAME  : HashSet Operations in Java
📂 PACKAGE       : Hashing.HashSet
💡 TOPIC         : Java Collection Framework | HashSet | Iteration
📅 DESCRIPTION   :
   This program demonstrates the use of `HashSet` in Java, including insertion,
   searching, deletion, iteration, and key properties such as uniqueness 
   and unordered storage.

=====================================================================================
🎯 OBJECTIVE:
Understand how to use Java's `HashSet` to store unique elements, 
perform basic operations, and iterate through the set.

Example Operations:
- Add elements
- Check size
- Search (contains)
- Delete elements
- Iterate using Iterator

=====================================================================================
⚙️ KEY POINTS:

1️⃣ HashSet stores **unique** elements — duplicates are ignored.  
2️⃣ The order of elements is **not guaranteed** (unordered).  
3️⃣ Operations like add, remove, and contains run in **O(1)** average time.  
4️⃣ You can traverse using an **Iterator**.

=====================================================================================
📊 TIME COMPLEXITY  :
   - Insertion   → O(1)
   - Search      → O(1)
   - Deletion    → O(1)
   - Iteration   → O(n)

📊 SPACE COMPLEXITY : O(n)
=====================================================================================
*/

package Hashing.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {

    public static void main(String[] args) {

        // 🔹 Creating a HashSet
        HashSet<Integer> set = new HashSet<>();

        // 🔹 Insertion (Duplicates ignored automatically)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // Duplicate → ignored

        // 🔹 Size of HashSet
        System.out.println("📏 Size of set: " + set.size());

        // 🔹 Print all elements
        System.out.println("📦 Elements in set: " + set);

        // 🔹 Search (contains)
        if (set.contains(1)) {
            System.out.println("✅ Set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("❌ Set does not contain 6");
        }

        // 🔹 Delete an element
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("🗑️ Element 1 deleted successfully");
        }

        // 🔹 Iterating using Iterator
        System.out.println("\n🔁 Iterating through set elements:");
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.println("➡️ " + it.next());
        }
    }
}

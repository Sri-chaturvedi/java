/*
=====================================================================================
📘 PROGRAM NAME  : ArrayList Operations in Java
📂 PACKAGE       : ArrayList
💡 TOPIC         : Collection Framework in Java (ArrayList Class)
📅 DESCRIPTION   :
   Demonstrates all the basic operations of ArrayList in Java such as:
   adding, updating, removing, accessing, looping, and sorting elements.
   Also shows how ArrayList dynamically resizes and maintains order.

=====================================================================================
🎯 WHAT IS ARRAYLIST?
ArrayList is a part of the Java Collection Framework and is a resizable array.
Unlike arrays, its size can grow or shrink dynamically during runtime.

🔹 Located in → java.util package
🔹 Class Signature → public class ArrayList<E> extends AbstractList<E>
🔹 Implements → List, RandomAccess, Cloneable, Serializable
🔹 Syntax → ArrayList<Type> list = new ArrayList<>();

=====================================================================================
🧠 DRY RUN EXAMPLE:

1️⃣ Create an ArrayList of Integers
    list = []

2️⃣ Add elements
    list.add(0)
    list.add(2)
    list.add(3)
    👉 list = [0, 2, 3]

3️⃣ Insert element at index 1
    list.add(1, 1)
    👉 list = [0, 1, 2, 3]

4️⃣ Replace element at index 0
    list.set(0, 5)
    👉 list = [5, 1, 2, 3]

5️⃣ Remove element at index 3
    list.remove(3)
    👉 list = [5, 1, 2]

6️⃣ Sort list
    Collections.sort(list)
    👉 list = [1, 2, 5]

=====================================================================================
⚙️ MAIN METHODS USED:
• add(E element)               → Add element at end
• add(int index, E element)    → Insert at specific position
• get(int index)               → Retrieve element
• set(int index, E element)    → Replace element
• remove(int index)            → Delete element
• size()                       → Get total elements
• Collections.sort(list)       → Sorts elements in ascending order
=====================================================================================
📊 TIME COMPLEXITY (average)
Add (end)            → O(1)
Add (middle/index)   → O(n)
Get / Set            → O(1)
Remove (index)       → O(n)
Sort                 → O(n log n)
=====================================================================================
💾 KEY POINTS:
✔ Maintains insertion order
✔ Allows duplicates
✔ Random access supported (via index)
✔ Not synchronized (use CopyOnWriteArrayList for thread-safety)
=====================================================================================
*/

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylists{

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("📘 ARRAYLIST DEMONSTRATION");
        System.out.println("==============================================");

        // ✅ Create an ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<Integer>();

        // ➤ Add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println("After adding elements: " + list);

        // ➤ Get element
        int element = list.get(0);
        System.out.println("Element at index 0: " + element);

        // ➤ Insert element at specific index
        list.add(1, 1);
        System.out.println("After inserting 1 at index 1: " + list);

        // ➤ Update element using set()
        list.set(0, 5);
        System.out.println("After updating index 0 with 5: " + list);

        // ➤ Remove element at index 3
        list.remove(3);
        System.out.println("After removing element at index 3: " + list);

        // ➤ Get size of the list
        int size = list.size();
        System.out.println("Current size of ArrayList: " + size);

        // ➤ Traverse using for loop
        System.out.print("Traversing ArrayList: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // ➤ Sort the list
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        System.out.println("✅ ArrayList operations executed successfully!");
    }
}
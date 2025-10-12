/*
=====================================================================================
📘 PROGRAM NAME  : LinkedList Implementation using Java Collections Framework
📂 PACKAGE       : LinkedList
💡 TOPIC         : Java Collections – LinkedList Class
📅 DESCRIPTION   : 
   This program demonstrates how to use Java’s built-in `LinkedList` class 
   from the Java Collections Framework to perform common operations such as:
   ➤ Adding elements
   ➤ Removing elements
   ➤ Accessing elements
   ➤ Iterating through the list

   The `LinkedList` class in Java implements both `List` and `Deque` interfaces,
   providing functionality for insertion, deletion, and traversal efficiently.

=====================================================================================
🎯 OPERATIONS COVERED:
1️⃣ addFirst(element) – Add element at the beginning  
2️⃣ addLast(element) – Add element at the end  
3️⃣ removeFirst() – Remove first element  
4️⃣ removeLast() – Remove last element  
5️⃣ remove(index) – Remove element at given index  
6️⃣ size() – Get total number of elements  
7️⃣ get(index) – Access element by index  
8️⃣ Iteration using for loop  

=====================================================================================
🧠 DRY RUN EXAMPLE:

Step-by-step:
list.addFirst("a")       → [a]  
list.addFirst("is")      → [is, a]  
list.addFirst("This")    → [This, is, a]  
list.addLast("list")     → [This, is, a, list]  

Print size() → 4  
Iterate → This =>> is =>> a =>> list =>> null  

list.remove(3) → Removes element at index 3 ("list")  
Final list → [This, is, a]  

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:
1️⃣ Create a `LinkedList` object of type String.  
2️⃣ Use `addFirst()` and `addLast()` to insert elements.  
3️⃣ Use `remove()` methods for deletion.  
4️⃣ Traverse using for loop and print all elements.  
5️⃣ Use `size()` to display current number of elements.  

=====================================================================================
📊 TIME COMPLEXITY:
✅ addFirst() / addLast()     → O(1)  
✅ removeFirst() / removeLast() → O(1)  
✅ get(index) / remove(index)   → O(n)  
✅ size()                       → O(1)  
✅ Iteration                    → O(n)  

💾 SPACE COMPLEXITY:
O(n) → for storing n elements in the list  

=====================================================================================
💡 KEY POINTS:
✔ Built-in Java `LinkedList` simplifies list handling  
✔ Doubly Linked List internally  
✔ Faster insertion/deletion than ArrayList (for large lists)  
✔ Maintains order of insertion  
✔ Can be used as a Queue, Deque, or List  

=====================================================================================
*/


import java.util.*;

public class JavaCollectionsLinkedListClass {
    public static void main(String[] args) {
        // 🔹 Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<String>();

        // 🔹 Add elements to the list
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        // 🔹 Add at both ends
        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);

        // 🔹 Print size of list
        System.out.println("Size of list: " + list.size());

        // 🔹 Print all elements using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " =>> ");
        }
        System.out.println("null");

        // 🔹 Remove element by index (3rd index)
        list.remove(3);
        System.out.println("After removing element at index 3: " + list);
    }
}

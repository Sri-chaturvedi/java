/*
=====================================================================================
📘 PROGRAM NAME  : Search Element in LinkedList
📂 PACKAGE       : LinkedList
💡 TOPIC         : LinkedList Search using Java Collections Framework
📅 DESCRIPTION   :
   This program demonstrates how to:
   ➤ Create a LinkedList
   ➤ Add elements
   ➤ Search for a specific element (e.g., number 7)
   ➤ Print its index position

=====================================================================================
🎯 QUESTION:
Make a LinkedList & add the following elements to it:
👉 (1, 5, 7, 3, 8, 2, 3)
Search for the number `7` and display its index.

=====================================================================================
🧠 DRY RUN:

LinkedList = [1, 5, 7, 3, 8, 2, 3]
Search for 7 → Found at index 2

Output:
Index of 7 is : 2

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:
1️⃣ Create a LinkedList of Integers  
2️⃣ Add all the given numbers  
3️⃣ Use `indexOf()` to find the index of the number 7  
4️⃣ If index ≠ -1 → print index  
   Else → print “not found”

=====================================================================================
📊 TIME COMPLEXITY:
✔ add() → O(1)  
✔ indexOf() → O(n)  
✔ Overall → O(n)

💾 SPACE COMPLEXITY:
✔ O(n) → For storing n elements

=====================================================================================
*/

import java.util.*;

public class SearchElementInLinkedList {
    public static void main(String[] args) {
        // 🔹 Create LinkedList and add elements
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(1);
        list.addLast(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);

        // 🔹 Print the LinkedList
        System.out.println("Linked List: " + list);

        // 🔹 Search for element 7
        int index = list.indexOf(7);

        if (index != -1) {
            System.out.println("Index of 7 is: " + index);
        } else {
            System.out.println("There is no 7 in the list.");
        }
    }
}

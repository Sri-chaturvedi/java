/*
=====================================================================================
📘 PROGRAM NAME  : Remove Elements Greater Than 25 from LinkedList
📂 PACKAGE       : LinkedList
💡 TOPIC         : LinkedList Operations and Conditional Removal
📅 DESCRIPTION   :
   This program demonstrates:
   ➤ Taking LinkedList input from user
   ➤ Validating input range (1–50)
   ➤ Removing all nodes having values greater than 25

=====================================================================================
🎯 QUESTION:
Take elements (numbers in range 1–50) of a LinkedList as input from user.
Delete all nodes that have values greater than 25.

=====================================================================================
🧠 DRY RUN:

Input →  [10, 27, 5, 32, 19, 50, 8]
After removing >25 → [10, 5, 19, 8]

=====================================================================================
⚙️ ALGORITHM / LOGIC FLOW:
1️⃣ Ask user for number of elements `n`  
2️⃣ Take input numbers (1–50 only)  
3️⃣ Add valid numbers to LinkedList  
4️⃣ Use `removeIf(x -> x > 25)` to remove numbers greater than 25  
5️⃣ Display updated list  

=====================================================================================
📊 TIME COMPLEXITY:
✔ add() → O(1)  
✔ removeIf() → O(n)  
✔ Overall → O(n)

💾 SPACE COMPLEXITY:
✔ O(n) → For storing elements in the LinkedList

=====================================================================================
💡 KEY POINTS:
✔ Demonstrates conditional deletion using lambda expression  
✔ Uses `removeIf()` from Java 8+  
✔ Input validation ensures clean data handling  

=====================================================================================
*/

import java.util.*;

public class RemoveGreaterThan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " Numbers (Range 1–50):");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num >= 1 && num <= 50) {
                list.add(num);
            } else {
                System.out.println("Invalid number! Please enter between 1 and 50.");
                i--; // repeat iteration for invalid input
            }
        }

        System.out.println("\nOriginal List: " + list);

        // 🔹 Remove all elements greater than 25
        list.removeIf(x -> x > 25);

        System.out.println("List after removing numbers greater than 25: " + list);

        sc.close();
    }
}

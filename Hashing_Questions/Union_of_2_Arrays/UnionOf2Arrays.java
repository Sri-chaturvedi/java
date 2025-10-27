/*
=====================================================================================
📘 PROGRAM NAME  : Union of Two Arrays
📂 PACKAGE       : Hashing_Questions.Union_of_2_Arrays
💡 TOPIC         : HashSet | Unique Elements | Array Operations
📅 DESCRIPTION   :
   This program finds the total number of unique elements present
   in the union of two arrays using a HashSet.

=====================================================================================
🎯 OBJECTIVE:
Count distinct elements that appear in either of the two arrays.

Example Input:
   arr1 = [7, 3, 9]
   arr2 = [6, 3, 9, 2, 9, 4]

✅ Output:
   Count of unique elements (Union): 6

(Union = {7, 3, 9, 6, 2, 4})

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Create a HashSet<Integer> to store unique elements.  
2️⃣ Add all elements of first array to the set.  
3️⃣ Add all elements of second array to the set.  
4️⃣ The size of the set gives total unique elements (Union).  

=====================================================================================
📊 TIME COMPLEXITY  : O(n + m)
📊 SPACE COMPLEXITY : O(n + m)
=====================================================================================
*/

package Hashing_Questions.Union_of_2_Arrays;

import java.util.HashSet;

public class UnionOf2Arrays {

    // 🔹 Function to count unique elements in the union of two arrays
    public static int union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();

        // 🧩 Step 1: Add all elements of first array
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // 🧩 Step 2: Add all elements of second array
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        // 📊 Step 3: Return total unique count
        return set.size();
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        System.out.println("Count of unique elements (Union): " + union(arr1, arr2));
    }
}

/*
=====================================================================================
📘 PROGRAM NAME  : Intersection of Two Arrays
📂 PACKAGE       : Hashing_Questions.Intersection_Of_2_Arrays
💡 TOPIC         : HashSet | Common Elements | Array Operations
📅 DESCRIPTION   :
   This program finds the total count of common (intersection) elements
   between two arrays using a HashSet to achieve efficient lookups.

=====================================================================================
🎯 OBJECTIVE:
Identify and count all elements that are present in both arrays.

Example Input:
   arr1 = [7, 3, 9]
   arr2 = [6, 3, 9, 2, 9, 4]

✅ Output:
   Count of common elements (Intersection): 2

(Common elements = {3, 9})

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Create a HashSet<Integer> to store unique elements of the first array.  
2️⃣ Traverse the second array:
    - If element exists in the set → increment count  
    - Remove it from the set to avoid duplicate counting  
3️⃣ Return the final count of intersection elements.  

=====================================================================================
📊 TIME COMPLEXITY  : O(n + m)
📊 SPACE COMPLEXITY : O(n)
=====================================================================================
*/

package Hashing_Questions.Intersection_Of_2_Arrays;

import java.util.HashSet;

public class IntersectionOf2Arrays {

    // 🔹 Function to count common elements in two arrays
    public static int intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        // 🧩 Step 1: Store all elements of first array in set
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // 🧩 Step 2: Check for common elements in second array
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]); // prevent double counting
            }
        }

        // 📊 Step 3: Return total intersection count
        return count;
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        System.out.println("Count of common elements (Intersection): " + intersection(arr1, arr2));
    }
}

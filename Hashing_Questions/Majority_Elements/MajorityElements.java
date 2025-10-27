/*
=====================================================================================
📘 PROGRAM NAME  : Majority Element (> n/3 Times)
📂 PACKAGE       : Hashing_Questions.Majority_Elements
💡 TOPIC         : HashMap | Frequency Counting | Array Analysis
📅 DESCRIPTION   :
   This program finds all elements in an integer array that appear 
   more than ⌊ n/3 ⌋ times using a HashMap to count frequencies.

=====================================================================================
🎯 OBJECTIVE:
Identify all elements whose frequency > n/3 in O(n) time complexity.

Example Input:
   nums = [1, 3, 2, 5, 1, 3, 1, 5, 1]

✅ Output:
   1

(Here, 1 appears 4 times out of 9 elements → 4 > 9/3)

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Create a HashMap<Integer, Integer> to store frequency of each element.  
2️⃣ Traverse the array:
    - If element exists → increment its count  
    - Otherwise → insert with count = 1  
3️⃣ Traverse the map and print all elements with frequency > n/3  

=====================================================================================
📊 TIME COMPLEXITY  : O(n)
📊 SPACE COMPLEXITY : O(n)
=====================================================================================
*/

package Hashing_Questions.Majority_Elements;

import java.util.*;

public class MajorityElements {

    // 🔹 Function to print majority elements (> n/3 times)
    public static void majorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // 🧮 Step 1: Count frequency of each element
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // 🧾 Step 2: Print elements that appear more than n/3 times
        System.out.println("🔍 Elements appearing more than n/3 times:");
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println("➡️ " + key + " (count = " + map.get(key) + ")");
            }
        }
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        majorityElement(nums);
    }
}

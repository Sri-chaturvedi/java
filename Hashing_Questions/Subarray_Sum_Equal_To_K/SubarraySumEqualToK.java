/*
=====================================================================================
📘 PROGRAM NAME  : Subarray Sum Equal To K
📂 PACKAGE       : Hashing_Questions.Subarray_Sum_Equal_To_K
💡 TOPIC         : Prefix Sum | HashMap | Subarray Count
📅 DESCRIPTION   :
   This program counts the number of subarrays in an integer array whose 
   sum equals a given integer `k`, using prefix sum and HashMap for efficient lookup.

=====================================================================================
🎯 OBJECTIVE:
Find total number of continuous subarrays with sum exactly equal to `k`.

Example Input:
   arr = [10, 2, -2, -20, 10]
   k   = -10

✅ Output:
   3

Explanation:
   Subarrays with sum = -10 are:
   1️⃣ [10, 2, -2, -20]
   2️⃣ [2, -2, -20, 10]
   3️⃣ [-20, 10]

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Maintain a running prefix sum while iterating through the array.  
2️⃣ Use a HashMap to store:
    - Key   → Prefix sum  
    - Value → Count of how many times this prefix sum has occurred  
3️⃣ For each element:
    - Compute `sum - k`. If it exists in the map, it means there’s a subarray 
      ending here whose sum equals `k`.  
4️⃣ Increment the count of valid subarrays accordingly.  

=====================================================================================
📊 TIME COMPLEXITY  : O(n)
📊 SPACE COMPLEXITY : O(n)
=====================================================================================
*/

package Hashing_Questions.Subarray_Sum_Equal_To_K;

import java.util.HashMap;

public class SubarraySumEqualToK {

    // 🔹 Main Method
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;

        // 🧮 HashMap to store prefix sums and their frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: sum before starting is 0 (1 occurrence)

        int ans = 0;   // to count total subarrays
        int sum = 0;   // running prefix sum

        // 🔁 Traverse through the array
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j]; // update running sum

            // Check if (sum - k) exists → indicates a valid subarray
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

            // Store or update the frequency of current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        // 🧾 Print total count of valid subarrays
        System.out.println("✅ Total Subarrays with Sum = " + k + " : " + ans);
    }
}

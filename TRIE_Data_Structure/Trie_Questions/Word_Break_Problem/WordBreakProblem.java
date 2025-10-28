/*
=====================================================================================
📘 PROGRAM NAME  : Word Break Problem using Trie
📂 PACKAGE       : Trie_Questions.Word_Break_Problem
💡 TOPIC         : Dynamic Programming | Trie | String Segmentation
📅 DESCRIPTION   :
   This program solves the **Word Break Problem** using a Trie (Prefix Tree).

   The Word Break Problem checks whether a given string can be segmented 
   into a space-separated sequence of one or more dictionary words.

   Example:
       Dictionary = ["i", "like", "sam", "samsung", "mobile", "ice"]
       Input      = "ilikesamsung"
       Output     = true  (because it can be segmented as "i like samsung")

=====================================================================================
🎯 OBJECTIVE:
Implement a Trie that supports:
   ✅ insert(word) → Insert a word into the Trie  
   ✅ search(word) → Check if a word exists in the Trie  
   ✅ wordBreak(key) → Check if a string can be broken into valid dictionary words  

Example Input:
   Words = ["i", "like", "sam", "samsung", "mobile", "ice"]
   Key   = "ilikesamsung"

Example Output:
   true

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Build Trie:
   - Each Trie node contains:
       → `children[26]` : References for each lowercase letter
       → `eow` : Marks if a valid word ends at this node

2️⃣ wordBreak(key):
   - Base Case: If key is empty → return true
   - Recursively split key into all possible prefixes
   - If the prefix exists in Trie and the suffix can be broken → return true

   Example for "ilikesamsung":
       "i" ✅ → check "likesamsung"
       "like" ✅ → check "samsung"
       "samsung" ✅ → return true

=====================================================================================
📊 TIME COMPLEXITY  :
   🔹 Building Trie → O(N * L)
   🔹 Word Break    → O(L²)
   where N = number of words, L = length of input string

📊 SPACE COMPLEXITY : O(26 * N * L)
=====================================================================================
*/

package TRIE_Data_Structure.Trie_Questions.Word_Break_Problem;

public class WordBreakProblem {

    // 🔹 Node class representing each character in the Trie
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false; // End of word flag

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    // 🔹 Root node of Trie
    static Node root = new Node();

    // 🔹 Insert a word into the Trie
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    // 🔹 Search if a word exists in the Trie
    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }
            if (i == key.length() - 1 && !curr.children[idx].eow) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    // 🔹 Word Break function
    public static boolean wordBreak(String key) {
        // Base case: empty string can always be segmented
        if (key.length() == 0) {
            return true;
        }

        // Try every possible prefix
        for (int i = 1; i <= key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);

            // If prefix is valid and suffix can be broken → return true
            if (search(firstPart) && wordBreak(secondPart)) {
                return true;
            }
        }

        return false; // No valid segmentation found
    }

    // 🔹 Main method for testing
    public static void main(String[] args) {
        String[] words = { "i", "like", "sam", "samsung", "mobile", "ice" };
        String key = "ilikesamsung";

        // Insert dictionary words into Trie
        for (String word : words) {
            insert(word);
        }

        // 🔍 Test word break
        System.out.println("Can \"" + key + "\" be segmented? → " + wordBreak(key));
    }
}

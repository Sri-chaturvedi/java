/*
=====================================================================================
📘 PROGRAM NAME  : Count Unique Substrings using Trie
📂 PACKAGE       : Trie_Questions.Count_Unique_SubString
💡 TOPIC         : Trie (Prefix Tree) | String Processing | Substring Counting
📅 DESCRIPTION   :
   This program counts the number of **unique substrings** in a given string using a
   **Trie Data Structure**.

   The key idea is that each substring of the string can be represented as a 
   path in the Trie. Every new branch created in the Trie corresponds to a 
   new unique substring.

=====================================================================================
🎯 OBJECTIVE:
Find the **total number of unique substrings** of a given string efficiently.

Example Input:
   str = "apple"

Example Output:
   16

(Explanation: "a", "ap", "app", "appl", "apple", "p", "pp", "ppl", "pple", "pl",
"ple", "l", "le", "e" → 15 substrings + empty string → 16 total)

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Insert all suffixes of the string into the Trie.
   Example for "apple":
      Insert "apple", "pple", "ple", "le", "e"

2️⃣ While inserting, every new node created represents a unique substring 
    not seen before.

3️⃣ Count all Trie nodes (each node represents a unique substring).

4️⃣ The total number of unique substrings = number of Trie nodes.

=====================================================================================
🔹 Example Walkthrough (for "ab"):
   - Insert "ab"  → creates "a" and "b" under "a"
   - Insert "b"   → creates new "b" under root
   Total Trie nodes = 4 (including root) → 3 unique substrings ("a", "b", "ab")

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 Insertion (all suffixes) → O(n²)
   🔹 Counting nodes           → O(n²)

📊 SPACE COMPLEXITY:
   O(26 * n²) — for Trie storage in the worst case (distinct substrings)

=====================================================================================
*/

package Trie_Questions.Count_Unique_SubString;

public class CountUniqueSubStrings {

    // 🔹 Node class representing each character node in the Trie
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    // 🔹 Root node of the Trie
    static Node root = new Node();

    // 🔹 Insert a word (suffix) into the Trie
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            // Create a new node if path doesn't exist
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            // Mark end of word
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }

    // 🔹 Count total nodes in the Trie (each node = unique substring)
    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNode(root.children[i]);
            }
        }

        return count + 1; // +1 for the current node
    }

    // 🔹 Main method
    public static void main(String args[]) {
        String str = "apple";

        // Insert all suffixes into the Trie
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }

        // Count all unique substrings
        System.out.println("Total Unique Substrings (including empty): " + countNode(root));
    }
}

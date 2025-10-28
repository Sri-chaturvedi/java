/*
=====================================================================================
📘 PROGRAM NAME  : Trie Data Structure (Insert & Search)
📂 PACKAGE       : TRIE_Data_Structure
💡 TOPIC         : Trie (Prefix Tree) | String Storage | Efficient Search
📅 DESCRIPTION   :
   This program implements a basic **Trie Data Structure** that supports 
   insertion and search operations for lowercase English words.

   A Trie (pronounced “try”) is a tree-like data structure used to store 
   strings efficiently, especially useful for prefix-based lookups.

=====================================================================================
🎯 OBJECTIVE:
Implement a Trie with:
   ✅ insert(word) → Insert a word into the Trie  
   ✅ search(word) → Check if a word exists in the Trie  

Example Input:
   Words = ["the", "a", "there", "their", "any"]

Example Searches:
   🔍 "there" → true  
   🔍 "thor"  → false  
   🔍 "a"     → true  
   🔍 "an"    → false  

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Each Trie Node contains:
    - `children[26]` → Array of references to child nodes (for each alphabet letter)
    - `eow` (end of word) → Marks if a word ends at this node

2️⃣ Insertion:
    - Traverse each character of the word.
    - Create new nodes when necessary.
    - Mark last character node as `end of word`.

3️⃣ Search:
    - Traverse character by character.
    - If a required node doesn’t exist → return false.
    - At end, check if `eow` is true for a valid word.

=====================================================================================
📊 TIME COMPLEXITY  :
   🔹 Insertion → O(L)
   🔹 Search    → O(L)
   where L = length of the word

📊 SPACE COMPLEXITY : O(26 * N * L) (for N words of average length L)
=====================================================================================
*/

package TRIE_Data_Structure;

public class TrieDataStructure {

    // 🔹 Node class representing each character in the Trie
    static class Node {
        Node[] children;
        boolean eow; // end of word flag

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    // 🔹 Root node of Trie
    static Node root = new Node();

    // 🔹 Insert a word into the Trie
    public static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a'; // map 'a' → 0, 'b' → 1, etc.

            // Create a new node if character path doesn't exist
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            // Mark end of word for last character
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }

            // Move to next node
            curr = curr.children[idx];
        }
    }

    // 🔹 Search for a word in the Trie
    public static boolean search(String key) {
        Node curr = root;

        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false; // character path missing → not found
            }

            if (i == key.length() - 1 && !curr.children[idx].eow) {
                return false; // reached end but not a valid word
            }

            curr = curr.children[idx];
        }

        return true; // valid word found
    }

    // 🔹 Main method for testing
    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any" };

        // Insert words into Trie
        for (String word : words) {
            insert(word);
        }

        // 🔍 Search test cases
        System.out.println("there → " + search("there")); // true
        System.out.println("thor  → " + search("thor")); // false
        System.out.println("an    → " + search("an")); // false
        System.out.println("a     → " + search("a")); // true
    }
}

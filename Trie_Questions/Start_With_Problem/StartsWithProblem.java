/*
=====================================================================================
📘 PROGRAM NAME  : Starts With Problem using Trie
📂 PACKAGE       : Trie_Questions.Start_With_Problem
💡 TOPIC         : Trie (Prefix Tree) | String Prefix Search | Starts-With Query
📅 DESCRIPTION   :
   This program implements a **Trie (Prefix Tree)** data structure to efficiently 
   check if a given prefix exists among inserted words.

   The **Starts With Problem** checks whether there exists any word in the Trie 
   that begins with the given prefix.

   Example:
       Words  = ["apple", "app", "mango", "man", "woman"]
       Prefix = "app"
       Output = true  (since "apple" and "app" start with "app")

=====================================================================================
🎯 OBJECTIVE:
Implement a Trie with:
   ✅ insert(word)   → Insert a word into the Trie  
   ✅ search(word)   → Check if a complete word exists in the Trie  
   ✅ startWith(pre) → Check if any word starts with the given prefix  

Example Input:
   Words  = ["apple", "app", "mango", "man", "woman"]
   Prefix = "app"

Example Output:
   true

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Each Trie Node contains:
   - `children[26]` → References for 26 lowercase letters ('a'–'z')
   - `eow` → Boolean flag to mark the end of a valid word

2️⃣ Insertion:
   - Traverse each character of the word.
   - Create new nodes if path doesn’t exist.
   - Mark the last character node as `end of word (eow)`.

3️⃣ Search:
   - Traverse nodes for each character in the word.
   - If any character’s node is missing → return false.
   - If traversal ends but node is not marked as `eow` → return false.
   - Otherwise → return true.

4️⃣ Start-With (Prefix Check):
   - Traverse characters of prefix.
   - If any node is missing → return false.
   - If traversal completes successfully → return true.

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 Insert     → O(L)
   🔹 Search     → O(L)
   🔹 StartsWith → O(P)
   where L = length of word, P = length of prefix

📊 SPACE COMPLEXITY:
   O(26 * N * L)  (for N words of average length L)
=====================================================================================
*/

package Trie_Questions.Start_With_Problem;

public class StartsWithProblem {

    // 🔹 Node class representing each Trie node
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false; // end of word flag

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

    // 🔹 Search if a complete word exists in the Trie
    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';

            Node node = curr.children[idx];
            if (node == null) {
                return false;
            }

            if (i == key.length() - 1 && !node.eow) {
                return false;
            }

            curr = node;
        }
        return true;
    }

    // 🔹 Check if any word starts with a given prefix
    public static boolean startWith(String prefix) {
        Node curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            Node node = curr.children[idx];

            if (node == null) {
                return false;
            }

            if (i == prefix.length() - 1) {
                return true;
            }

            curr = node;
        }

        return true;
    }

    // 🔹 Main method for testing
    public static void main(String[] args) {
        String[] words = { "apple", "app", "mango", "man", "woman" };
        String prefix = "app";

        // Insert all words into Trie
        for (String word : words) {
            insert(word);
        }

        // 🔍 Check if prefix exists
        System.out.println("Does any word start with \"" + prefix + "\"? → " + startWith(prefix));
    }
}

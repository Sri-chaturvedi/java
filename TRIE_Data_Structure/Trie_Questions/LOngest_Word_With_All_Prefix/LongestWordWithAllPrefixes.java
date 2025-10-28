/*
=====================================================================================
📘 PROGRAM NAME  : Longest Word With All Prefixes
📂 PACKAGE       : Trie_Questions.Longest_Word_With_All_Prefix
💡 TOPIC         : Trie (Prefix Tree) | String Processing | Word Construction
📅 DESCRIPTION   :
   This program finds the **longest word** in a given list such that **all of its 
   prefixes** are also valid words present in the same list.

   For example, if “apple” exists in the list, the program checks whether 
   “a”, “ap”, “app”, and “appl” are also valid words before confirming 
   “apple” as a valid candidate.

=====================================================================================
🎯 OBJECTIVE:
Find the **longest word** that can be built one character at a time by adding letters,
where all intermediate prefixes are also valid words in the Trie.

Example Input:
   words = { "a", "banana", "app", "appl", "ap", "apply", "apple" }

Example Output:
   apple

(Explanation: “apple” is the longest word where each prefix — “a”, “ap”, “app”, “appl” —
is also a valid word.)

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Insert all words into a Trie.
2️⃣ Traverse the Trie recursively:
      - Move only through child nodes that are marked as `end of word (eow = true)`.
      - Keep track of the current word using a StringBuilder.
3️⃣ Update the global answer if a longer valid word is found.
4️⃣ Return the longest such word.

=====================================================================================
🔹 Example Walkthrough (for ["a", "app", "appl", "apple"]):
   ✅ "a" → valid prefix
   ✅ "ap" → valid prefix
   ✅ "app" → valid prefix
   ✅ "appl" → valid prefix
   ✅ "apple" → all prefixes valid → answer = "apple"

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 Insertion   → O(N × L)   (N = number of words, L = average length)
   🔹 Traversal   → O(26 × L)  (constant branching factor)
   Overall: O(N × L)

📊 SPACE COMPLEXITY:
   O(26 × N × L) — space for Trie storage

=====================================================================================
*/

package TRIE_Data_Structure.Trie_Questions.LOngest_Word_With_All_Prefix;

public class LongestWordWithAllPrefixes {

    // 🔹 Node class representing each Trie node
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

    // 🔹 Insert a word into the Trie
    public static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];

            // Mark end of word
            if (i == word.length() - 1) {
                curr.eow = true;
            }
        }
    }

    // 🔹 Search for a complete word in the Trie
    public static boolean search(String key) {
        Node curr = root;

        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if (node == null)
                return false;
            if (i == key.length() - 1 && !node.eow)
                return false;

            curr = node;
        }

        return true;
    }

    // 🔹 Global variable to store the final answer
    public static String ans = "";

    // 🔹 Recursive function to find the longest valid word
    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null)
            return;

        for (int i = 0; i < 26; i++) {
            Node child = root.children[i];

            if (child != null && child.eow) {
                // Add character
                temp.append((char) (i + 'a'));

                // Update answer if current word is longer
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }

                // Recurse deeper
                longestWord(child, temp);

                // Backtrack
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    // 🔹 Main method
    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };

        // Insert all words into Trie
        for (String word : words) {
            insert(word);
        }

        // Find the longest word with all prefixes valid
        longestWord(root, new StringBuilder(""));

        // Print the result
        System.out.println("Longest Word with All Prefixes: " + ans);
    }
}

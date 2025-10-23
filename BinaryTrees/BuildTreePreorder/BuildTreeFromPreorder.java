/*
=====================================================================================
📘 PROGRAM NAME  : Build Binary Tree from Preorder Traversal
📂 PACKAGE       : BinaryTrees.BuildTreePreorder
💡 TOPIC         : Binary Tree Construction (Recursive)
📅 DESCRIPTION   :
   This program builds a Binary Tree using a given array representation of
   its preorder traversal. The value `-1` represents a null (no child).

   Example Preorder Array:
   {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}

   Represents the tree:
                1
              /   \
             2     3
            / \     \
           4   5     6
=====================================================================================
🎯 FUNCTIONALITY:
1️⃣ Build a binary tree recursively from a preorder array
2️⃣ Display the root node to verify construction
=====================================================================================
⚙️ LOGIC / ALGORITHM:
- Each element in the array represents a node in preorder form:
  Root → Left → Right
- When we encounter -1, it indicates no node (null child).
- Recursively call for left and right subtrees.
=====================================================================================
📊 TIME COMPLEXITY:
✔ O(n) → Each node is processed once.
📊 SPACE COMPLEXITY:
✔ O(h) → Stack space for recursion (h = height of tree).
=====================================================================================
*/

package BinaryTrees.BuildTreePreorder;

public class BuildTreeFromPreorder {

    // 🔹 Node structure
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // 🔹 Binary Tree class with buildTree() method
    static class BinaryTree {
        static int idx = -1; // global index for traversal

        // Build tree recursively using preorder array
        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) { // Base case → null node
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);  // build left subtree
            newNode.right = buildTree(nodes); // build right subtree

            return newNode;
        }
    }

    // 🔹 MAIN FUNCTION
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("✅ Binary Tree constructed successfully!");
        System.out.println("Root Node Data: " + root.data);
    }
}

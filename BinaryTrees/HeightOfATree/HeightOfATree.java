/*
=====================================================================================
📘 PROGRAM NAME  : Height (or Depth) of a Binary Tree
📂 PACKAGE       : BinaryTrees.HeightOfATree
💡 TOPIC         : Recursion in Binary Trees
📅 DESCRIPTION   :
   This program constructs a binary tree using preorder input 
   (where `-1` represents a null node) and calculates the height (maximum depth)
   of the tree using a recursive approach.

   Example Input Array:
   {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}

   Represents the tree:
                1
              /   \
             2     3
            / \     \
           4   5     6
=====================================================================================
🎯 OBJECTIVE:
To determine the **height** (maximum depth) of a binary tree —  
the number of nodes along the longest path from the root node to a leaf node.
=====================================================================================
⚙️ ALGORITHM / LOGIC:
1️⃣ Base Case → If root is `null`, return 0  
2️⃣ Recursively find:
      leftHeight  = height(root.left)
      rightHeight = height(root.right)
3️⃣ Result → `max(leftHeight, rightHeight) + 1`
=====================================================================================
🧠 DRY RUN (for the above tree):
Left Height  = 2 (path: 1 → 2 → 4)
Right Height = 2 (path: 1 → 3 → 6)
Height = max(2, 2) + 1 = 3
=====================================================================================
📊 TIME COMPLEXITY : O(n) → Each node is visited once
📊 SPACE COMPLEXITY : O(h) → Recursion stack, where h = height of tree
=====================================================================================
*/

package BinaryTrees.HeightOfATree;

public class HeightOfATree {

    // 🔹 Node class representing each element of the Binary Tree
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

    // 🔹 Builds a Binary Tree using Preorder traversal input
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);   // build left subtree
            newNode.right = buildTree(nodes);  // build right subtree

            return newNode;
        }
    }

    // 🔹 Recursive function to calculate height of a Binary Tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("✅ Height of the Binary Tree: " + height(root));
    }
}

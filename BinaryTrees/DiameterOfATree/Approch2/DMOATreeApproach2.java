/*
=====================================================================================
📘 PROGRAM NAME  : Diameter of a Binary Tree (Approach 2 — Optimized)
📂 PACKAGE       : BinaryTrees.DiameterOfATree.Approch2
💡 TOPIC         : Binary Tree Recursion | Diameter Calculation (Optimized)
📅 DESCRIPTION   :
   This program calculates the **diameter of a binary tree** efficiently — 
   i.e., the length of the longest path between any two nodes in the tree.

   Unlike Approach 1, this uses a single traversal to compute both 
   height and diameter simultaneously (O(n) time).

=====================================================================================
🎯 OBJECTIVE:
Find the **diameter (longest path)** in a binary tree using recursion and 
an optimized approach to avoid repeated height calculations.

Example Input:
{1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}

Tree Structure:
                1
              /   \
             2     3
            / \     \
           4   5     6

=====================================================================================
🧠 DRY RUN:

- Height(4) = 1, Height(5) = 1, Height(2) = 2  
- Height(6) = 1, Height(3) = 2  
- Diameter through root (1) = Height(left) + Height(right) + 1 = 2 + 2 + 1 = 5  

✅ Diameter = 5

=====================================================================================
⚙️ LOGIC / RECURSION FLOW:

1️⃣ Base Case → If root == null → return TreeInfo(0, 0)  
2️⃣ Compute left and right subtree info:  
     left  = diameter(root.left)  
     right = diameter(root.right)  
3️⃣ Current Node:  
     myHeight = max(left.ht, right.ht) + 1  
     diamThroughRoot = left.ht + right.ht + 1  
     myDiameter = max(left.diam, right.diam, diamThroughRoot)  
4️⃣ Return TreeInfo(myHeight, myDiameter)

=====================================================================================
📊 TIME COMPLEXITY  : O(n) → Single traversal of all nodes  
📊 SPACE COMPLEXITY : O(h) → Recursion stack, where h = height of tree
=====================================================================================
*/

package BinaryTrees.DiameterOfATree.Approch2;

public class DMOATreeApproach2 {

    // 🔹 Node structure for Binary Tree
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

    // 🔹 Utility to build a tree using Preorder input (-1 indicates null)
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // 🔹 Class to hold height and diameter together
    static class TreeInfo {
        int ht;    // Height of current subtree
        int diam;  // Diameter of current subtree

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    // 🔹 Optimized function to compute diameter and height simultaneously
    public static TreeInfo diameter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0); // Base case
        }

        TreeInfo left = diameter(root.left);   // Info from left subtree
        TreeInfo right = diameter(root.right); // Info from right subtree

        int myHeight = Math.max(left.ht, right.ht) + 1;           // Current node height
        int diamThroughRoot = left.ht + right.ht + 1;             // Diameter passing through root
        int myDiameter = Math.max(Math.max(left.diam, right.diam), diamThroughRoot); // Max diameter

        return new TreeInfo(myHeight, myDiameter);
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("✅ Diameter of the Binary Tree (Optimized Approach): " + diameter(root).diam);
    }
}

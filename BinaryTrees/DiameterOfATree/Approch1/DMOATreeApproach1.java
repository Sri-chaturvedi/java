/*
=====================================================================================
📘 PROGRAM NAME  : Diameter of a Binary Tree (Approach 1)
📂 PACKAGE       : BinaryTrees.DiameterOfATree.Approach1
💡 TOPIC         : Binary Tree Recursion | Diameter Calculation
📅 DESCRIPTION   :
   This program calculates the **diameter of a binary tree** — 
   i.e., the length of the longest path between any two nodes in the tree.

   The path may or may not pass through the root.

=====================================================================================
🎯 OBJECTIVE:
Find the **diameter (longest path)** in a binary tree using recursion.

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

For the above tree:
- Height(4) = 1
- Height(5) = 1
- Height(2) = 2
- Height(6) = 1
- Height(3) = 2
- Diameter through root (1) = Height(left) + Height(right) + 1 = 2 + 2 + 1 = 5

Hence, ✅ Diameter = 5

=====================================================================================
⚙️ LOGIC / RECURSION FLOW:

1️⃣ Base Case → If root == null → diameter = 0  
2️⃣ Compute:
     leftDiameter  = diameter(root.left)
     rightDiameter = diameter(root.right)
     heightSum     = height(root.left) + height(root.right) + 1
3️⃣ Final Result → max(heightSum, leftDiameter, rightDiameter)

=====================================================================================
📊 TIME COMPLEXITY  : O(n²) → Because height() is called for every node repeatedly  
📊 SPACE COMPLEXITY : O(h)  → Due to recursion stack, where h = height of tree
=====================================================================================
*/

package BinaryTrees.DiameterOfATree.Approch1;

public class DMOATreeApproach1 {

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

    // 🔹 Utility to build a tree using Preorder input (with -1 as null marker)
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

    // 🔹 Function to compute height of a Binary Tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // 🔹 Function to compute Diameter (Approach 1 — using repeated height calculation)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int diameterThroughRoot = height(root.left) + height(root.right) + 1;

        return Math.max(diameterThroughRoot, Math.max(leftDiameter, rightDiameter));
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("✅ Diameter of the Binary Tree (Approach 1): " + diameter(root));
    }
}

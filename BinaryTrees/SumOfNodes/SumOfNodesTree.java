/*
=====================================================================================
📘 PROGRAM NAME  : Sum of All Nodes in a Binary Tree
📂 PACKAGE       : BinaryTrees.SumOfNodes
💡 TOPIC         : Recursion in Binary Trees
📅 DESCRIPTION   :
   This program builds a Binary Tree using preorder traversal input 
   (where `-1` represents a null node) and computes the **sum of all node values**
   using a recursive approach.

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
To calculate the total **sum of all nodes** present in the Binary Tree.
=====================================================================================
⚙️ ALGORITHM / LOGIC:
1️⃣ Base Case: If root is `null`, return 0.  
2️⃣ Recursively calculate:
    - leftSum = sum of left subtree  
    - rightSum = sum of right subtree  
3️⃣ Return: `leftSum + rightSum + root.data`
=====================================================================================
🧠 DRY RUN (for the above tree):
Sum = (4 + 5 + 2) + (6 + 3) + 1 = 21
=====================================================================================
📊 TIME COMPLEXITY : O(n) → Each node is visited once
📊 SPACE COMPLEXITY : O(h) → Recursion stack space, where h = height of the tree
=====================================================================================
*/

package BinaryTrees.SumOfNodes;

public class SumOfNodesTree {

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

    // 🔹 Binary Tree builder using Preorder traversal array
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

    // 🔹 Recursive function to calculate sum of all nodes
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    // 🔹 Main method to run the program
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("✅ Sum of all nodes in the Binary Tree: " + sumOfNodes(root));
    }
}

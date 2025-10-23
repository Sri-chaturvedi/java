/*
=====================================================================================
📘 PROGRAM NAME  : Subtree of Another Tree
📂 PACKAGE       : BinaryTrees.SubtreeOfAnotherTree
💡 TOPIC         : Binary Tree Recursion | Subtree Check
📅 DESCRIPTION   :
   This program checks whether a binary tree `subRoot` is a subtree of another 
   binary tree `root`. A subtree of a tree `root` is a tree that consists of 
   a node in `root` and all of its descendants.

=====================================================================================
🎯 OBJECTIVE:
Determine if one binary tree is a subtree of another using recursion.

Example Input:
Main Tree (root):
        3
       / \
      4   5
     / \
    1   2

Subtree (subRoot):
      4
     / \
    1   2

✅ Output: true

=====================================================================================
⚙️ LOGIC / RECURSION FLOW:

1️⃣ Base Case:
   - If both trees are null → identical → return true
   - If one tree is null → not identical → return false

2️⃣ isIdentical(root, subRoot):
   - Check if values of current nodes are equal
   - Recursively check left and right subtrees

3️⃣ isSubtree(root, subRoot):
   - If root is null → cannot contain subRoot → return false
   - If root.val == subRoot.val → check if trees are identical
   - Otherwise, recursively check left and right subtrees

=====================================================================================
📊 TIME COMPLEXITY  : O(m * n) → m = nodes in root, n = nodes in subRoot  
📊 SPACE COMPLEXITY : O(h) → recursion stack, h = height of tree
=====================================================================================
*/

package BinaryTrees.SubtreeOfAnotherTree;

public class STOAT {

    // 🔹 Node structure for Binary Tree
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // 🔹 Function to check if two trees are identical
    public boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true; // Both are null → identical
        }

        if (root == null || subRoot == null) {
            return false; // One is null → not identical
        }

        // Check current node value and recurse for left & right subtrees
        if (root.val == subRoot.val) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }

        return false; // Values don't match → not identical
    }

    // 🔹 Function to check if subRoot is a subtree of root
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true; // Empty tree is always a subtree
        }

        if (root == null) {
            return false; // Non-empty subRoot cannot be a subtree of null
        }

        // If current node matches, check for identical trees
        if (root.val == subRoot.val && isIdentical(root, subRoot)) {
            return true;
        }

        // Otherwise, check left and right subtrees recursively
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        STOAT obj = new STOAT();

        // Main tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        // Subtree
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        // Check if subRoot is a subtree of root
        boolean result = obj.isSubtree(root, subRoot);
        System.out.println("✅ Is subRoot a subtree of root? " + result);
    }
}

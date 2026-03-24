/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int minDiff = Integer.MAX_VALUE;
    Integer prev = null;

    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return minDiff;
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;

        // Traverse left subtree
        inOrder(root.left);

        // Process current node
        if (prev != null) {
            int diff = Math.abs(root.val - prev);
            minDiff = Math.min(minDiff, diff);
        }
        prev = root.val;

        // Traverse right subtree
        inOrder(root.right);
    }
}

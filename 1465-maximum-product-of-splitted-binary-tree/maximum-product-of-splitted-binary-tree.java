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
    long totalSum = 0;
    long maxProduct = 0;
    static final int MOD = 1000000007;

    private long dfs(TreeNode root) {
        if(root == null) return 0;

        long left = dfs(root.left);
        long right = dfs(root.right);

        long subTreeSum = root.val + left + right;

        long product = subTreeSum * (totalSum - subTreeSum);
        maxProduct = Math.max(maxProduct, product);

        return subTreeSum;
    }
    public int maxProduct(TreeNode root) {
        totalSum = dfs(root);  // First DFS
        dfs(root);                     // Second DFS
        return (int)(maxProduct % MOD);
        
    }
}
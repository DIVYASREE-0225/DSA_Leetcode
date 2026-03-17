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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        //direction flag 
        boolean lefttoright=true;
        while(!q.isEmpty()){
            //logic   
            int size = q.size();
            List<Integer> zzlevel = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();
                if(lefttoright) zzlevel.addLast(temp.val);
                else zzlevel.addFirst(temp.val);
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
            res.add(zzlevel);
            lefttoright = !lefttoright;
        }
        return res;
    }
}
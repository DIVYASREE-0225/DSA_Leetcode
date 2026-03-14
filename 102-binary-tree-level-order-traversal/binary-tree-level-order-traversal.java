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
/*class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res =new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q=new Linkedlist<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node =q.poll();
                level.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
        }
        
    }
}

void levelOrder(Node root){
    if(root==null) return;
    Queue<Node> q = new Linkedlist<>();
    }
    */
    class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>>al=new ArrayList<>();
        pre(root,0,al);
        return al;
    }
    public static void pre(TreeNode root,int l,List<List<Integer>>al)
    {
        if(root==null)
            return;
        if(al.size()==l)
        {
            List<Integer>li=new ArrayList<>();
            li.add(root.val);
            al.add(li);
        }
        else
            al.get(l).add(root.val);
        pre(root.left,l+1,al);
        pre(root.right,l+1,al);
    } 
}
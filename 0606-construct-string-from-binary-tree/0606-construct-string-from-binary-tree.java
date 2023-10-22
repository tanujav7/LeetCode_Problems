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
    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode root) {
        return dfs(root);
    }
    
    String dfs(TreeNode node){
       if(node==null)
           return "";
        
        sb.append(node.val);
        
        if(node.left!=null){
            sb.append("(");
            dfs(node.left);
            sb.append(")");
        }
        
        if(node.right!=null){
            if(node.left==null)
                sb.append("()");
            sb.append("(");
            dfs(node.right);
            sb.append(")");
        }
        
        return sb.toString();
    }
}
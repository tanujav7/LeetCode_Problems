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
    StringBuilder str = new StringBuilder();
    public String tree2str(TreeNode root) {
        return dfs(root);
    }
    
    String dfs(TreeNode node){
        if(node==null)
            return "";
        
        str.append(node.val);
        
        if(node.left!=null){
            str.append("(");
            dfs(node.left);
            str.append(")");
        }
        
        if(node.right!=null){
            if(node.left==null)
                str.append("()");
            str.append("(");
            dfs(node.right);
            str.append(")");
        }
        
        return str.toString();
    }
}
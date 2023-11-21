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
    public boolean isBalanced(TreeNode root) {
        return checkBalanced(root)!=-1;
    }
    
    int checkBalanced(TreeNode node){
        if(node==null)
            return 0;
        
        int left = checkBalanced(node.left);
        int right = checkBalanced(node.right);
        
        if(left==-1 || right==-1)
            return -1;
        
        if(Math.abs(left-right)>1)
            return -1;
        
        return 1 + Math.max(left, right);
        
    }
}
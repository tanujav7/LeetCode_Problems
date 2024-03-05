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
    public int maxDepth(TreeNode root) {
        
        return maximumDepth(root);
        
    }
    
    int maximumDepth(TreeNode root){
        if(root==null)
            return 0;
        
        return 1 + Math.max(maximumDepth(root.left), maximumDepth(root.right));
    }
}
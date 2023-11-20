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
    int prev = Integer.MAX_VALUE;
    int min = Integer.MAX_VALUE;
    
    public int getMinimumDifference(TreeNode root) {
        getMinDiff(root);
        return min;
    }
    
   void getMinDiff(TreeNode node){
        if(node==null)
            return;
        
        getMinDiff(node.left);
        
        if(prev!=Integer.MAX_VALUE)
            min = Math.min(min, node.val - prev);
        
        prev = node.val;
        
        getMinDiff(node.right);
        
    }
}
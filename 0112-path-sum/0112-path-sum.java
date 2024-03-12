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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return checkPath(root, 0, targetSum);
    }
    
    boolean checkPath(TreeNode node, int currentSum, int targetSum){
        if(node==null)
            return false;
        
        currentSum += node.val;
        
        if(node.left==null && node.right==null && currentSum==targetSum)
            return true;
        
        
        return (checkPath(node.left, currentSum, targetSum) || checkPath(node.right, currentSum, targetSum));
    }
}
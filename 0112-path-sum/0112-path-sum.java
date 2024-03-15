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
        
        return findPathSum(root, 0, targetSum);
    }
    
    boolean findPathSum(TreeNode node, int currentSum, int targetSum){
        if(node==null)
            return false;
        
        currentSum += node.val;
        
        if(node.left==null && node.right==null && currentSum==targetSum){
            return true;
        }
        
        return (findPathSum(node.left, currentSum, targetSum) || findPathSum(node.right, currentSum, targetSum));
    }
}
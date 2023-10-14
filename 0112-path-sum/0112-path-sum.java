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
        if(root==null)
            return false;

        
        return findSumPath(root, 0, targetSum);
    }
    boolean findSumPath(TreeNode node, int currentSum, int targetSum){
        
        if(node==null)
            return false;
        
        currentSum += node.val;
        
        if(node.left==null && node.right==null && currentSum==targetSum)
         return true;
      
        
        return (findSumPath(node.left, currentSum, targetSum) || findSumPath(node.right, currentSum, targetSum));
    }
}
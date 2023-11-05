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
        return findPath(root, 0, targetSum);
    }
    
    boolean findPath(TreeNode node, int sum, int targetSum){
        if(node==null)
            return false;
        
        sum = sum + node.val;
        
        if(node.left==null && node.right==null && sum==targetSum)
            return true;
        
        return findPath(node.left, sum, targetSum) || findPath(node.right, sum, targetSum);
        
    }
}
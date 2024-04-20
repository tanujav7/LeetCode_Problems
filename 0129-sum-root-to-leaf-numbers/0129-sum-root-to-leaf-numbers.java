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
    public int sumNumbers(TreeNode root) {
        return getSumNumbers(root, 0);
    }
    
    int getSumNumbers(TreeNode node, int currentSum){
        if(node==null)
            return 0;
        
        currentSum = currentSum * 10 + node.val;
        
        if(node.left==null && node.right==null)
            return currentSum;
        
        return (getSumNumbers(node.left, currentSum) + getSumNumbers(node.right, currentSum));
    }
}
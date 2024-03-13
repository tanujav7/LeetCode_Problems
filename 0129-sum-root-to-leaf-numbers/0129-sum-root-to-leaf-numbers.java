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
        return sumToRoot(root, 0);
    }
    
    int sumToRoot(TreeNode node, int currentSum){
        if(node==null)
            return 0;
        
        currentSum = currentSum * 10 + node.val;
        
        if(node.left==null && node.right==null)
            return currentSum;  
        
        return (sumToRoot(node.left, currentSum) + sumToRoot(node.right, currentSum));
        
    }
}
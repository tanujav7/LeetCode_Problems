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
        return rootToLeaf(root, 0);
    }
    
    int rootToLeaf(TreeNode node, int currentSum){
        if(node==null)
            return 0;
        
        currentSum = currentSum * 10 + node.val;
        
        if(node.left==null && node.right==null)
            return currentSum;
        
        
        return (rootToLeaf(node.left, currentSum) + rootToLeaf(node.right, currentSum));
    }
}
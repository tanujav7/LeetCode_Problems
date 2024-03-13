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
    int sum = 0;
    
    public int deepestLeavesSum(TreeNode root) {
        
        int maxDepth = maxDepth(root);
        
        deepestSumofLeaves(root, 0, maxDepth);
        
        return sum;
    }
    
    int deepestSumofLeaves(TreeNode node, int len, int maxDepth){
        if(node==null)
            return 0;
        
        len = len + 1;
        
        if(node.left==null && node.right==null && len==maxDepth){
            sum = sum + node.val;
        }
        
        return (deepestSumofLeaves(node.left, len, maxDepth) + deepestSumofLeaves(node.right, len, maxDepth));
    }
    
    int maxDepth(TreeNode node){
        if(node==null)
            return 0;
        
        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }
}
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
        return calculateSum(root, maxDepth, 1, 0);
        //return sum;
    }
    
    int maxDepth(TreeNode node){
        if(node==null)
            return 0;
        
        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }
    
    int calculateSum(TreeNode node, int maxDepth, int depth, int currentSum){
        if(node==null)
            return 0;
        
        if(node.left==null && node.right==null && maxDepth==depth){
            currentSum += node.val;
            return currentSum;
        }
        
        return (calculateSum(node.left, maxDepth, depth+1, currentSum) + calculateSum(node.right, maxDepth, depth+1, currentSum));
    }
}
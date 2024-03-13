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
    
    
    public int deepestLeavesSum(TreeNode root) {
        
        int maxDepth = maxDepth(root);
        int sum = 0;
       return deepestSumofLeaves(root, 0, maxDepth, sum);
        
        //return sum;
    }
    
    int deepestSumofLeaves(TreeNode node, int len, int maxDepth, int sum){
        if(node==null)
            return 0;
        
        len = len + 1;
        
        if(node.left==null && node.right==null && len==maxDepth){
            sum = sum + node.val;
            return sum;
        }
        
        return (deepestSumofLeaves(node.left, len, maxDepth, sum) + deepestSumofLeaves(node.right, len, maxDepth, sum));
    }
    
    int maxDepth(TreeNode node){
        if(node==null)
            return 0;
        
        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }
}
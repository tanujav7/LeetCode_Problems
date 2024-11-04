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
        return getDeepestSum(root, maxDepth, 1, 0);
    }
    
    int maxDepth(TreeNode node){
        if(node==null)
            return 0;
        
        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }
    
    
    int getDeepestSum(TreeNode node, int maxDepth, int len, int sum){
        if(node==null)
            return 0;
        
        if(node.left==null && node.right==null && maxDepth==len){
            sum += node.val;
            return sum;
        }
        
        return (getDeepestSum(node.left, maxDepth, len+1, sum) + getDeepestSum(node.right, maxDepth, len+1, sum));
    }
}
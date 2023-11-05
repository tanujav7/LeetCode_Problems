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
        int level = 1;
        return deepestSum(root, maxDepth, level, 0);
    }
    
    int deepestSum(TreeNode node, int maxLevel, int level, int sum){
        if(node==null)
            return 0;
        
        if(maxLevel==level){
            sum += node.val;
            return sum;
        }
        
        return (deepestSum(node.left, maxLevel, level+1, sum) + deepestSum(node.right, maxLevel, level+1, sum));
        
    }
    
    
    int maxDepth(TreeNode node){
        if(node==null)
            return 0;
        
        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }
    
}
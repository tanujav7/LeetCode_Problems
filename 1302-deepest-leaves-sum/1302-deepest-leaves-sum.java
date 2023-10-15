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
        
        return findSum(root, 1, maxDepth);
    }
    
    int maxDepth(TreeNode node){
        if(node==null)
            return 0;
        
        return 1+Math.max(maxDepth(node.left), maxDepth(node.right));
    }
    
    int findSum(TreeNode node, int level, int maxDepth){
        
        if(node==null)
            return 0;
        
            if(level==maxDepth){
                sum+=node.val;
            }
        
        
        findSum(node.left, level+1, maxDepth);
        findSum(node.right, level+1, maxDepth);
        
        return sum;
    }
}
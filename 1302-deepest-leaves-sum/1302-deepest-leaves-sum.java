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
        getDeepestSum(root, 1, maxDepth);
        return sum;
        
    }
    
    int maxDepth(TreeNode node){
        if(node==null)
            return 0;
        
        return 1+Math.max(maxDepth(node.left), maxDepth(node.right));
    }
    
    void getDeepestSum(TreeNode node, int level, int maxDepth){
        if(node==null)
            return;
        
        if(level==maxDepth)
            sum = sum + node.val;
        
        getDeepestSum(node.left, level+1, maxDepth);
        getDeepestSum(node.right, level+1, maxDepth);
    }
}
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
        calculateSum(root, maxDepth, 1);
        return sum;
    }
    
    int maxDepth(TreeNode node){
        if(node==null)
            return 0;
        
        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }
    
    void calculateSum(TreeNode node, int maxDepth, int depth){
        if(node==null)
            return;
        
        if(node.left==null && node.right==null && maxDepth==depth){
            sum += node.val;
            //return sum;
        }
        
        calculateSum(node.left, maxDepth, depth+1); 
        calculateSum(node.right, maxDepth, depth+1);
    }
}
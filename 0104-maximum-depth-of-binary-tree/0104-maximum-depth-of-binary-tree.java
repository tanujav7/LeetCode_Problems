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
    public int maxDepth(TreeNode root) {
        
        int maximumDepth = getMaxDepth(root);
        
        return maximumDepth;
    }
    
    int getMaxDepth(TreeNode node){
        if(node==null)
            return 0;
        
        return 1 + Math.max(getMaxDepth(node.left), getMaxDepth(node.right));
    }
}
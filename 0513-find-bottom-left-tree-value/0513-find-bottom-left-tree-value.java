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
    int leftVal = 0;
    public int findBottomLeftValue(TreeNode root) {
        
        int maxDepth = maximumDepth(root);
        leftMostVal(root, 1, maxDepth);
        return leftVal;
    }
    
    int maximumDepth(TreeNode node){
        
        if(node==null)
            return 0;
        
        return 1 + Math.max(maximumDepth(node.left), maximumDepth(node.right));
        
    }
    
    void leftMostVal(TreeNode node, int level, int maxDepth){
        
        if(node==null)
            return;
        
        if(maxDepth==level){
            leftVal = node.val;
            return;
        }
        
        leftMostVal(node.right, level+1, maxDepth);
        leftMostVal(node.left, level+1, maxDepth);
        
    }
}
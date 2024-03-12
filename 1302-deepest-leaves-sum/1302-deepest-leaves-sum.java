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
        int maxLen = getMaxDepth(root);
        
        getDeepestSum(root, 0, maxLen);
        return sum;
    }
    
    int getMaxDepth(TreeNode node){
        if(node==null)
            return 0;
        
        return (1 + Math.max(getMaxDepth(node.left), getMaxDepth(node.right)));
    }
    
   void getDeepestSum(TreeNode node, int len, int maxDepth){
        if(node==null)
            return;
        
       len = len + 1;
       
        if(node.left==null && node.right==null && len==maxDepth)
            sum += node.val;
        
        getDeepestSum(node.left, len, maxDepth);
        getDeepestSum(node.right, len, maxDepth);
    }
}
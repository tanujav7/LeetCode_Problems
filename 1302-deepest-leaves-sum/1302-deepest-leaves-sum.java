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
    int resDepth = 0;
    public int deepestLeavesSum(TreeNode root) {
        
        int maxDepth = maxDepth(root);
        
        getDeepestLeavesSum(root, 1, maxDepth);
        
        return resDepth;
    }
    
    int maxDepth(TreeNode node){
        if(node==null)
            return 0;
        
        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }
    
    void getDeepestLeavesSum(TreeNode node, int depth, int maxDepth){
        if(node==null)
            return;
        
        if(node.left==null && node.right==null && depth==maxDepth){
            resDepth = resDepth + node.val;
            return;
        }
        
        getDeepestLeavesSum(node.left, depth+1, maxDepth);
        getDeepestLeavesSum(node.right, depth+1, maxDepth);
    }
}
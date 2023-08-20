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
        int res = calcMaxDepth(root);
        return res;
    }
    
    int calcMaxDepth(TreeNode node){
        if(node==null)
            return 0;
        
        int leftHeight = calcMaxDepth(node.left);
        int rightHeight = calcMaxDepth(node.right);
        
        if(leftHeight>rightHeight)
            return leftHeight+1;
        
        else
            return rightHeight+1;
    }
}
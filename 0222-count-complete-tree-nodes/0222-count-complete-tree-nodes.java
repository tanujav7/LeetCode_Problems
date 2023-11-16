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
    public int countNodes(TreeNode root) {
        return getNumberofNodes(root);
    }
    
    int getNumberofNodes(TreeNode node){
        if(node==null)
            return 0;
        
        return 1 + getNumberofNodes(node.left) + getNumberofNodes(node.right);
    }
}
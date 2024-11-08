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
    TreeNode prevNode = null;
    public void flatten(TreeNode node) {
        
        if(node==null)
            return;
        
        flatten(node.right);
        flatten(node.left);
        node.right = prevNode;
        node.left = null;
        prevNode = node;
        
    }
}
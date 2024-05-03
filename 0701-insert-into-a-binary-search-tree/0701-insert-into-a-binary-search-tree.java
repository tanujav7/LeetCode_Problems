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
    public TreeNode insertIntoBST(TreeNode node, int val) {
        if(node==null)
            return new TreeNode(val);
        
        if(node.val>val)
            node.left = insertIntoBST(node.left, val);
        
        else
            node.right = insertIntoBST(node.right, val);
        
        return node;
    }
}
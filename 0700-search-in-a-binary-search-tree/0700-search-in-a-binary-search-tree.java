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
    public TreeNode searchBST(TreeNode node, int val) {
        
        if(node==null)
            return null;
        
        if(node.val==val)
            return node;
        
        if(node.val>val)
          return searchBST(node.left, val);
        
        else
         return searchBST(node.right, val);
        
    }
}
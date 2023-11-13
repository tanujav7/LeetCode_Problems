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
    public boolean isValidBST(TreeNode root) {
      return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    boolean checkBST(TreeNode node, long min, long max){
        if(node==null)
            return true;

        if (node.val <= min || node.val >= max)
            return false;

        return checkBST(node.left, min, node.val) && checkBST(node.right, node.val, max);
    }
}
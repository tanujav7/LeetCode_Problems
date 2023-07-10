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
    public int minDepth(TreeNode root) {
        return dfs(root);
    }
        private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        // If only one of child is non-null, then go into that recursion.
        if (root.left == null) {
            return 1 + dfs(root.right);
        } else if (root.right == null) {
            return 1 + dfs(root.left);
        }
        
        // Both children are non-null, hence call for both childs.
        return 1 + Math.min(dfs(root.left), dfs(root.right));
    }
}
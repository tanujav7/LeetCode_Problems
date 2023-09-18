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
        return maximumDepth(root);
    }

    int maximumDepth(TreeNode node){
        if(node==null)
        return 0;

        return Math.max(maximumDepth(node.left), maximumDepth(node.right)) + 1;
        
    }
}
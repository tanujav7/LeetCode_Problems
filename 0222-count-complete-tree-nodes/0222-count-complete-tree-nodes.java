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
        int res = countNumNodes(root);
        return res;
    }
    
    int countNumNodes(TreeNode node){
        if(node==null)
            return 0;
        
        return (countNumNodes(node.left) + countNumNodes(node.right) + 1);
    }
}
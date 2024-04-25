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
    public TreeNode invertTree(TreeNode root) {
        
        getInvertTree(root);
        return root;
    }
    
    void getInvertTree(TreeNode node){
        if(node==null)
            return;
        
        swap(node);
        
        getInvertTree(node.left);
        getInvertTree(node.right);
    }
    
    void swap(TreeNode node){
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
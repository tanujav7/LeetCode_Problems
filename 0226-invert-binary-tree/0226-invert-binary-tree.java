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
        
        invertBinaryTree(root);
        
        return root;
    }
    
    void invertBinaryTree(TreeNode node){
        if(node==null)
            return;
        
        swapNode(node);
        
        invertBinaryTree(node.left);
        invertBinaryTree(node.right);
    }
    
    
    void swapNode(TreeNode node){
        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
    }
}
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
    public boolean isCompleteTree(TreeNode root) {
        int totalNodes = countNodes(root);
        return checkCompleteTree(root, 1, totalNodes);
    }
    
    int countNodes(TreeNode node){
        if(node==null)
            return 0;
        
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
    
    boolean checkCompleteTree(TreeNode node, int current, int totalNodes){
        if(node==null)
            return true;
        
        if(current>totalNodes)
            return false;
        
        
        return checkCompleteTree(node.left, 2 * current, totalNodes) && checkCompleteTree(node.right, 2 * current + 1, totalNodes);
    }
}
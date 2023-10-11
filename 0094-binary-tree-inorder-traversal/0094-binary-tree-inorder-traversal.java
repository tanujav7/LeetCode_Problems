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
    List<Integer> resList = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrderTraversal(root);
        return resList;
    }
    
    void inOrderTraversal(TreeNode node){
        if(node==null)
            return;
        
        inOrderTraversal(node.left);
        resList.add(node.val);
        inOrderTraversal(node.right);
    }
}
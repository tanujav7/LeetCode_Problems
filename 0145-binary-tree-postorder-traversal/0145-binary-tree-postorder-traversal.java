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
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrderTraversal(root);
        return resList;
    }
    
    void postOrderTraversal(TreeNode node){
        if(node==null)
            return;
        
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        resList.add(node.val);
    }
}
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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrderTraversal(root);
        return resList;
    }
    
   void preOrderTraversal(TreeNode node){
        if(node==null)
            return;
        
         resList.add(node.val);
         preOrderTraversal(node.left);
         preOrderTraversal(node.right);
        
    }
}
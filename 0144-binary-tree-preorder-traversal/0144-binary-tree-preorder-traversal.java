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
    
     List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
       
         PreOrderTraversal(root);
        return list;
    }
    
    
    void PreOrderTraversal(TreeNode node){

    if(node==null)
        return;
        
        list.add(node.val);
        PreOrderTraversal(node.left);
        PreOrderTraversal(node.right);
        
    
    }
}
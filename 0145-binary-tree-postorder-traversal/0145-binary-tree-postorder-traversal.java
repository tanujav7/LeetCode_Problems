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
    
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrderTreeTraversal(root);
        return list;
    }
    
    void postOrderTreeTraversal(TreeNode node){
        if(node==null)
          return;

        postOrderTreeTraversal(node.left);
        postOrderTreeTraversal(node.right);
        list.add(node.val);
        
    }
    
}
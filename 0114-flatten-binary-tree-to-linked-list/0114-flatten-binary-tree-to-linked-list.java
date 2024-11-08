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
    public void flatten(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        
        if(root==null)
            return;
        
        while(!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            
            if(currentNode.right!=null)
                stack.add(currentNode.right);
            
            if(currentNode.left!=null)
                stack.add(currentNode.left);
            
            if(!stack.isEmpty())
                currentNode.right = stack.peek();
            
            currentNode.left = null;
            
        }
        
        
    }
}
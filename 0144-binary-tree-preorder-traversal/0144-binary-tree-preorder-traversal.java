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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        if(root==null)
            return list;
        
        stack.add(root);
        
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            
            list.add(node.val);
            
            if(node.right!=null)
                stack.add(node.right);
            
            if(node.left!=null)
                stack.add(node.left);
            
        }
        
        return list;
    }
}
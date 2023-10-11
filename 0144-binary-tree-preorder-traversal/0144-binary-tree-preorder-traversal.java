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
        
        
        List<Integer> resList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        if(root==null)
            return resList;
        
        stack.add(root);
        
        while(!stack.isEmpty()){
            TreeNode tempNode = stack.pop();
            
             if(tempNode!=null)
             resList.add(tempNode.val);
            
            if(tempNode.right!=null)
                stack.push(tempNode.right);
            
            if(tempNode.left!=null)
                stack.push(tempNode.left);
        }
        
        return resList;
    }
}
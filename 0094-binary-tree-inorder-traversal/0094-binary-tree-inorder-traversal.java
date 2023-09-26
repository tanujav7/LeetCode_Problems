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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        if(root==null)
            return list;
        
        TreeNode currentNode = root;
        
        while(!stack.isEmpty() || currentNode!=null){
            
            while(currentNode!=null){
                stack.add(currentNode);
                currentNode = currentNode.left;
            }
            
            currentNode = stack.pop();
            list.add(currentNode.val);
            currentNode = currentNode.right;
        }
        
        
        return list;
    }
}
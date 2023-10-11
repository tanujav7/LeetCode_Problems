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
        
         List<Integer> resList = new ArrayList<>();
         Stack<TreeNode> stack = new Stack<>();
              
        TreeNode currentNode = root;
        
        while(!stack.isEmpty() || currentNode!=null){
            
            while(currentNode!=null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            
            currentNode = stack.pop();
            
            resList.add(currentNode.val);
            
            currentNode = currentNode.right;
        }
        
        return resList;
    }
}
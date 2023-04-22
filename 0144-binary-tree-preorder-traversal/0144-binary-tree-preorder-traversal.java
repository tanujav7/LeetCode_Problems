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
        List<Integer> res = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            if(currentNode!=null){
                res.add(currentNode.val);
                stack.push(currentNode.right);
                stack.push(currentNode.left);
            }
        }
        
        return res;
    }

}
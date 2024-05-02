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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode currentNode = root;
        
        if(root==null)
            return new TreeNode(val);
        while(true){
            if(currentNode.val>val){
                if(currentNode.left==null){
                    currentNode.left = new TreeNode(val);
                    break;
                }
                else
                    currentNode = currentNode.left;
            }
            
            else{
                if(currentNode.right==null){
                    currentNode.right = new TreeNode(val);
                    break;
                }
                else
                    currentNode = currentNode.right;
            }
        }
        
        return root;
    }
}
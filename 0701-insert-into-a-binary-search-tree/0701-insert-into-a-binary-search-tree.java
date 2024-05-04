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
    public TreeNode insertIntoBST(TreeNode node, int val) {
        
        if(node==null)
            return new TreeNode(val);
        
        TreeNode currentNode = node;
        
        while(currentNode!=null){
            if(currentNode.val>val){
                if(currentNode.left!=null)
                    currentNode = currentNode.left;
                else{
                    currentNode.left = new TreeNode(val);
                    break;
                }
            }
            
            else{
                if(currentNode.right!=null)
                    currentNode = currentNode.right;
                else{
                    currentNode.right = new TreeNode(val);
                    break;
                }
            }
        }
        
        
        return node;
    }
}
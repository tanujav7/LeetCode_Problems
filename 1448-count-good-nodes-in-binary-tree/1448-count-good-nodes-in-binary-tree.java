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
    int count = 0;
    public int goodNodes(TreeNode root) {
        getGoodNodes(root, root.val);
        return count;
    }
    
    void getGoodNodes(TreeNode node, int val){
        if(node==null)
            return;
        
        if(node.val>=val){
           val = node.val;
           count++;
        }
           
        
        
        getGoodNodes(node.left, val);
        getGoodNodes(node.right, val);
    }
}
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
        
       getGoodNodes(root, Integer.MIN_VALUE);
        return count;
    }
    
    void getGoodNodes(TreeNode node, int maxVal){
        if(node==null)
            return;
        
        if(node.val>=maxVal){
            maxVal = node.val;
            count++;
        }
        
         getGoodNodes(node.left, maxVal);
         getGoodNodes(node.right, maxVal);
    }
}
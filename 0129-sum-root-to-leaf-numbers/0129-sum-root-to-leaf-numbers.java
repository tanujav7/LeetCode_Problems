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
    int sum = 0;
    
    public int sumNumbers(TreeNode root) {
        getSumRoot(root, 0);
        return sum;
    }
    
    void getSumRoot(TreeNode node, int currVal){
        if(node==null)
            return;
        
        currVal = currVal * 10 + node.val;
        
        if(node.left==null && node.right==null){
            sum += currVal;
            return;
        }
        
        getSumRoot(node.left, currVal);
        getSumRoot(node.right, currVal);
    }
}
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
    int resSum = 0;
    public int sumNumbers(TreeNode root) {
        getSumRoot(root, 0);
        return resSum;
    }
    
    void getSumRoot(TreeNode node, int sum){
        if(node==null)
            return;
        
        sum = sum * 10 + node.val;
        
        if(node.left==null && node.right==null){
            resSum += sum;
            return;
        }
        
        getSumRoot(node.left, sum);
        getSumRoot(node.right, sum);
    }
}
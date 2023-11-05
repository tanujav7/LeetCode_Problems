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
    public int sumNumbers(TreeNode root) {
        return sumNum(root, 0);
    }
    
    int sumNum(TreeNode node, int sum){
        if(node==null)
            return 0;
        
        sum = sum * 10 + node.val;
        
        if(node.left==null && node.right==null)
            return sum;
        
        return sumNum(node.left, sum) + sumNum(node.right, sum);
    }
}
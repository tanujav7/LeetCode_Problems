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
    int res = 0;
    
    public int kthSmallest(TreeNode root, int k) {
       getKthSmallest(root, k);
        return res;
    }
    
    void getKthSmallest(TreeNode node, int k){
        if(node==null)
            return;
        
        getKthSmallest(node.left, k);
        
        count++;
        
        if(count==k)
            res = node.val;
        
         getKthSmallest(node.right, k);
       
    }
}
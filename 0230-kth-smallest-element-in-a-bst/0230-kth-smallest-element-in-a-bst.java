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
        getKth(root, k);
        return res;
    }
    
    void getKth(TreeNode node, int k){
        if(node==null)
            return;
        
        
        getKth(node.left, k);
        
        count++;
        
        if(count==k){
            res = node.val;
        }
        
        getKth(node.right, k);
        
    }
}
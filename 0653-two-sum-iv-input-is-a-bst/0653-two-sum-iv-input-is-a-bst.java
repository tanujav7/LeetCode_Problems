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
    Set<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        return twoSum(root, k);
    }
    
    boolean twoSum(TreeNode node, int k){
        if(node==null)
            return false;
        
        if(set.contains(k-node.val))
            return true;
        
        set.add(node.val);
        
        return (twoSum(node.left, k) || twoSum(node.right, k));
    }
}
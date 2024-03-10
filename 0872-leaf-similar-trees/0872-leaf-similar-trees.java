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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        getLeaves(root1, l1);
        getLeaves(root2, l2);
        
        return l1.equals(l2);
    }
    
    void getLeaves(TreeNode node, List<Integer> list){
        if(node==null)
            return;
        
        if(node.left==null && node.right==null)
            list.add(node.val);
        
        getLeaves(node.left, list);
        getLeaves(node.right, list);
        
    }
}
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
        
        getLeafNodes(root1, l1);
        getLeafNodes(root2, l2);
        
        return l1.equals(l2);
        
    }
    
    void getLeafNodes(TreeNode node, List<Integer> list){
        if(node==null)
            return;
        
        if(node.left==null && node.right==null)
            list.add(node.val);
        
        getLeafNodes(node.left, list);
        getLeafNodes(node.right, list);
    }
}
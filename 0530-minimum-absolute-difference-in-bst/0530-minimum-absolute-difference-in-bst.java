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
    List<Integer> list = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        inorderTraversal(root, list);
        int res = Integer.MAX_VALUE;
        
        for(int i=1; i<list.size(); i++){
            res = Math.min(res, list.get(i)-list.get(i-1));
        }
        
        return res;
    }
    
    void inorderTraversal(TreeNode node, List<Integer> list){
        if(node==null)
            return;
        
        inorderTraversal(node.left, list);
        list.add(node.val);
        inorderTraversal(node.right, list);
    }
}
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
    public int kthSmallest(TreeNode root, int k) {
        getInorderTraversal(root);
        return list.get(k-1);
    }
    
    void getInorderTraversal(TreeNode node){
        if(node==null)
            return;
        
        getInorderTraversal(node.left);
        list.add(node.val);
        getInorderTraversal(node.right);
    }
}
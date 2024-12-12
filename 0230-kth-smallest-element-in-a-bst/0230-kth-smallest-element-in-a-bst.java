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
        inorderTraversal(root);
        for(int i=0; i<list.size(); i++){
            if(i+1==k)
                return list.get(i);
        }
        
        return -1;
    }
     void inorderTraversal(TreeNode node){
        if(node==null)
            return;
        
        inorderTraversal(node.left);
        list.add(node.val);
        inorderTraversal(node.right);
    }
}
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
     List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        
        //List<String> res = new ArrayList<>();
        String s = "";
        if(root==null)
            return res;
        getPaths(root, s);
        return res;
    }
    
    void getPaths(TreeNode node, String s){
        if(node==null)
            return;
        
        if(node.left==null && node.right==null){
            res.add(s+node.val);
            return;
        }
        
        getPaths(node.left, s+node.val+"->");
        getPaths(node.right, s+node.val+"->");        
    }
}
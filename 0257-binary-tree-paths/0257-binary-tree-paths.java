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
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        
        if(root==null)
            return list;
        
        getPaths(root, "");
        
        return list;
    }
    
    void getPaths(TreeNode node, String s){
        if(node==null)
            return;
        
        s = s + node.val;
        
        if(node.left==null && node.right==null)
            list.add(s);
        
        getPaths(node.left, s+"->");
        getPaths(node.right, s+"->");
    }
}
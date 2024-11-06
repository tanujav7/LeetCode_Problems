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
    List<String> list;
    public List<String> binaryTreePaths(TreeNode root) {
        list = new ArrayList<>();
        dfs(root, "");
        return list;
    }
    
    void dfs(TreeNode node, String s){
        if(node==null)
            return;
        
        s = s + node.val + "->";
        
        if(node.left==null && node.right==null){
            list.add(s.substring(0, s.length()-2));
        }
        
        dfs(node.left, s);
        dfs(node.right, s);
    }
}
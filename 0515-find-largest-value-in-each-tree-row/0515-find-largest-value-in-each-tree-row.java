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
    List<Integer> resList;
    public List<Integer> largestValues(TreeNode root) {
        resList = new ArrayList<>();
        dfs(root, 0);
        return resList;
    }
    
    void dfs(TreeNode node, int depth){
        
        if(node==null)
            return;
        
        if(depth==resList.size())
            resList.add(node.val);
        
        else
            resList.set(depth, Math.max(node.val, resList.get(depth)));
        
        dfs(node.left, depth+1);
        
        dfs(node.right, depth+1);    
        
    }
}
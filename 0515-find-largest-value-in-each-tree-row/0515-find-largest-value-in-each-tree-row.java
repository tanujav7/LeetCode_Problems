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
    List<Integer> list;
    public List<Integer> largestValues(TreeNode root) {
        list = new ArrayList<>();
        dfs(root, 0);
        return list;
    }
    
    void dfs(TreeNode node, int depth){
        if(node==null)
            return;
        
        if(depth==list.size())
            list.add(node.val);
        
        else{
            list.set(depth, Math.max(list.get(depth), node.val));
        }
        
        dfs(node.left, depth+1);
        dfs(node.right, depth+1);
    }
}
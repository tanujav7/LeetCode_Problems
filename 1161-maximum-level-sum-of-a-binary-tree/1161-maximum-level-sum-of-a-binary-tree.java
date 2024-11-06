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
    public int maxLevelSum(TreeNode root) {
        dfs(root, 0);
        int val = Integer.MIN_VALUE;
        int maxValIndex = 0;
        for(int i=0; i<list.size(); i++){
            if(val<list.get(i)){
                val = list.get(i);
                maxValIndex = i+1;
            }
        }
        
        return maxValIndex;
    }
    
    void dfs(TreeNode node, int depth){
        if(node==null)
            return;
        
        if(list.size()==depth){
            list.add(node.val);
        }
        
        else{
            list.set(depth, list.get(depth)+node.val);
        }
        
        dfs(node.left, depth+1);
        dfs(node.right, depth+1);
    }
}
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
    public int maxLevelSum(TreeNode root) {
        
        List<Integer> sumofNodesAtLevel = new ArrayList<>();
        
        dfs(root, 0, sumofNodesAtLevel);
        
        int maxSum = Integer.MIN_VALUE;
        
        int level = 0;
        
        for(int i=0; i<sumofNodesAtLevel.size(); i++){
            if(maxSum<sumofNodesAtLevel.get(i)){
                maxSum = sumofNodesAtLevel.get(i);
                level = i+1;
            }
        }
        
        return level;
    }
    
    
    void dfs(TreeNode node, int level, List<Integer> sumofNodesAtLevel){
        if(node==null)
            return;
        
        if(sumofNodesAtLevel.size()==level){
            sumofNodesAtLevel.add(node.val);
        }
        
        else{
            sumofNodesAtLevel.set(level, sumofNodesAtLevel.get(level)+node.val);
        }
        
        dfs(node.left, level+1, sumofNodesAtLevel);
        dfs(node.right, level+1, sumofNodesAtLevel);
    }
}
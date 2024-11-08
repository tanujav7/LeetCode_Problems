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
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, 0, targetSum, new ArrayList<>());
        return resList;
    }
    
    void dfs(TreeNode node, int currentSum, int targetSum, List<Integer> list){
        if(node==null)
            return;
        
        currentSum += node.val;
        
        list.add(node.val);
        
        if(node.left==null && node.right==null && currentSum==targetSum){
            resList.add(new ArrayList<>(list));
        }
        
        dfs(node.left, currentSum, targetSum, list);
        dfs(node.right, currentSum, targetSum, list);
        
        list.remove(list.size()-1);
    }
}
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
    List<List<Integer>> resList;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        resList = new ArrayList<>();
        getPathSum(root, 0, targetSum, new ArrayList<>());
        return resList;
    }
    
    void getPathSum(TreeNode node, int currentSum, int targetSum, List<Integer> path){
        if(node==null)
            return;
        
        currentSum = currentSum + node.val;
        
        path.add(node.val);
        
        if(node.left==null && node.right==null && targetSum==currentSum){
            resList.add(new ArrayList<>(path));
        }
        
        else{
            getPathSum(node.left, currentSum, targetSum, path);
            getPathSum(node.right, currentSum, targetSum, path);
        }
        
        path.remove(path.size()-1);
    }
}
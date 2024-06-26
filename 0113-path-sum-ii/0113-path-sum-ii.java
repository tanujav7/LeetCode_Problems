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
        
        if(root==null)
            return resList;
        
        getPathSum(root, 0, targetSum, new ArrayList<>());
        return resList;
    }
    
    void getPathSum(TreeNode node, int currentSum, int targetSum, List<Integer> list){
        if(node==null)
            return;
        
        list.add(node.val);
        
        currentSum += node.val;
        
        if(node.left==null && node.right==null && currentSum==targetSum){
            resList.add(new ArrayList<>(list));
            //return;
        }
        
        else{
        getPathSum(node.left, currentSum, targetSum, list);
        getPathSum(node.right, currentSum, targetSum, list);
        }
        
        list.remove(list.size()-1);
    }
}
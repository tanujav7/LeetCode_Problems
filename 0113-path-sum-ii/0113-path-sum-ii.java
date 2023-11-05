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
        getPathSum(root, 0, targetSum, new ArrayList<>());
        return resList;
    }
    
    void getPathSum(TreeNode node, int sum, int targetSum, List<Integer>list){
        if(node==null)
            return;
        
        sum += node.val;
        list.add(node.val);
        
        if(node.left==null && node.right==null && sum==targetSum){
            resList.add(new ArrayList<>(list));
           // return;
        }
        
        else{
            getPathSum(node.left, sum, targetSum, list);
            getPathSum(node.right, sum, targetSum, list);
        }
        
        list.remove(list.size()-1);
    }
}
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
        List<Integer> list = new ArrayList<>();
        getLevelSum(root, list, 0);
        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 0;
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>maxSum){
                maxSum = list.get(i);
                maxLevel = i+1;
            }
        }
        
        return maxLevel;
    }

    void getLevelSum(TreeNode node, List<Integer> list, int level){
        if(node==null)
            return;
        
        if(list.size()==level){
            list.add(node.val);
        }
        
        else{
            list.set(level, list.get(level)+node.val);
        }
        
        getLevelSum(node.left, list, level+1);
        getLevelSum(node.right, list, level+1);
    }
}
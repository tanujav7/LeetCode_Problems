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
    public int maxLevelSum(TreeNode root) {
        list = new ArrayList<>();
        getMaxLevel(root, 0);
        
        int maxLevel = 0, maxVal = Integer.MIN_VALUE;
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>maxVal){
                maxVal = list.get(i);
                maxLevel = i+1;
            }
        }
        
        return maxLevel;
    }
    
    void getMaxLevel(TreeNode node, int level){
        if(node==null)
            return;
        
        if(list.size()==level){
            list.add(node.val);
        }
        
        else{
            list.set(level, list.get(level)+node.val);
        }
        
        getMaxLevel(node.left, level+1);
        getMaxLevel(node.right, level+1);
    }
}
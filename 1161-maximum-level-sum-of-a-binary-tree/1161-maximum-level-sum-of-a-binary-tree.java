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
        
        getMaxLevelSum(root, 0, list);
        
        int index = 0;
        
        int maxVal = Integer.MIN_VALUE;
        
        for(int i=0; i<list.size(); i++){
            if(maxVal<list.get(i)){
                maxVal = list.get(i);
                index = i+1;
            }
        }
        
        return index;
    }
    
    void getMaxLevelSum(TreeNode node, int depth, List<Integer> list){
        if(node==null)
            return;
        
        if(list.size()==depth){
            list.add(node.val);
        }
        
        else{
            list.set(depth, list.get(depth) + node.val);
        }
        
        getMaxLevelSum(node.left, depth+1, list);
        getMaxLevelSum(node.right, depth+1, list);
    }
}
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
        
        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 0;
        int level = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            int currentSum = 0;
            for(int i=0; i<size; i++){
                TreeNode currentNode = queue.remove();
                currentSum += currentNode.val;
                if(currentNode.left!=null)
                    queue.add(currentNode.left);
                
                if(currentNode.right!=null)
                    queue.add(currentNode.right);
            }
            if(currentSum>maxSum){
                maxSum = currentSum;
                maxLevel = level;
            }
            level++;
        }
        
        return maxLevel;
    }
}
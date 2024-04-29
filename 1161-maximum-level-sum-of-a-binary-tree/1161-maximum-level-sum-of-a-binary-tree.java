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
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        int maxVal = Integer.MIN_VALUE;
        int depth = 0;
        int maxLevel = 0;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            int sum = 0;
            ++depth;
            for(int i=0; i<size; i++){
                TreeNode currentNode = queue.remove();
                
                sum += currentNode.val;
                if(currentNode.left!=null)
                    queue.add(currentNode.left);
                
                 if(currentNode.right!=null)
                    queue.add(currentNode.right);
            }
        
            if(sum>maxVal){
                maxVal = sum;
                maxLevel = depth;
            }
        }
        
        return maxLevel;
    }
}
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
    public int deepestLeavesSum(TreeNode root) {
        
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            sum = 0;
            for(int i=0; i<size; i++){
                TreeNode currentNode = queue.remove();
                sum = sum + currentNode.val;
                
                if(currentNode.left!=null)
                    queue.add(currentNode.left);
                
                if(currentNode.right!=null)
                    queue.add(currentNode.right);
            }
        }
        
        return sum;
    }
}
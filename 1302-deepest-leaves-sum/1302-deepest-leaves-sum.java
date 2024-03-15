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
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        int sum = 0;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            sum = 0;
            for(int i=0; i<size; i++){
                TreeNode current = queue.remove();
                sum += current.val;
                
                if(current.left!=null)
                    queue.add(current.left);
                
                 if(current.right!=null)
                    queue.add(current.right);
                
            }
        }
        
        return sum;
    }
}
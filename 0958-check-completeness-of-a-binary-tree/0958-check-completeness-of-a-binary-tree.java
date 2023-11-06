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
    public boolean isCompleteTree(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
              TreeNode temp = queue.remove();
                 if(temp==null)
                    break;
            queue.add(temp.left);
            queue.add(temp.right);
        }
             
        
        
        while(!queue.isEmpty() && queue.peek()==null)
            queue.poll();
        
        return queue.isEmpty();
    }
}
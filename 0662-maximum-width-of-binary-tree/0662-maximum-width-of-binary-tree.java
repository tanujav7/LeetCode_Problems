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
    public int widthOfBinaryTree(TreeNode root) {
        
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        
        queue.offer(new Pair(root, 1));
        int maxWidth = 0;
        
        while(!queue.isEmpty()){
            int l = queue.peek().getValue();
            int r = l;
            int size = queue.size();
            
            for(int i=0; i<size; i++){
                TreeNode current = queue.peek().getKey();
                r = queue.poll().getValue();
                
                if(current.left!=null)
                   queue.add(new Pair(current.left, 2*r));
                
                if(current.right!=null)
                   queue.add(new Pair(current.right, 2*r+1));
            }
            
            maxWidth = Math.max(maxWidth, r-l+1);
        }
        
        return maxWidth;
    }
}
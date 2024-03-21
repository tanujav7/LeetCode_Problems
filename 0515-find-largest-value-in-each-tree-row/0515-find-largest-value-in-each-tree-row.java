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
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> resList = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        if(root==null)
            return resList;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            int max = queue.peek().val;
            
            for(int i=0; i<size; i++){
                TreeNode current = queue.poll();
                
                max = Math.max(max, current.val);
                
                if(current.left!=null)
                    queue.add(current.left);
                
                 if(current.right!=null)
                    queue.add(current.right);
            }
            
            resList.add(max);
        }
        
        return resList;
    }
}
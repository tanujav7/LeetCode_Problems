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
        
        List<Integer> list = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        if(root==null)
            return list;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            
            int max = queue.peek().val;
            
            for(int i=0; i<size; i++){
                TreeNode current = queue.remove();
                
                max = Math.max(max, current.val);
                
                if(current.left!=null)
                    queue.add(current.left);
                
                if(current.right!=null)
                    queue.add(current.right);
            }
            
            list.add(max);
        }
        
        
        return list;
    }
}
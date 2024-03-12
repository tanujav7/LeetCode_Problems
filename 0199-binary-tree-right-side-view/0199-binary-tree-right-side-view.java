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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        if(root==null)
            return list;
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i=0; i<size; i++){
                TreeNode current = queue.remove();
                
                if(i==0)
                    list.add(current.val);
                
                 if(current.right!=null)
                    queue.add(current.right);
                
                
                if(current.left!=null)
                    queue.add(current.left);
            }
        }
        
        return list;
    }
}
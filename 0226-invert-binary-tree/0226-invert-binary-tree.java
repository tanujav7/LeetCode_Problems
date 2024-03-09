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
    public TreeNode invertTree(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        if(root==null)
            return null;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i=0; i<size; i++){
                TreeNode current = queue.remove();
                
                swapNode(current);
                
                if(current.left!=null)
                    queue.add(current.left);
                
                if(current.right!=null)
                    queue.add(current.right);
            }
        }
        
         return root;
    }
    
    void swapNode(TreeNode node){
        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
    }
}
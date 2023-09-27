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
            TreeNode tempNode = queue.remove();
            
            if(tempNode!=null)
                swap(tempNode);
            
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            
             if(tempNode.right!=null)
                queue.add(tempNode.right);
            
        }
        
        return root;
    }

    void swap(TreeNode node){
        
        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
        
    }
}
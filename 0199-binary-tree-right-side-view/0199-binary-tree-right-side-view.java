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
        
        if(root==null)
            return list;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode currentNode = queue.remove();
                if(i==0)
                    list.add(currentNode.val);
                
                if(currentNode.right!=null)
                    queue.add(currentNode.right);
                
                if(currentNode.left!=null)
                    queue.add(currentNode.left);
                
                
            }
        }
        
        return list;
    }
}
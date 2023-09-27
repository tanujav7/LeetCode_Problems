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
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        ArrayList<List<Integer>> resList = new ArrayList<>();
        
        if(root==null)
            return resList;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            
            List<Integer> list = new ArrayList<>();
            
            for(int i=0; i<size; i++){
            
            TreeNode tempNode = queue.remove();
            
            if(tempNode!=null)
            list.add(tempNode.val);
            
            if(tempNode.left!=null)
            queue.add(tempNode.left);
            
            if(tempNode.right!=null)
            queue.add(tempNode.right);
            }
           
            resList.add(list);
        }
        
        return resList;
    }
}
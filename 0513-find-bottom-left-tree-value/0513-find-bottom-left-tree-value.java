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
    public int findBottomLeftValue(TreeNode root) {
                
        Queue<TreeNode> queue = new LinkedList<>();
        
        int leftValue = 0;
        
        if(root==null)
            return 0;
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
           // List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode temp = queue.remove();
                
                if(i==0)
                    leftValue = temp.val;
                
             //   list.add(temp.val);
                
                if(temp.left!=null)
                    queue.add(temp.left);
                
                if(temp.right!=null)
                    queue.add(temp.right);
            }
            
           
        }
        
        return leftValue;
    }
}